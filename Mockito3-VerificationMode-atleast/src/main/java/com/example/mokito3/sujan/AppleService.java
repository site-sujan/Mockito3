package com.example.mokito3.sujan;

public class AppleService {
    public String saveApple(String apple) {
        System.out.println("i love " + apple + " apple");
        return apple;
    }

    public String processApple(String apple) {
        System.out.println("i eat " + apple + " apple");
        return apple;
    }
}