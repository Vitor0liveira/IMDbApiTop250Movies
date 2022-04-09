package com.jv.topmovies.IMDbTopMovies.controller;

import com.jv.topmovies.IMDbTopMovies.model.MovieList;
import com.jv.topmovies.IMDbTopMovies.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IMDbApiMovieController {

    private final MovieService movieService;

    public IMDbApiMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<MovieList> allMovies() {
        return ResponseEntity.ok().body(movieService.get());
    }
}