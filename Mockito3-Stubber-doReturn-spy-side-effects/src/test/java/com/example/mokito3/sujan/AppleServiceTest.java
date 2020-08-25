package com.example.mokito3.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppleServiceTest {

    @Test
    void saveAppleWithStaticMockTest() {
        List<String> appleList = spy(LinkedList.class);
        when(appleList.get(0)).thenReturn("Macintosh");
        String apple = appleList.get(0);
        Assertions.assertEquals("Macintosh", apple);
    }
}