package com.example.bookmanagementapi.service;

import com.example.bookmanagementapi.model.Genre;
import com.example.bookmanagementapi.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImplementation implements GenreService{

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<Genre> getAllGenre() {
        return genreRepository.findAll();
    }

    @Override
    public Genre addGenre(Genre genre) {
        return genreRepository.save(genre);
    }
}
