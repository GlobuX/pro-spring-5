package ru.globux.spring.ch9.repos;

import ru.globux.spring.ch9.entities.Album;
import ru.globux.spring.ch9.entities.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {
	List<Album> findBySinger(Singer singer);
}
