package com.thoughtworks.bookshelf.service;


import com.thoughtworks.bookshelf.model.BookInfo;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
//
        Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);// 注册json 支持
        WebTarget target = client.target("https://api.douban.com/v2/book/1220562");
        Response response = target.request().get();
        BookInfo bookInfo = (BookInfo) response.readEntity(BookInfo.class);
        System.out.println(bookInfo.getTitle());
        System.out.println(bookInfo.getImages().getLarge());
        response.close();

    }

    public App(String url) {
//        DefaultHttpClient client = new DefaultHttpClient();
//        HttpGet get = new HttpGet(url);
//        HttpResponse response = client.execute(get);
//        HttpEntity entity = response.getEntity();
//        InputStream is = entity.getContent();
//        BookInfo book = new BookXMLParser(is).getBook();
//        System.out.println("title:->" + book.getTitle());
//        System.out.println("summary:->"+ book.getSummary());
//        System.out.println("price:-->" + book.getPrice());
//        System.out.println("author:-->" + book.getAuthor());
//        System.out.println("ImagePath:-->" + book.getImagePath());
    }

}