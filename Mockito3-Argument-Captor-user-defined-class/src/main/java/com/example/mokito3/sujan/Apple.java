package com.example.mokito3.sujan;

import java.util.Objects;

public class Apple {
    private int appleNo;
    private String appleName;

    public Apple(int appleNo, String appleName) {
        this.appleNo = appleNo;
        this.appleName = appleName;
    }

    public int getAppleNo() {
        return appleNo;
    }

    public String getAppleName() {
        return appleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return appleNo == apple.appleNo &&
                Objects.equals(appleName, apple.appleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appleNo, appleName);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleNo=" + appleNo +
                ", appleName='" + appleName + '\'' +
                '}';
    }
}
