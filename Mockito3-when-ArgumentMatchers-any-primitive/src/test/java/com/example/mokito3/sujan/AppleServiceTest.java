package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple(ArgumentMatchers.anyBoolean())).thenReturn("its a boolean");
        when(appleService.processApple(ArgumentMatchers.anyByte())).thenReturn("its a byte");
        when(appleService.processApple(ArgumentMatchers.anyChar())).thenReturn("its a char");
        when(appleService.processApple(ArgumentMatchers.anyDouble())).thenReturn("its a double");
        when(appleService.processApple(ArgumentMatchers.anyInt())).thenReturn("its an int");
        when(appleService.processApple(ArgumentMatchers.anyFloat())).thenReturn("its a float");
        when(appleService.processApple(ArgumentMatchers.anyLong())).thenReturn("its a long");
        when(appleService.processApple(ArgumentMatchers.anyShort())).thenReturn("its a short");
        assertEquals("its a boolean", appleService.processApple(true));
        assertEquals("its a byte", appleService.processApple((byte) 1));
        assertEquals("its a char", appleService.processApple('a'));
        assertEquals("its a double", appleService.processApple((double) 1));
        assertEquals("its an int", appleService.processApple(1));
        assertEquals("its a float", appleService.processApple(1f));
        assertEquals("its a long", appleService.processApple((long) 1));
        assertEquals("its a short", appleService.processApple((short) 1));
    }
}