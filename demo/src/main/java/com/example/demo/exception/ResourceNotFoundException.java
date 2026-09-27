package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);//Bu mesajı RuntimeException'a iletir,kayıt tutar
    }
}
