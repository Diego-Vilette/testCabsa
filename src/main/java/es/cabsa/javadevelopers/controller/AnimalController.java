package es.cabsa.javadevelopers.controller;
import es.cabsa.javadevelopers.controller.mapper.AnimalMapper;
import es.cabsa.javadevelopers.dto.animal.AnimalDTO;
import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.service.animal.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All operations with an Animal will be routed by this controller.
 */
@RestController
@RequestMapping("animal")
public class AnimalController {

    private final IAnimalService iAnimalService;

    @Autowired
    public AnimalController(IAnimalService iAnimalService){
        this.iAnimalService = iAnimalService;
    }

    @GetMapping("/{animalName}")
    public AnimalDTO getAnimal(@PathVariable String animalName) throws BadRequestException {
        //I try to find animal by name and then map to DTO, I use toLowerCase to avoid mismatch
        return AnimalMapper.toDTO(iAnimalService.findByName(animalName.toLowerCase()));
    }



}
