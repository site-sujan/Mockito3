package com.example.mokito3.sujan;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppleService {

    public String processApple(Collection appleName) {
        return "I love " + appleName + " Apple";
    }

    public String processApple(List appleName) {
        return "I love " + appleName + " Apple";
    }

    public String processApple(Map appleName) {
        return "I love " + appleName + " Apple";
    }

    public String processApple(Set appleName) {
        return "I love " + appleName + " Apple";
    }

    public String processApple(Iterable appleName) {
        return "I love " + appleName + " Apple";
    }
}