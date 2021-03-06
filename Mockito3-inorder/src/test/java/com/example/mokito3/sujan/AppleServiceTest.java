package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class);
        InOrder inOrder = inOrder(appleService);
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        inOrder.verify(appleService).saveApple("Macintosh");
        inOrder.verify(appleService).getApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        InOrder inOrder = inOrder(appleService);
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        inOrder.verify(appleService).saveApple("Macintosh");
        inOrder.verify(appleService).getApple("Macintosh");
    }
}