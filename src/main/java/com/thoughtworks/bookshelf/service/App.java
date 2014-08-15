package com.thoughtworks.bookshelf.service;


import com.thoughtworks.bookshelf.model.BookInfo;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        String url1 = "https://api.douban.com/v2/book/2123092";
        String url2 = "https://api.douban.com/v2/book/user/73684180/collections";
        Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);// 注册json 支持
        WebTarget target = client.target(url2);
        Response response = target.request().get();
        ArrayList<BookInfo> bookInfos = new ArrayList<BookInfo>();

        Map<String, Object> doubanCollectionsMap = response.readEntity(Map.class);
        List<Map> collectionsList = (List<Map>) doubanCollectionsMap.get("collections");
        for (int i= 0; i<collectionsList.size();i++){
            BookInfo bookInfo = new BookInfo();
            Map<String, Object> colletionMap = (Map) collectionsList.get(i);
            Map<String, Object> bookInfoMap = (Map<String, Object>) colletionMap.get("book");
            Map<String, String> imagesMap = (Map) bookInfoMap.get("images");
            System.out.println(i + "\t" + (String) bookInfoMap.get("title") + "\t" + (String) imagesMap.get("large"));

            bookInfo.setTitle((String) bookInfoMap.get("title"));
            bookInfo.setImagePath(imagesMap.get("large"));
            System.out.println("The title is: " + bookInfo.getTitle());
            System.out.println("The path is: " + bookInfo.getImagePath());
            bookInfos.add(bookInfo);
        }
            System.out.println(bookInfos.get(0));
        System.out.println("over!");
        response.close();

    }


}