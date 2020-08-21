package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Answers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(answer = RETURNS_DEEP_STUBS)
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, RETURNS_DEEP_STUBS);
        when(appleService.getApple().getMacintosh().getAppleName()).thenReturn("i love apple");
        assertEquals("i love apple", appleService.getApple().getMacintosh().getAppleName());
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.getApple().getMacintosh().getAppleName()).thenReturn("i love apple");
        assertEquals("i love apple", appleService.getApple().getMacintosh().getAppleName());
    }
}