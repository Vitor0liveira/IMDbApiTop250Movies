package com.jv.topmovies.IMDbTopMovies.model;

import lombok.Data;

@Data
public class Movie {

    private String fullTitle;
    private String urlImage;
    private Integer rating;
    private Integer year;
}
