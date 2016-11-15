package com.example.user.zoo;

/**
 * Created by user on 12/11/2016.
 */

abstract class Animal {

    private String name;
    private String species;
    private int age;
    private Habitat habitat;
    private boolean carnivore;
    private Diet diet;
    private double value;


    public Animal(String name, int age, String species, Habitat habitat, boolean carnivore, Diet diet, double value) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
        this.carnivore = carnivore;
        this.diet = diet;
        this.value = value;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getAge() {return age;}

    public Habitat getHabitat() {
        return this.habitat;
    }

    public boolean isCarnivorous() {
        return this.carnivore;
    }

    public Diet getDiet() {
        return this.diet;
    }

    public double getValue() {
        return this.value;
    }

}
