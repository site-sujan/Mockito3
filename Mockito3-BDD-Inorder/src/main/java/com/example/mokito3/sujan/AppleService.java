package com.example.mokito3.sujan;

public class AppleService {

    public String saveApple(String apple) {
        String appleString = "i love " + apple + " apple";
        return appleString;
    }

    public String haveApple(int appleCount) {
        String appleString = "i have " + appleCount + " apple";
        return appleString;
    }

    public String eatApple(String apple) {
        String appleString = "i eat " + apple + " apple";
        return appleString;
    }
}