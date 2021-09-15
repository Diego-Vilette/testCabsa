package es.cabsa.javadevelopers.services.food;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.FoodDO;

public interface IFoodService {

    FoodDO find(int foodId) throws BadRequestException;

    FoodDO findByName(String foodName) throws BadRequestException;

    FoodDO create(FoodDO foodDO) throws BadRequestException;

}
