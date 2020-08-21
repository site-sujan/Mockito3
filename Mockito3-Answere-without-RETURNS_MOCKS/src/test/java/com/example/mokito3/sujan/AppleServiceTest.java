package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        AppleService.Apple apple = appleService.getApple();
        AppleService.Apple apple1 = appleService.getApple();
        System.out.println("apple = " + apple);
        System.out.println("apple1 = " + apple1);
        Assertions.assertEquals(apple, apple1);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        AppleService.Apple apple = appleService.getApple();
        AppleService.Apple apple1 = appleService.getApple();
        System.out.println("apple = " + apple);
        System.out.println("apple1 = " + apple1);
        Assertions.assertEquals(apple, apple1);
    }
}