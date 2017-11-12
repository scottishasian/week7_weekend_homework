package com.example.kynansong.zoo;

import java.util.ArrayList;

/**
 * Created by kynansong on 10/11/2017.
 */

public class Zoo<E extends Enclosure> {

    private ArrayList<E> cages;
    private ArrayList<Visitor> visitors;
    private double funds;
    private double ticketPrice;

    public Zoo(){
        this.cages = new ArrayList();
        this.visitors = new ArrayList();
        this.funds = 0;
        this.ticketPrice = ticketPrice;
    }

    public int enclosureCount() {
        return this.cages.size();
    }

    public void addEnclosure(E Enclosure) {
        this.cages.add(Enclosure);
    }

    public double setTicketPrice(double cost) {
        return this.ticketPrice = cost;
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

    public int visitorCount() {
        return visitors.size();
    }

    public void visitorBuysTicket(Visitor visitor) {
        this.visitors.add(visitor);
        this.funds += ticketPrice;
        visitor.canBuyTicket(ticketPrice);
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

    public double sellAnimal(Animal animal) {  //Can remove animal, need to add sale funds.
        double sale = 0;
        for(E enclosure : cages){
            if(enclosure.enclosureHasAnimal(animal) == true) {
                sale += animal.getAnimalValue();
                enclosure.removeAnimal(animal);
            }
        }
        return this.funds += sale;
    }



}
