package com.example;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


@Component("messageService")
public class MyNameMessageService implements MessageService {
    private String name = "Jakub Pietrzko";
    @Override
    public String getMessage() {
        return this.name;
    }
}