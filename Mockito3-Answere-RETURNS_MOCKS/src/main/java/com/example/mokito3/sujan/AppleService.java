package com.example.mokito3.sujan;

public class AppleService {
    private Apple apple;

    public Apple getApple() {
        return apple;
    }

    public class Apple {
        private Macintosh macintosh;

        public Macintosh getMacintosh() {
            return macintosh;
        }
    }

    public class Macintosh {
    }
}