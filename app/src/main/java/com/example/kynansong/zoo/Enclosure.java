package com.example.kynansong.zoo;

/**
 * Created by kynansong on 10/11/2017.
 */

import java.util.ArrayList;

public class Enclosure<T extends Animal> { //To only accept objects related to Animal.

    ArrayList<T> animalType;

    public Enclosure() {
        animalType = new ArrayList();
    }

    public int animalCount(){
        return this.animalType.size();
    }

    public void addAnimal(T animal){
//        for(T type : animalType)
        this.animalType.add(animal);
    }

    public void removeAnimal(T animal) {
        this.animalType.remove(animal);
    }

    public double totalEnclosureValue() {
        double total = 0;
        for(T animals : animalType) {
            total += animals.getAnimalValue();
        }
        return total;
    }

    public T getAnimalByName(String name) {
        for(T animal : animalType){
            if(animal.getAnimalName() == name) {
                return animal;
            }
        }
        return null;
    }
}
