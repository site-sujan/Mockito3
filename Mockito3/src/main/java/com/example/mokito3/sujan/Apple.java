package com.example.mokito3.sujan;

public class Apple {
    private String appleName;

    public Apple(String appleName) {
        this.appleName = appleName;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleName='" + appleName + '\'' +
                '}';
    }
}
