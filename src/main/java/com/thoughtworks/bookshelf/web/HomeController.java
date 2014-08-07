package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private FileService fileService;

    @Autowired
    private ServletContext context;

    @RequestMapping("home")
    public String loadHomePage(Model model) {
        try {
            String imagesPath = context.getRealPath("/images");
            System.out.println("****" + imagesPath);
            List<File> imageFiles = fileService.readFile(imagesPath);
            model.addAttribute("imageFiles", imageFiles);
            model.addAttribute("contextPath", context.getRealPath("/") + "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("name", "Tingpeng");

        return "home";
    }

    @RequestMapping("/download/{fileName}")
    public ModelAndView download(@PathVariable("fileName")
                                 String fileName, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        System.out.println("fileName: " +fileName);
        String ctxPath = request.getSession().getServletContext().getRealPath(
                "/")+"/images/";
        String downLoadPath = ctxPath + fileName;
        System.out.println("ctxPath: " +ctxPath);
        System.out.println("downLoadPath: " +downLoadPath);
        try {
            long fileLength = new File(downLoadPath).length();
            response.setContentType("application/x-msdownload;");
            response.setHeader("Content-disposition", "attachment; filename="
                    + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
            response.setHeader("Content-Length", String.valueOf(fileLength));
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return null;
    }

}
