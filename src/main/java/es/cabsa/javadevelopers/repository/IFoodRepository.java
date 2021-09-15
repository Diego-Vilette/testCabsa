package es.cabsa.javadevelopers.repository;

import es.cabsa.javadevelopers.model.FoodDO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * Database Access Object for food table.
 */
public interface IFoodRepository extends CrudRepository<FoodDO, Integer> {

    Optional<FoodDO> findByName(String name);

}
