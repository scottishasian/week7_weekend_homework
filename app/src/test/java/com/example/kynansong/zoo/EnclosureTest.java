package com.example.kynansong.zoo;

/**
 * Created by kynansong on 10/11/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class EnclosureTest {

    Cassowray cassowray;
    Enclosure enclosure;

    @Before
    public void before() {
        cassowray = new Cassowray("Jeff", 4000);
        enclosure = new Enclosure();
    }

    @Test
    public void testNoAnimals() {
        assertEquals(0, enclosure.animalCount());
    }

    @Test
    public void testCanAddAnimal() {
        enclosure.addAnimal(cassowray);
        assertEquals(1, enclosure.animalCount());
    }

    @Test
    public void testCanRemoveAnimal() {
        enclosure.addAnimal(cassowray);
        assertEquals(1, enclosure.animalCount());
        enclosure.removeAnimal(cassowray);
        assertEquals(0, enclosure.animalCount());
    }
}
