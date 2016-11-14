package com.example.user.zoo;

/**
 * Created by user on 12/11/2016.
 */

public class Elephant extends Animal {

    private String name;
    private int newAge;
    private int age;

    public Elephant(String name, int newAge) {
        super("Elephant", 0, Habitat.DESERT, false, Diet.PEANUTS, 50000);

        this.name = name;
        this.newAge = newAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = newAge;
    }


}

