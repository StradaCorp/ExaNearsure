package com.solstice.contact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long movieId;
    private String name;

    @OneToMany(mappedBy = "movie")
    Set<ContactMovie> movies;


    public Movie() {
    }

    public Movie(Long movieId, String name) {
        this.movieId = movieId;
        this.name = name;

    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
