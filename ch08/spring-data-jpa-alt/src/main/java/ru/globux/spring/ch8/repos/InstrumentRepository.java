package ru.globux.spring.ch8.repos;

import ru.globux.spring.ch8.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {

}
