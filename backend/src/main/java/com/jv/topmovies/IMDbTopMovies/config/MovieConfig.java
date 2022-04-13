package com.jv.topmovies.IMDbTopMovies.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class MovieConfig {

    @Value("${movie.url}")
    private String movieURL;
}
