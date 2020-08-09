package com.example.mokito3.sujan;

public interface AppleService {
    default String saveApple(String apple) {
        String appleString = "i love " + apple + " apple";
        return appleString;
    }
}