package com.example.mokito3.sujan;

public class AppleService {

    public Apple saveApple(Apple apple) {
        System.out.println("AppleService.saveApple: it will process then save apple = " + apple);
        return apple;
    }
}