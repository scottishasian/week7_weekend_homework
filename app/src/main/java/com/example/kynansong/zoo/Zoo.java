package com.example.kynansong.zoo;

import java.util.ArrayList;

/**
 * Created by kynansong on 10/11/2017.
 */

public class Zoo {

    ArrayList<Enclosure> cages;

    public Zoo(){
        this.cages = new ArrayList();
    }

    public int enclosureCount() {
        return this.cages.size();
    }
}
