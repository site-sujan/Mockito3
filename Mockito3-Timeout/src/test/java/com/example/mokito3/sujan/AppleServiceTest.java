package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Duration;
import java.time.Instant;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;


    @Test
    void saveAppleWithStaticMockTest() throws InterruptedException {
        AppleService appleService = mock(AppleService.class);
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        Instant start = Instant.now();
        appleService.saveApple("Macintosh");
        Thread.currentThread().sleep(5000);
        appleService.saveApple("Macintosh");
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: to run method " + timeElapsed.toMillis() + " milliseconds");
        verify(appleService, timeout(1000).atLeast(2)).saveApple("Macintosh");
        end = Instant.now();
        timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: to complete test case " + timeElapsed.toMillis() + " milliseconds");
    }

    @Test
    void saveAppleWithAnnotationMockTest() throws InterruptedException {
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        Instant start = Instant.now();
        appleService.saveApple("Macintosh");
        Thread.currentThread().sleep(5000);
        appleService.saveApple("Macintosh");
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: to run method " + timeElapsed.toMillis() + " milliseconds");
        verify(appleService, timeout(1000).atLeast(2)).saveApple("Macintosh");
        end = Instant.now();
        timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: to complete test case " + timeElapsed.toMillis() + " milliseconds");
    }
}