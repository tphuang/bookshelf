package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


@Controller
@RequestMapping("/")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("download")
    public ModelAndView download(@RequestParam("fileRelativePath") String fileRelativePath, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        String ctxPath = request.getSession().getServletContext().getRealPath(
                "/") + "/";
        String downLoadPath = ctxPath + fileRelativePath;
        fileService.downLoadFile(downLoadPath, response, bis, bos);
        return null;
    }


}
