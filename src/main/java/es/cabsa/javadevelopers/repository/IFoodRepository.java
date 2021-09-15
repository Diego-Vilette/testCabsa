package es.cabsa.javadevelopers.repository;

import es.cabsa.javadevelopers.model.FoodDO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Database Access Object for food table.
 */
public interface IFoodRepository extends CrudRepository<FoodDO, Integer> {

    List<FoodDO> findByName(String name);

}
