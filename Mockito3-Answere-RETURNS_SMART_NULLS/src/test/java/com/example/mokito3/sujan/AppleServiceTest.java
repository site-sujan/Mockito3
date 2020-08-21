package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Answers.RETURNS_SMART_NULLS;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(answer = RETURNS_SMART_NULLS)
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, RETURNS_SMART_NULLS);
        String appleName = appleService.saveApple("Macintosh");
        System.out.println("saveAppleWithStaticMockTest appleName = " + appleName);
        /* will not throw null pointer exception */
        System.out.println("saveAppleWithStaticMockTest appleName = " + appleName.toUpperCase());
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        String appleName = appleService.saveApple("Macintosh");
        System.out.println("saveAppleWithAnnotationMockTest appleName = " + appleName);
        /* will not throw null pointer exception */
        System.out.println("saveAppleWithAnnotationMockTest appleName = " + appleName.toUpperCase());
    }
}