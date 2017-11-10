package com.example.kynansong.zoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kynansong on 10/11/2017.
 */

public class CassowrayTest {

    Cassowray cassowray;

    @Before
    public void before(){
        this.cassowray = new Cassowray("Susan", 5000.20);
    }

    @Test
    public void testGetAnimalName() {
        assertEquals("Susan", cassowray.getAnimalName());
    }

    @Test
    public void testGetAnimalValue() {
        assertEquals(5000.20, cassowray.getAnimalValue());
    }

    @Test
    public void testSetAnimalName() {
        cassowray.setAnimalName("Barbara");
        assertEquals("Barbara", cassowray.getAnimalName());
    }

    @Test
    public void testSetAnimalValue() {
        cassowray.setAnimalValue(6213.60);
        assertEquals(6213.60, cassowray.getAnimalValue());
    }
}
