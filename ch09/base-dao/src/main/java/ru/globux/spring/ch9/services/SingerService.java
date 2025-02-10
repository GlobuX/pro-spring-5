package ru.globux.spring.ch9.services;

import ru.globux.spring.ch9.entities.Singer;

import java.util.List;

public interface SingerService {

	List<Singer> findAll();

	Singer findById(Long id);

	Singer save(Singer singer);

	long countAll();
}
