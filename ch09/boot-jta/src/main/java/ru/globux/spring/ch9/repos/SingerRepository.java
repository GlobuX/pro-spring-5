package ru.globux.spring.ch9.repos;

import ru.globux.spring.ch9.entities.Singer;
import org.springframework.data.repository.CrudRepository;

public interface SingerRepository extends CrudRepository<Singer, Long> {

}
