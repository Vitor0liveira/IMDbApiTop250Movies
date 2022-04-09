package com.jv.topmovies.IMDbTopMovies.model;

import lombok.Data;

@Data
public class Movie {

    private String fullTitle;
    private String image;
    private Float imDbRating;
    private String year;
}
