package com.study.ex_01.exception;

public class OutOfStockException extends RuntimeException{

    public OutOfStockException(String message){
        super(message);
    }
}
