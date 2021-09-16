package es.cabsa.javadevelopers;

import java.util.Arrays;
import java.util.List;

import es.cabsa.javadevelopers.controller.mapper.AnimalMapper;
import es.cabsa.javadevelopers.model.AnimalDO;
import es.cabsa.javadevelopers.repository.IAnimalRepository;
import es.cabsa.javadevelopers.service.animal.AnimalService;
import es.cabsa.javadevelopers.utils.GsonJsonParser;
import es.cabsa.javadevelopers.utils.JsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);
    //Seria mejor hacer un getBean de IAnimalService pero no defini el metodo findAll,
    //para evitar definirlo ahora y tener que agregar los respectivos test voy a usar IAnimalRepository
    IAnimalRepository iAnimalRepository = ctx.getBean(IAnimalRepository.class);
    Iterable<AnimalDO> animals = iAnimalRepository.findAll();

    System.out.println("Animals in the jungle:");

    for (AnimalDO animal : animals) {
      //Quiero aclarar que se que no lo estoy haciendo de la forma correcta, la cual seria crear una clase
      //como "DependencyFactory" con un metodo static como "JsonParser" el cual me devolveria la instancia
      //de GsonJsonParser la cual deberia injectar para luego usarla, solo lo estoy haciendo asi para ahorrar tiempo.
        System.out.println(GsonJsonParser.INSTACE.toJson(AnimalMapper.toDTO(animal)));
    }
  }

}
