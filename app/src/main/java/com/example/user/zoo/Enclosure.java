package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Enclosure {

    private String name;
    private Habitat habitat;
    private ArrayList<Animal> captives;

    public Enclosure(String name, Habitat habitat) {
        this.name = name;
        this.habitat = habitat;
        this.captives = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public Habitat getHabitat() {
        return this.habitat;
    }

    public ArrayList<Animal> getCaptives() {
        return this.captives;
    }

    public void addAnimal(Animal animal) {
        captives.add(animal);
    }

}
