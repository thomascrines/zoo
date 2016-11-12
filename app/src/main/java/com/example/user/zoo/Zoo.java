package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Zoo {

    private String name;
    private ArrayList<Population> enclosures;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Population> getEnclosures() {
        return this.enclosures;
    }

    public void addEnclosure(Population population) {
        enclosures.add(population);
    }

    public void removeEnclosure(Population population) {
        enclosures.remove(population);
    }
}
