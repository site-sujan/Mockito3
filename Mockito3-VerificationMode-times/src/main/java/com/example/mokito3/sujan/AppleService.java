package com.example.mokito3.sujan;

import java.util.Objects;

public class AppleService {
    public String processApple(String apple) {
        System.out.println("AppleService.processApple: it will process Apple = " + apple);
        String AppleRes;
        if (Objects.isNull(apple)) {
            AppleRes = saveNullApple(apple);
        } else {
            AppleRes = saveApple(apple);
        }
        return AppleRes;
    }

    public String saveNullApple(String apple) {
        System.out.println("AppleService.saveNullApple: it will process then save Apple = " + apple);
        return apple;
    }

    public String saveApple(String apple) {
        System.out.println("AppleService.saveApple: it will process then save Apple = " + apple);
        return apple;
    }
}