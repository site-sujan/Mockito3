package com.example.mokito3.sujan;

public class AppleService {
    public String saveApple(String apple) {
        String appleString = "i love " + apple + " apple";
        return appleString;
    }

    public String getApple(String apple) {
        String appleString = "i eat " + apple + " apple";
        return appleString;
    }
}