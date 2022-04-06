package com.jv.topmovies.IMDbTopMovies.controller;

import com.jv.topmovies.IMDbTopMovies.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class IMDbApiMovieController {

    private final MovieService movieService;

    public IMDbApiMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

}
