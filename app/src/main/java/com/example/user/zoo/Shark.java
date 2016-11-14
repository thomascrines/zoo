package com.example.user.zoo;

/**
 * Created by user on 14/11/2016.
 */

public class Shark extends Animal {

    private String name;
    private int newAge;
    private int age;

    public Shark(String name, int newAge) {
        super("Shark", 0, Habitat.SALT_WATER, true, Diet.MEAT, 40000);

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
