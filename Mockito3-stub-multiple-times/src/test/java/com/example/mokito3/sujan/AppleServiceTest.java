package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithMockTest() {
        when(appleService.processApple("Macintosh")).thenReturn("i eat macintosh apple");
        IntStream.rangeClosed(1, 5).forEach(value -> {
            String apple = appleService.processApple("Macintosh");
            assertEquals("i eat macintosh apple", apple);
        });
    }
}