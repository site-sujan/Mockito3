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
    private SaveAppleService saveAppleService;
    @Mock
    private GetAppleService getAppleService;

    @Test
    void saveAppleWithStaticMockTest() {
        SaveAppleService saveAppleService = mock(SaveAppleService.class);
        GetAppleService getAppleService = mock(GetAppleService.class);
        InOrder inOrder = inOrder(saveAppleService, getAppleService);
        saveAppleService.saveApple("Macintosh");
        getAppleService.getApple("Macintosh");
        inOrder.verify(saveAppleService).saveApple("Macintosh");
        inOrder.verify(getAppleService).getApple("Macintosh");
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        InOrder inOrder = inOrder(saveAppleService, getAppleService);
        saveAppleService.saveApple("Macintosh");
        getAppleService.getApple("Macintosh");
        inOrder.verify(saveAppleService).saveApple("Macintosh");
        inOrder.verify(getAppleService).getApple("Macintosh");
    }
}