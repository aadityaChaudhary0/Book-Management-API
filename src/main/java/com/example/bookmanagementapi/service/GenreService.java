package com.example.bookmanagementapi.service;

import com.example.bookmanagementapi.model.Genre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenreService {


    List<Genre> getAllGenre();

    Genre addGenre(Genre genre);
}
