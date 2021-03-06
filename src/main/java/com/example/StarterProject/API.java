package com.example.StarterProject;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class API {
    ArrayList<Animal> animalsList = new ArrayList<>();

    @GetMapping("/hello")
    public String helloworld() {
        return "Hello World!";
    }

    @GetMapping("/getOK")
    public String getOk() {
        return "Status: Ok";
    }

    @GetMapping("/Animals")
    public ArrayList<Animal> animals(){
        animalsList.add(new Animal(4, "Dog", "Woof"));
        animalsList.add(new Animal(2, "Robin", "Tweet"));
        animalsList.add(new Animal(4, "Wolf", "Howl"));

        return animalsList;
    }

    //Read Endpoint
    @GetMapping("/PrintAnimals")
    public ArrayList<Animal> printAnimals(){
        return animalsList;
    }

    //Create Endpoint
    @PostMapping(path = "/CreateAnimal")
    public void createAnimal(@RequestBody Animal animal){
        animalsList.add(animal);
    }
}
