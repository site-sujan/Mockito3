package com.example.mokito3.sujan;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppleServiceTest {
    @Test
    void saveAppleWithMockTest() {
        AppleService appleService = mock(AppleService.class);
        when(appleService.processApple(ArgumentMatchers.anyCollection())).thenReturn("its a collection");
        when(appleService.processApple(ArgumentMatchers.anyList())).thenReturn("its a list");
        when(appleService.processApple(ArgumentMatchers.anyMap())).thenReturn("its a map");
        when(appleService.processApple(ArgumentMatchers.anySet())).thenReturn("its a set");
        when(appleService.processApple(ArgumentMatchers.anyIterable())).thenReturn("its an iterable");
        Collection collection = new ArrayList();
        List list = new ArrayList<>();
        Map map = new HashMap();
        Set set = new HashSet();
        Iterable iterable = new ArrayList();
        assertEquals("its a collection", appleService.processApple(collection));
        assertEquals("its a list", appleService.processApple(list));
        assertEquals("its a map", appleService.processApple(map));
        assertEquals("its a set", appleService.processApple(set));
        assertEquals("its an iterable", appleService.processApple(iterable));
    }
}