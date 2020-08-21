package com.example.mokito3.sujan;

public class AppleService {
    public String saveApple(String apple) {
        String appleString = "i love " + apple + " apple";
        System.out.println("AppleService.saveApple:- appleString = " + appleString);
        return appleString;
    }

    public String getApple(String apple) {
        String appleString = "i eat " + apple + " apple";
        System.out.println("AppleService.getApple:- appleString = " + appleString);
        return appleString;
    }
}