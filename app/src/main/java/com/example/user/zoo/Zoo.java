package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Zoo {

    private String name;
    private ArrayList<Population> enclosure;

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
