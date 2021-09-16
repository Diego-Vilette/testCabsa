package es.cabsa.javadevelopers.service;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.FoodDO;
import es.cabsa.javadevelopers.repository.IFoodRepository;
import es.cabsa.javadevelopers.service.food.FoodService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FoodServiceTest {

    IFoodRepository iFoodRepository = mock(IFoodRepository.class);
    FoodService foodService = new FoodService(iFoodRepository);

    @Test
    void ShouldFindFoodById() {
        FoodDO food = new FoodDO("carrot");
        Optional<FoodDO> optional = Optional.of(food);

        when(iFoodRepository.findById(1)).thenReturn(optional);

        FoodDO savedFood = foodService.find(1);

        assertEquals(savedFood.getName(), food.getName());
    }

    @Test
    void ShouldThrowExceptionFindingById() {
        FoodDO food = new FoodDO("carrot");

        when(iFoodRepository.findById(1)).thenThrow(new BadRequestException());

        assertThrows(BadRequestException.class, () -> foodService.find(1));
    }

    @Test
    void ShouldFindFoodByName() {
        FoodDO food = new FoodDO("carrot");
        Optional<FoodDO> optional = Optional.of(food);

        when(iFoodRepository.findByName("carrot")).thenReturn(optional);

        FoodDO savedFood = foodService.findByName("carrot");

        assertEquals(savedFood.getName(), food.getName());
    }

    @Test
    void ShouldThrowExceptionFindingByName() {
        FoodDO food = new FoodDO("carrot");

        when(iFoodRepository.findByName("1")).thenThrow(new BadRequestException());

        assertThrows(BadRequestException.class, () -> foodService.findByName("1"));
    }

    @Test
    void ShouldCreateANewFood(){
        FoodDO food = new FoodDO("carrot");

        when(iFoodRepository.save(food)).thenReturn(food);

        FoodDO savedFood = foodService.create(food);

        assertEquals(food, savedFood);
    }

    @Test
    void ShouldThrowExceptionSaving(){
        FoodDO food = new FoodDO("carrot");

        when(iFoodRepository.save(food)).thenThrow(new BadRequestException());

        assertThrows(BadRequestException.class, () -> foodService.create(food));
    }
}
