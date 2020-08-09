package com.example.mokito3.sujan;

import java.util.ArrayList;
import java.util.List;

public class AppleService {
    List<String> appleList = new ArrayList<>();

    public final String getApple(int appleIndx) {
        System.out.println("AppleService.getApple: appleIndx = " + appleIndx);
        return appleList.get(appleIndx);
    }
}