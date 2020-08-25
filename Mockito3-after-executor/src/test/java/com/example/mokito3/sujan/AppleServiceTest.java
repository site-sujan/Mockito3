package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.mockito.Mockito.after;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        Instant testCaseStart = Instant.now();
        runWithMultiThread(appleService, "Macintosh");
        Instant testCaseEnd = Instant.now();
        Duration testCaseDuration = Duration.between(testCaseStart, testCaseEnd);
        System.out.println("Time taken: to run mock method " + testCaseDuration.toMillis() + " milliseconds");
        Instant verifyStart = Instant.now();
        verify(appleService, after(100).atLeast(2)).saveApple("Macintosh");
        Instant verifyEnd = Instant.now();
        Duration verifyDuration = Duration.between(verifyStart, verifyEnd);
        testCaseDuration = Duration.between(testCaseStart, verifyEnd);
        System.out.println("additional time taken by verify is " + verifyDuration.toMillis() + " milliseconds, total time to complete test case " + testCaseDuration.toMillis() + " milliseconds");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.saveApple("Macintosh")).thenReturn("i have apple");
        Instant testCaseStart = Instant.now();
        runWithMultiThread(appleService, "Macintosh");
        Instant testCaseEnd = Instant.now();
        Duration testCaseDuration = Duration.between(testCaseStart, testCaseEnd);
        System.out.println("Time taken: to run mock method " + testCaseDuration.toMillis() + " milliseconds");
        Instant verifyStart = Instant.now();
        verify(appleService, after(100).atLeast(2)).saveApple("Macintosh");
        Instant verifyEnd = Instant.now();
        Duration verifyDuration = Duration.between(verifyStart, verifyEnd);
        testCaseDuration = Duration.between(testCaseStart, verifyEnd);
        System.out.println("additional time taken by verify is " + verifyDuration.toMillis() + " milliseconds, total time to complete test case " + testCaseDuration.toMillis() + " milliseconds");
    }

    void runWithMultiThread(AppleService appleService, String appleName) {
        IntStream.rangeClosed(1, 5).forEach(i -> executorService.execute(() -> {
            try {
                appleService.saveApple(appleName);
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        executorService.shutdown();
    }
}