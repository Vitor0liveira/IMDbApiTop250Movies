package com.jv.topmovies.IMDbTopMovies.model;

import lombok.Data;

import java.util.List;

@Data
public class MovieList {

    private List<Movie> items;
}
