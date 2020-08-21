package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Answers.RETURNS_DEFAULTS;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(answer = RETURNS_DEFAULTS)
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, RETURNS_DEFAULTS);
        String appleName = appleService.saveApple("Macintosh");
        System.out.println("saveAppleWithStaticMockTest appleName = " + appleName);
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        String appleName = appleService.saveApple("Macintosh");
        System.out.println("saveAppleWithAnnotationMockTest appleName = " + appleName);
    }
}