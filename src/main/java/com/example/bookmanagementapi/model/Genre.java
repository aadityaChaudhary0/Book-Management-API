package com.example.bookmanagementapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Genre {

    @Id
    private Long genreId;
    private String genreName;
    private String genreDescription;

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
}
