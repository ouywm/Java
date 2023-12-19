package com.itheima.exception;

public class StudentAgeException extends RuntimeException {

    public StudentAgeException() {
    }

    //                          输入的年龄范围有误
    public StudentAgeException(String message) {
        super(message);
    }
}
