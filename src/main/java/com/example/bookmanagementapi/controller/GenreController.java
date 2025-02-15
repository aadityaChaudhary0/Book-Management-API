package com.example.bookmanagementapi.controller;

import com.example.bookmanagementapi.model.Genre;
import com.example.bookmanagementapi.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping("/genres")
    public List<Genre> getAllGenre(){
        return this.genreService.getAllGenre();
    }

    @PostMapping("/genres")
    public Genre addGenre(@RequestBody Genre genre){
        return this.genreService.addGenre(genre);
    }

}
