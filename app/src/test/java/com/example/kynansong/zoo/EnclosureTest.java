package com.example.kynansong.zoo;

/**
 * Created by kynansong on 10/11/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class EnclosureTest {

    Cassowray cassowray, cassowray2, cassowray3;
    Capybara capybara;
    ShoebillStork shoebillStork;
    Enclosure<Cassowray> enclosure;
    Enclosure<ShoebillStork> enclosure2;

    @Before
    public void before() {
        cassowray = new Cassowray("Jeff", 4000);
        cassowray2 = new Cassowray("Fiona", 6000);
        cassowray3 = new Cassowray("Ragnar", 2000);
        capybara = new Capybara("Olive", 2000);
        enclosure = new Enclosure();
        enclosure2 = new Enclosure();
    }

    @Test
    public void testNoAnimals() {
        assertEquals(0, enclosure.animalCount());
    }

    @Test
    public void testCanAddAnimalCassowray() {
        enclosure.addAnimal(cassowray);
        assertEquals(1, enclosure.animalCount());

    }@Test
    public void testCanAddAnimalShoebill() {
        enclosure2.addAnimal(shoebillStork);
        assertEquals(1, enclosure2.animalCount());
    }
//
//    @Test
//    public void testCanAddAnimalFail() {              //Testing to see if a different animal type can be added to an enclosure.
//        this.enclosure.addAnimal(capybara);
//        assertEquals(0, enclosure.animalCount());
//    }

    @Test
    public void testCanRemoveAnimal() {
        enclosure.addAnimal(cassowray);
        assertEquals(1, enclosure.animalCount());
        enclosure.removeAnimal(cassowray);
        assertEquals(0, enclosure.animalCount());
    }

    @Test
    public void testCanGetEnclosureList() {

    }

    @Test
    public void testAnimalCashValueCassowray() {
        enclosure.addAnimal(cassowray);
        enclosure.addAnimal(cassowray2);
        enclosure.addAnimal(cassowray3);
        assertEquals(3, enclosure.animalCount());
        assertEquals(12000, enclosure.totalEnclosureValue(), 0.01);

    }

    @Test
    public void testCanFindAnimalByName() {
        enclosure.addAnimal(cassowray);
        enclosure.addAnimal(cassowray2);
        enclosure.addAnimal(cassowray3);
        assertEquals(3, enclosure.animalCount());
        assertEquals(this.cassowray2, enclosure.getAnimalByName("Fiona"));

    }
}
