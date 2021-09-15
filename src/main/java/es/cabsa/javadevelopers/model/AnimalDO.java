package es.cabsa.javadevelopers.model;

import java.util.List;

public class AnimalDO {
    private final int id;
    private final String name;
    private final int legs;
    private final List<FoodDO> diet;

    public AnimalDO(int id, String name, int legs, List<FoodDO> diet){
        this.id = id;
        this.name = name;
        this.legs = legs;
        this.diet = diet;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getLegs(){
        return legs;
    }

    public List<FoodDO> getDiet(){
        return diet;
    }


}
