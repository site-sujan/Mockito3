package com.example.mokito3.sujan;

public class AppleService {
    public String saveApple(String apple) {
        String appleString = "i love " + apple + " apple";
        System.out.println("appleString = " + appleString);
        return appleString;
    }
}