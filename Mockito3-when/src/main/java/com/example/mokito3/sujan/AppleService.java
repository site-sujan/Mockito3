package com.example.mokito3.sujan;

import java.util.Objects;

public class AppleService {
    public String processApple(String appleName) {
        if (Objects.isNull(appleName)) {
            return "apple object is null";
        } else return "apple name is " + appleName;
    }
}