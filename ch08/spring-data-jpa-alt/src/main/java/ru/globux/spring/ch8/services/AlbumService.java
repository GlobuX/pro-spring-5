package ru.globux.spring.ch8.services;

import ru.globux.spring.ch8.entities.Album;
import ru.globux.spring.ch8.entities.Singer;

import java.util.List;

public interface AlbumService {
	List<Album> findBySinger(Singer singer);

	List<Album> findByTitle(String title);
}
