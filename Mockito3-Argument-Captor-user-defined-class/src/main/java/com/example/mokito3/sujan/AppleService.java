package com.example.mokito3.sujan;

public abstract class AppleService {
    String saveApple(Apple apple) {
        String appleString = "apple No is:- " + apple.getAppleNo() + " apple Name is:- " + apple.getAppleName();
        return appleString;
    }
}