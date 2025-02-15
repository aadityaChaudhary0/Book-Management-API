package com.example.bookmanagementapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long genreId;
    private String genreName;
    private String genreDescription;

    @JsonIgnore
    @ManyToMany(mappedBy = "genres")
    private Set<Book> book = new HashSet<>();

    public Genre(Long genreId, String genreName, String genreDescription) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.genreDescription = genreDescription;
    }

    public Genre() {

    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
