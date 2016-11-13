package com.example.user.zoo;


/**
 * Created by user on 13/11/2016.
 */

public class Enclosure {

    private String name;
    private Habitat habitat;
    private Population population;
    private FeedingArea feedingArea;

    public Enclosure(String name, Habitat habitat, Population population, FeedingArea feedingArea) {
        this.name = name;
        this.habitat = habitat;
        this.population = population;
        this.feedingArea = feedingArea;
    }

    public String getName() {
        return name;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public Population getPopulation() {
        return population;
    }

    public FeedingArea getFeedingArea(){
        return feedingArea;
    }
}
