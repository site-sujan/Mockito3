package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Answers.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock(answer = RETURNS_DEEP_STUBS)
    private AppleService appleService;

    @Test
    void saveAppleWithStaticMockTest() {
        AppleService appleService = mock(AppleService.class, RETURNS_DEEP_STUBS);
        when(appleService.getApple("Macintosh").getMacintosh().getAppleName()).thenReturn("i love apple");
        when(appleService.getApple("Fuji").getMacintosh().getAppleName()).thenReturn("i love apple");
        appleService.getApple("Macintosh").getMacintosh().getAppleName();
        appleService.getApple("Fuji").getMacintosh().getAppleName();
        InOrder inOrder = inOrder(appleService.getApple("Macintosh").getMacintosh(),
                appleService.getApple("Fuji").getMacintosh());
        inOrder.verify(appleService.getApple("Macintosh").getMacintosh(), times(1)).getAppleName();
        inOrder.verify(appleService.getApple("Fuji").getMacintosh(), atLeast(1)).getAppleName();
    }

    @Test
    void saveAppleWithAnnotationMockTest() {
        when(appleService.getApple("Macintosh").getMacintosh().getAppleName()).thenReturn("i love apple");
        when(appleService.getApple("Fuji").getMacintosh().getAppleName()).thenReturn("i love apple");
        appleService.getApple("Macintosh").getMacintosh().getAppleName();
        appleService.getApple("Fuji").getMacintosh().getAppleName();
        InOrder inOrder = inOrder(appleService.getApple("Macintosh").getMacintosh(),
                appleService.getApple("Fuji").getMacintosh());
        inOrder.verify(appleService.getApple("Macintosh").getMacintosh(), times(1)).getAppleName();
        inOrder.verify(appleService.getApple("Fuji").getMacintosh(), atLeast(1)).getAppleName();
    }
}