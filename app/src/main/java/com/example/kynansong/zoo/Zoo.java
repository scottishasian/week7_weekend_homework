package com.example.kynansong.zoo;

import java.util.ArrayList;

/**
 * Created by kynansong on 10/11/2017.
 */

public class Zoo<E extends Enclosure> {

    private ArrayList<E> cages;
    private double funds;
    private double ticketPrice;

    public Zoo(){
        this.cages = new ArrayList();
        this.funds = 0;
        this.ticketPrice = 5.99;
    }

    public int enclosureCount() {
        return this.cages.size();
    }

    public void addEnclosure(E Enclosure) {
        this.cages.add(Enclosure);
    }

    public double getTicketPrice() {
        return this.ticketPrice;
    }

    public void removeEnclosure(E Enclosure) {
        this.cages.remove(Enclosure);
    }

    public double totalAnimalCashValue() {
        double total = 0;
        for(E enclosure : cages) {
            total += enclosure.totalEnclosureValue();
        }
        return total;
    }


    public int totalAnimals() {
        int total = 0;
        for(E enclosure : cages) {
            total += enclosure.animalCount();
        }
        return total;
    }

    public double getFunds() {
        return this.funds;
    }

//    public double sellAnimal(String name) {  //Can remove animal, need to add sale funds.
//        for(E enclosure : cages) {
//            Animal animal = enclosure.getAnimalByName(name);
//            this.funds += animal.getAnimalValue();
//            //Write a method to draw funds from animal in enclosure then call here.
//            enclosure.removeAnimal(enclosure.getAnimalByName(name));
//        }
//        return this.funds;
//    }



}
