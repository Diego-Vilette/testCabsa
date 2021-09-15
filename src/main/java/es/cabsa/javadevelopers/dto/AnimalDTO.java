package es.cabsa.javadevelopers.dto;

import es.cabsa.javadevelopers.model.FoodDO;

import java.util.List;

public class AnimalDTO {
    private String name;
    private List<FoodDO> diet;

    public AnimalDTO(){
    }

    public AnimalDTO(String name, List<FoodDO> diet){
        this.name = name;
        this.diet = diet;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<FoodDO> getDiet(){
        return diet;
    }

    public void setDiet(List<FoodDO> diet){
        this.diet = diet;
    }

}
