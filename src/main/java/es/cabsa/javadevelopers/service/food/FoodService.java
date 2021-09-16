package es.cabsa.javadevelopers.service.food;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.FoodDO;
import es.cabsa.javadevelopers.repository.IFoodRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodService implements  IFoodService{

    private final IFoodRepository iFoodRepository;

    public FoodService(IFoodRepository iFoodRepository){
        this.iFoodRepository = iFoodRepository;
    }

    /**
     * Selects a food by id.
     *
     * @param foodId
     * @return found food
     * @throws BadRequestException if no food with the given id was found.
     */
    @Override
    public FoodDO find(int foodId) throws BadRequestException {
        return iFoodRepository.findById(foodId)
                .orElseThrow(() -> new BadRequestException());
    }

    /**
     * Selects a food by name.
     *
     * @param foodName
     * @return found food
     * @throws BadRequestException if no food with the given name was found.
     */
    @Override
    public FoodDO findByName(String foodName){
        return iFoodRepository.findByName(foodName)
                .orElseThrow(() -> new BadRequestException());
    }

    /**
     * Create a new Food
     *
     * @param foodDO
     * @return the new FoodDO
     * @throws BadRequestException if cannot create the new Food
     */
    @Override
    public FoodDO create(FoodDO foodDO) throws BadRequestException {
        FoodDO food;
        try
        {
            food = iFoodRepository.save(foodDO);
        }
        catch (Exception e)
        {
            throw new BadRequestException();
        }
        return food;
    }
}
