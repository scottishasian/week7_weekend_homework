package com.example.kynansong.zoo;

import java.util.ArrayList;

/**
 * Created by kynansong on 10/11/2017.
 */

public class Zoo<E extends Enclosure> {

    private ArrayList<E> cages;
    private double funds;

    public Zoo(){
        this.cages = new ArrayList();
        this.funds = 0;
    }

    public int enclosureCount() {
        return this.cages.size();
    }

    public void addEnclosure(E Enclosure) {
        this.cages.add(Enclosure);
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

//    public double sellAnimal(String name) {
//        for(E enclosure : cages) {
//            if (enclosure.getAnimalName())
//        }
//        return this.funds;
//    }
}
