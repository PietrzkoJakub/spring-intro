package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomTextMessageService implements MessageService{

    public List<String> messages = new ArrayList<String>(){{
        add("mess1");
        add("mess2");
        add("mess3");
        add("mess4");
        add("mess5");
        add("mess6");
        add("mess7");
        add("mess8");
        add("mess9");
        add("mess10");
    }};
    @Override
    public String getMessage() {
        int randomNumber = new Random().nextInt(9 + 1);
        return this.messages.get(randomNumber);
    }
}
