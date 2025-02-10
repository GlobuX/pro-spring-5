package ru.globux.spring.ch9.services;

import ru.globux.spring.ch9.entities.Singer;

public interface SingerService {
    Singer save(Singer singer);

    long count();

}
