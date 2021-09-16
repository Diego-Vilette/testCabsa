package es.cabsa.javadevelopers.dto.animal;

import es.cabsa.javadevelopers.dto.food.FoodNameDTO;
import es.cabsa.javadevelopers.model.FoodDO;

import java.util.List;

public class AnimalDTO {
    private String name;
    private List<String> diet;

    public AnimalDTO(){
    }

    public AnimalDTO(String name, List<String> diet){
        this.name = name;
        this.diet = diet;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<String> getDiet(){
        return diet;
    }

    public void setDiet(List<String> diet){
        this.diet = diet;
    }

}
