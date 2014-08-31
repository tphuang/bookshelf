package com.thoughtworks.bookshelf.util;

public class UserInfoEmptyException extends Exception{
    public UserInfoEmptyException(){
        super();
    }
    public UserInfoEmptyException(String msg){
        super(msg);
    }
    public UserInfoEmptyException(String msg, Throwable throwable){
        super(msg, throwable);
    }
    public UserInfoEmptyException(Throwable throwable){
        super(throwable);
    }
}
