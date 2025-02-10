package ru.globux.spring.ch8.repos;

import ru.globux.spring.ch8.entities.SingerAudit;
import org.springframework.data.repository.CrudRepository;

public interface SingerAuditRepository extends CrudRepository<SingerAudit, Long> {
}
