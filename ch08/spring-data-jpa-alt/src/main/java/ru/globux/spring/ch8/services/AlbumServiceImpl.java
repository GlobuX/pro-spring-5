package ru.globux.spring.ch8.services;

import ru.globux.spring.ch8.entities.Album;
import ru.globux.spring.ch8.entities.Singer;
import ru.globux.spring.ch8.repos.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("springJpaAlbumService")
@Transactional
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	private AlbumRepository albumRepository;

	@Transactional(readOnly=true)
	@Override public List<Album> findBySinger(Singer singer) {
		return albumRepository.findBySinger(singer);
	}

	@Override public List<Album> findByTitle(String title) {
		return albumRepository.findByTitle(title);
	}
}
