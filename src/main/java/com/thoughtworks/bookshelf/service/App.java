package com.thoughtworks.bookshelf.service;


import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);// 注册json 支持
        WebTarget target = client.target("https://api.douban.com/v2/book/2123092");
        Response response = target.request().get();
        Map<String, Object> bookInfo = response.readEntity(Map.class);
        Map images = (Map) bookInfo.get("images");
        System.out.println(bookInfo.get("title"));
        System.out.println(images.get("large"));
        response.close();

    }



}