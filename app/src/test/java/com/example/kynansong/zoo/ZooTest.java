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
    Visitor visitor;
    Enclosure<Cassowray> enclosure;
    Enclosure<Capybara> enclosure2;
    Enclosure<ShoebillStork> enclosure3;
    Cassowray cassowray, cassowray2;
    Capybara capybara;
    ShoebillStork shoebillStork, shoebillStork2;

    @Before
    public void before() {
        zoo = new Zoo();
        visitor = new Visitor("Shonna", 40.50);
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
    public void testCanGetTicketPrice() {
        assertEquals(5.99, zoo.getTicketPrice(5.99));
    }

    @Test
    public void testAddEnclosure() {
        zoo.addEnclosure(enclosure);
        assertEquals(1, zoo.enclosureCount());
    }

    @Test
    public void testRemoveEnclosure() {
        zoo.addEnclosure(enclosure);
        assertEquals(1, zoo.enclosureCount());
        zoo.removeEnclosure(enclosure);
        assertEquals(0, zoo.enclosureCount());
    }

    @Test
    public void testCanGetTotalAnimalCashValue() {
        zoo.addEnclosure(enclosure);
        zoo.addEnclosure(enclosure2);
        zoo.addEnclosure(enclosure3);
        enclosure.addAnimal(cassowray);
        enclosure.addAnimal(cassowray2);
        enclosure2.addAnimal(capybara);
        enclosure3.addAnimal(shoebillStork);
        enclosure3.addAnimal(shoebillStork2);
        assertEquals(17902.10, zoo.totalAnimalCashValue(), 0.01);
    }

    @Test
    public void testCanCountAnimals() {
        zoo.addEnclosure(enclosure);
        zoo.addEnclosure(enclosure2);
        zoo.addEnclosure(enclosure3);
        enclosure.addAnimal(cassowray);
        enclosure.addAnimal(cassowray2);
        enclosure2.addAnimal(capybara);
        enclosure3.addAnimal(shoebillStork);
        enclosure3.addAnimal(shoebillStork2);
        assertEquals(5, zoo.totalAnimals());

    }

    @Test
    public void testCanGetFunds() {
        assertEquals(0, zoo.getFunds(), 0.01);
    }

    @Test
    public void testHasNoVisitors() {
        assertEquals(0, zoo.visitorCount());
    }

    @Test
    public void testZooHasAVisitor() {
        zoo.visitorBuysTicket(visitor, 5.99);
        assertEquals(5.99, zoo.getFunds(), 0.01);
        assertEquals(34.51, visitor.getCash(), 0.01);
        assertEquals(1, visitor.ticketCount());

    }

//    @Test
//    public void testCanSellAnimals() {
//        zoo.addEnclosure(enclosure);
//        zoo.addEnclosure(enclosure2);
//        zoo.addEnclosure(enclosure3);
//        enclosure.addAnimal(cassowray);
//        enclosure.addAnimal(cassowray2);
//        enclosure2.addAnimal(capybara);
//        enclosure3.addAnimal(shoebillStork);
//        enclosure3.addAnimal(shoebillStork2);
//        assertEquals(17902.10, zoo.totalAnimalCashValue(), 0.01);
//        zoo.sellAnimal("Olive");
//        assertEquals(4, zoo.totalAnimals());
//        assertEquals(14501.20, zoo.totalAnimalCashValue(), 0.01);
//        assertEquals(3400.90, zoo.getFunds());
//
//    }
}
