package es.cabsa.javadevelopers.controller;

import es.cabsa.javadevelopers.controller.mapper.AnimalMapper;
import es.cabsa.javadevelopers.controller.mapper.FoodMapper;
import es.cabsa.javadevelopers.dto.animal.AnimalDTO;
import es.cabsa.javadevelopers.dto.food.FoodDTO;
import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.FoodDO;
import es.cabsa.javadevelopers.repository.IFoodRepository;
import es.cabsa.javadevelopers.service.food.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * All operations with a Food will be routed by this controller.
 */
@RestController
@RequestMapping("food")
public class FoodController {

    private final IFoodService iFoodService;

    @Autowired
    public FoodController(IFoodService iFoodService){
        this.iFoodService = iFoodService;
    }

    @GetMapping("/{foodName}")
    public FoodDTO getFood(@PathVariable String foodName) throws BadRequestException {
        //I try to find food by name and then map to DTO, I use toLowerCase to avoid mismatch
        return FoodMapper.toDTO(iFoodService.findByName(foodName.toLowerCase()));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FoodDTO createDriver(@Valid @RequestBody FoodDTO foodDTO) throws BadRequestException {
        FoodDO foodDO = FoodMapper.toDO(foodDTO);
        return FoodMapper.toDTO(iFoodService.create(foodDO));
    }

}
