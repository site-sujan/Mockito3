package com.example.mokito3.sujan;

public class AppleService {
    public String processApple(String appleName) {
        String message = "i love " + appleName + " Apple";
        System.out.println("message = " + message);
        return message;
    }

    public String saveApple(String appleName) {
        String message = "i like " + appleName + " Apple";
        System.out.println("message = " + message);
        return message;
    }
}