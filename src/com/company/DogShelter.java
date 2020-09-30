package com.company;

import java.util.ArrayList;

public class DogShelter {
    ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void addArray(Dog obj) {
        dogs.add(obj);
    }

    public static void main(String[] args) {
        DogShelter Shelter = new DogShelter();
        Dog doggy = new Dog(5, "Nick");
        Shelter.addArray(doggy);
    }
}