package com.example.user.zoo;

/**
 * Created by user on 12/11/2016.
 */

public class Elephant extends Animal {

    private String name;
    private int age;

    public Elephant(String name, int age) {
        super("Elephant", Habitat.DESERT, false, Diet.PEANUTS);

        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

