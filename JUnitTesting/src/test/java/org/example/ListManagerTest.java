package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {
    static ListManager manager ;
    static List<Integer> list;
    @BeforeEach
    void setup(){
        manager = new ListManager();
        list = new ArrayList<>();
    }
    @Test
    void testAdd(){
        manager.addElement(list,10);
        assertTrue(list.contains(10),"Element should be added");
    }
    @Test
    void testRemove(){
        manager.addElement(list,10);
        manager.removeElement(list,10);
        assertFalse(list.contains(10),"Element should be removed");
    }
    @Test
    void testSize(){
        manager.addElement(list,30);
        assertEquals(list.size(),manager.getSize(list));
    }

}