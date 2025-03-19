package exampleDB.Controller;

import exampleDB.Repository.PersonRepository;
import exampleDB.Service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PersonController {
    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    protected List<PersonService> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return repository.getPersonsByCity(city);
    }
}
