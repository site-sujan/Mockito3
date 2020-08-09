package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {
    @Mock
    private AppleService appleService;

    @Test
    void appleMockTest() {
        InOrder inOrder = inOrder(appleService);
        appleService.saveApple("Macintosh");
        appleService.haveApple(2);
        appleService.eatApple("Macintosh");
        appleService.eatApple("Macintosh");
        then(appleService).should(inOrder).saveApple("Macintosh");
        then(appleService).should(inOrder).haveApple(2);
        then(appleService).should(inOrder, times(2)).eatApple("Macintosh");
    }
}