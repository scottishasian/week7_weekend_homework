package com.example.kynansong.zoo;

/**
 * Created by kynansong on 12/11/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Zoo zoo;

    @Before
    public void before() {
        visitor = new Visitor("Shonna", 40.50);
        zoo = new Zoo();
    }

    @Test
    public void testCanGetName() {
        assertEquals("Shonna", visitor.getName());
    }

    @Test
    public void testCanGetCash() {
        assertEquals(40.50, visitor.getCash());
    }
}
