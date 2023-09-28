package br.com.erudio.restwithspringbootandjava.controller;

import br.com.erudio.restwithspringbootandjava.dtos.PersonDTO;
import br.com.erudio.restwithspringbootandjava.model.PersonModel;
import br.com.erudio.restwithspringbootandjava.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;


    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModel findById(@PathVariable(value = "id") Long id) throws Exception {
        return personService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody @Valid PersonDTO personDTO) throws Exception {
        PersonModel personModel = new PersonModel();
        BeanUtils.copyProperties(personDTO, personModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.create(personModel));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModel update(@RequestBody PersonModel person) {
        return personService.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws Exception {
         personService.delete(id);
         return ResponseEntity.noContent().build();
    }

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonModel> findAll() {
        return personService.findAll();
    }




}
