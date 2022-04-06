package com.jv.topmovies.IMDbTopMovies.service;

import com.jv.topmovies.IMDbTopMovies.config.MovieConfig;
import com.jv.topmovies.IMDbTopMovies.exception.MovieException;
import com.jv.topmovies.IMDbTopMovies.http.HttpClientWrapper;
import com.jv.topmovies.IMDbTopMovies.model.MovieList;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final HttpClientWrapper httpClientWrapper;
    private final MovieConfig movieConfig;

    public MovieService(HttpClientWrapper httpClientWrapper,
                        MovieConfig movieConfig) {
        this.httpClientWrapper = httpClientWrapper;
        this.movieConfig = movieConfig;
    }

    public MovieList get() throws MovieException {
        return httpClientWrapper.get(
                movieConfig.getMovieURL(),
                MovieList.class,
                "Could not retrieve list movies."
        );
    }
}
