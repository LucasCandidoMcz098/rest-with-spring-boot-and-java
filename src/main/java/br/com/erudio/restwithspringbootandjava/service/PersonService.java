package br.com.erudio.restwithspringbootandjava.service;

import br.com.erudio.restwithspringbootandjava.exceptions.ResourceNotFoundException;
import br.com.erudio.restwithspringbootandjava.model.PersonModel;
import br.com.erudio.restwithspringbootandjava.repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private Logger logger = Logger.getLogger(PersonService.class.getName());
    @Autowired
    PersonRepository personRepository;

    public List<PersonModel> findAll() {
        logger.info("Fidding all people");
        return personRepository.findAll();
    }


    public PersonModel findById(Long id) {
        logger.info("Fidding one Person");
        return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
    }


    public PersonModel create(PersonModel personModel) {
        logger.info("Creating one Person");
        return personRepository.save(personModel);
    }

    public PersonModel update(PersonModel personModel) {
        logger.info("Uptading one Person");
        var entity = personRepository.findById(personModel.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        entity.setFirstName(personModel.getFirstName());
        entity.setLastName(personModel.getLastName());
        entity.setAddress(personModel.getAddress());
        entity.setGender(personModel.getGender());
        return personRepository.save(personModel);
    }

    public void delete(Long id) {
        logger.info("Deleting one Person");
        var entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        personRepository.delete(entity);
    }


}
