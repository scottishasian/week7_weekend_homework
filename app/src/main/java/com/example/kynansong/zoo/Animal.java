package com.example.kynansong.zoo;

/**
 * Created by kynansong on 10/11/2017.
 */

public abstract class Animal {
    private String name;
    private double value;

    public Animal(String name, double value) {
        this.name = name;
        this.value = value;

    }

    public String getAnimalName() {
        return this.name;
    }

    public double getAnimalValue() {
        return this.value;
    }

    public void setAnimalName(String name){
        this.name = name;
    }

    public void setAnimalValue(double value){
        this.value = value;
    }
}
