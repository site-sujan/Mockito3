package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;
    @Mock
    private AppleService.Apple apple;
    @Mock
    private AppleService.Macintosh macintosh;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        AppleService.Apple apple = mock(AppleService.Apple.class);
        AppleService.Macintosh macintosh = mock(AppleService.Macintosh.class);
        when(appleService.getApple()).thenReturn(apple);
        when(apple.getMacintosh()).thenReturn(macintosh);
        when(macintosh.getAppleName()).thenReturn("i love apple");
        when(appleService.getApple().getMacintosh().getAppleName()).thenReturn("i love apple");
        assertEquals("i love apple", appleService.getApple().getMacintosh().getAppleName());
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.getApple()).thenReturn(apple);
        when(apple.getMacintosh()).thenReturn(macintosh);
        when(macintosh.getAppleName()).thenReturn("i love apple");
        when(appleService.getApple().getMacintosh().getAppleName()).thenReturn("i love apple");
        assertEquals("i love apple", appleService.getApple().getMacintosh().getAppleName());
    }
}