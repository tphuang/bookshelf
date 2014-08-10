package com.thoughtworks.bookshelf.service;


import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        new App("http://api.douban.com/book/subject/isbn/9787308083256");

    }

    public App(String url){
//        DefaultHttpClient client = new DefaultHttpClient();
//        HttpGet get = new HttpGet(url);
//        HttpResponse response = client.execute(get);
//        HttpEntity entity = response.getEntity();
//        InputStream is = entity.getContent();
//        DoubanBookInfo book = new BookXMLParser(is).getBook();
//        System.out.println("title:->" + book.getTitle());
//        System.out.println("summary:->"+ book.getSummary());
//        System.out.println("price:-->" + book.getPrice());
//        System.out.println("author:-->" + book.getAuthor());
//        System.out.println("ImagePath:-->" + book.getImagePath());
    }

}