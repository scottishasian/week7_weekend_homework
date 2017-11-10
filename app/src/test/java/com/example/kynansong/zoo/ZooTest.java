package com.example.kynansong.zoo;

/**
 * Created by kynansong on 10/11/2017.
 */
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ZooTest {

    Zoo zoo;
    Enclosure<Cassowray> enclosure;

    @Before
    public void before() {
        zoo = new Zoo();
    }

    @Test
    public void testZooIsEmpty() {
        assertEquals(0, zoo.enclosureCount());
    }
}
