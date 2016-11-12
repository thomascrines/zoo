package com.example.user.zoo;

/**
 * Created by user on 12/11/2016.
 */

public class Tiger extends Animal {

        private String name;
        private int age;

        public Tiger(String name, int age) {
            super("Tiger", Habitat.GRASSLAND, true, Diet.MEAT);

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

