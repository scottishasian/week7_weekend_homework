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
    Enclosure<Capybara> enclosure2;
    Enclosure<ShoebillStork> enclosure3;
    Cassowray cassowray, cassowray2;
    Capybara capybara;
    ShoebillStork shoebillStork, shoebillStork2;

    @Before
    public void before() {
        zoo = new Zoo();
        enclosure = new Enclosure();
        enclosure2 = new Enclosure();
        enclosure3 = new Enclosure();
        cassowray = new Cassowray("Fiona", 6500.20);
        cassowray2 = new Cassowray("Jeff", 4000.00);
        capybara = new Capybara("Olive", 3400.90);
        shoebillStork = new ShoebillStork("Bruce", 2000.50);
        shoebillStork2 = new ShoebillStork("Anna", 2000.50);
    }

    @Test
    public void testZooIsEmpty() {
        assertEquals(0, zoo.enclosureCount());
    }

    @Test
    public void testAddEnclosure() {
        zoo.addEnclosure(enclosure);
        assertEquals(1, zoo.enclosureCount());
    }

    @Test
    public void testRemoveEnclosure() {
        zoo.addEnclosure(enclosure);
        assertEquals(0, zoo.enclosureCount());
        zoo.removeEnclosure(enclosure);
        assertEquals(0, zoo.enclosureCount());
    }
}
