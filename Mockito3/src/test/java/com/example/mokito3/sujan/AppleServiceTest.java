package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class AppleServiceTest {
    @Test
    void saveAppleWithoutMockTest() {
        AppleService appleService = new AppleService();
        Apple apple = new Apple("macintosh");
        appleService.saveApple(apple);
    }

    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        Apple apple = new Apple("macintosh");
        appleService.saveApple(apple);
    }
}