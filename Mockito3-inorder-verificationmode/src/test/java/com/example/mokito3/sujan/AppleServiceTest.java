package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;


@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService saveAppleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService saveAppleService = mock(AppleService.class);
        InOrder inOrder = inOrder(saveAppleService);
        saveAppleService.saveApple("Macintosh");
        saveAppleService.saveApple("Macintosh");
        inOrder.verify(saveAppleService, times(2)).saveApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        InOrder inOrder = inOrder(saveAppleService);
        saveAppleService.saveApple("Macintosh");
        saveAppleService.saveApple("Macintosh");
        inOrder.verify(saveAppleService, times(2)).saveApple("Macintosh");
    }
}