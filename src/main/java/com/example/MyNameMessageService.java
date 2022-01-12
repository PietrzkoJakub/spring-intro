package com.example;

public class MyNameMessageService implements MessageService {
    private String name = "Jakub Pietrzko";
    @Override
    public String getMessage() {
        return this.name;
    }
}
