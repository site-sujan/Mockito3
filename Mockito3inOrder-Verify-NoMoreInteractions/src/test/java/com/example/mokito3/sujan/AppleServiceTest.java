package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.inOrder;


@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void inOrderVerifyNoMoreInteractions() {
        InOrder inOrder = inOrder(appleService);
        appleService.saveApple("Macintosh");
        appleService.getApple("Macintosh");
        inOrder.verify(appleService).saveApple("Macintosh");
        inOrder.verify(appleService).getApple("Macintosh");
        inOrder.verifyNoMoreInteractions();
    }
}