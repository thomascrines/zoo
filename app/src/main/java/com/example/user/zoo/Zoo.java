package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Zoo {

    private String name;
    private int capacity;
    private ArrayList<Enclosure> enclosures;

    public Zoo(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.enclosures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }
}
