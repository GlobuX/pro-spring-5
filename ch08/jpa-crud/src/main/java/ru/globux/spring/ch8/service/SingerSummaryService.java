package ru.globux.spring.ch8.service;

import ru.globux.spring.ch8.view.SingerSummary;

import java.util.List;

public interface SingerSummaryService {
    List<SingerSummary> findAll();
}
