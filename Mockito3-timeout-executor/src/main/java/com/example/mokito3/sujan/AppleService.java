package com.example.mokito3.sujan;

public class AppleService {
    public String saveApple(String apple) throws InterruptedException {
        System.out.println("i love " + apple + " apple");
        Thread.sleep(50000);
        return apple;
    }
}