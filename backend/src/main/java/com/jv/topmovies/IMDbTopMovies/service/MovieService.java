package com.jv.topmovies.IMDbTopMovies.service;

import com.jv.topmovies.IMDbTopMovies.config.MovieConfig;
import com.jv.topmovies.IMDbTopMovies.exception.MovieException;
import com.jv.topmovies.IMDbTopMovies.remote.ImdbClient;
import com.jv.topmovies.IMDbTopMovies.model.MovieList;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final ImdbClient imdbClient;
    private final MovieConfig movieConfig;

    public MovieService(ImdbClient imdbClient,
                        MovieConfig movieConfig) {
        this.imdbClient = imdbClient;
        this.movieConfig = movieConfig;
    }

    public MovieList get() throws MovieException {
        return imdbClient.get(
                movieConfig.getMovieURL(),
                MovieList.class,
                "Could not retrieve list movies."
        );
    }
}
