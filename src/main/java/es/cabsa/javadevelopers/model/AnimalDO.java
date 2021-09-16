package es.cabsa.javadevelopers.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "animal",
        uniqueConstraints = @UniqueConstraint(name = "uc_name", columnNames = {"name"})
)
public class AnimalDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int legs;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<FoodDO> diet;

    public AnimalDO(){}

    public AnimalDO(String name, List<FoodDO> diet){
        this.name = name;
        this.diet = diet;
    }

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

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void setId(int id){
        this.id = id;
    }
}
