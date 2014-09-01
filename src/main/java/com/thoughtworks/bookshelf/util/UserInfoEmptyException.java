package com.thoughtworks.bookshelf.util;

public class UserInfoEmptyException extends Exception{
    public UserInfoEmptyException(){
        super();
    }
    public UserInfoEmptyException(String msg){
        super(msg);
    }

    //异常链
    public UserInfoEmptyException(String msg, Throwable cause){
        super(msg, cause);
    }
    public UserInfoEmptyException(Throwable cause){
        super(cause);
    }
}
