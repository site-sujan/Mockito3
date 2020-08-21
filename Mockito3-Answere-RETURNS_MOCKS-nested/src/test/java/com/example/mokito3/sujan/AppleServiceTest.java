package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Answers.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(answer = RETURNS_MOCKS)
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, RETURNS_MOCKS);
        AppleService.Apple apple = appleService.getApple();
        AppleService.Apple apple1 = appleService.getApple();
        System.out.println("apple = " + apple);
        System.out.println("apple1 = " + apple1);
        Assertions.assertNotEquals(apple, apple1);
        System.out.println("apple.Macintosh = " + apple.getMacintosh());
        System.out.println("apple1.Macintosh = " + apple1.getMacintosh());
        Assertions.assertNotEquals(apple.getMacintosh(), apple1.getMacintosh());
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        AppleService.Apple apple = appleService.getApple();
        AppleService.Apple apple1 = appleService.getApple();
        System.out.println("apple = " + apple);
        System.out.println("apple1 = " + apple1);
        Assertions.assertNotEquals(apple, apple1);
        System.out.println("apple.Macintosh = " + apple.getMacintosh());
        System.out.println("apple1.Macintosh = " + apple1.getMacintosh());
        Assertions.assertNotEquals(apple.getMacintosh(), apple1.getMacintosh());
    }
}