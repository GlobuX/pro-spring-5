package com.apress.prospring5.ch8.repos;

import com.apress.prospring5.ch8.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {

}
