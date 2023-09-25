package br.com.erudio.restwithspringbootandjava.repositorys;

import br.com.erudio.restwithspringbootandjava.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}
