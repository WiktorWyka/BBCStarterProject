package com.example.StarterProject;

import lombok.Data;

@Data
public class Animal {
    private int id;
    private int numOfLegs;
    private String speciesName;
    private String soundMade;

    public Animal(int newNumOfLegs, String newSpeciesName, String newSoundMade, int newId) {
        numOfLegs = newNumOfLegs;
        speciesName = newSpeciesName;
        soundMade = newSoundMade;
        id = newId;
    }
}
