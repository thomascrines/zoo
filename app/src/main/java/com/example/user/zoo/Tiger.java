package com.example.user.zoo;

/**
 * Created by user on 12/11/2016.
 */

public class Tiger extends Animal {

        private String name;
        private int newAge;
        private int age;

        public Tiger(String name, int newAge) {
            super("Tiger", 0, Habitat.GRASSLAND, true, Diet.MEAT, 75000);

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

