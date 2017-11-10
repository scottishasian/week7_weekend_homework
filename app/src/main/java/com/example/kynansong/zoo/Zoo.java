package com.example.kynansong.zoo;

import java.util.ArrayList;

/**
 * Created by kynansong on 10/11/2017.
 */

public class Zoo<E> {

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
}
