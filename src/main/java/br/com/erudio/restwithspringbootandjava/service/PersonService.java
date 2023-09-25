package br.com.erudio.restwithspringbootandjava.service;

import br.com.erudio.restwithspringbootandjava.model.PersonModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<PersonModel> findAll() {
        logger.info("Fidding all people");
        List<PersonModel> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            PersonModel person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }


    public PersonModel findById(String id) {
        logger.info("Fidding one Person");
        PersonModel personModel = new PersonModel();
        personModel.setId(counter.incrementAndGet());
        personModel.setFirstName("Carlos");
        personModel.setLastName("Alberto");
        personModel.setAddress("Maceió/AL");
        personModel.setGender("Male");
        return personModel;
    }


    private PersonModel mockPerson(int i) {
        PersonModel personModel = new PersonModel();
        personModel.setId(counter.incrementAndGet());
        personModel.setFirstName("Person name" + i);
        personModel.setLastName("Last name" + i);
        personModel.setAddress("LA/EUA");
        personModel.setGender("Male");
        return personModel;
    }

}
