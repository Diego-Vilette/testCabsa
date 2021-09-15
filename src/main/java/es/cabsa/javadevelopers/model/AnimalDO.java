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
    private final int id;

    @Column(nullable = false)
    private final String name;

    @Column(nullable = false)
    private final int legs;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable
    private List<FoodDO> diet;

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
