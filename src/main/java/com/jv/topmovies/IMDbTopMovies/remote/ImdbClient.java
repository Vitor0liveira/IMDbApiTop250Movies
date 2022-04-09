package com.jv.topmovies.IMDbTopMovies.remote;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jv.topmovies.IMDbTopMovies.exception.MovieException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ImdbClient {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ImdbClient(HttpClient httpClient, ObjectMapper objectMapper) {
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public <T> T get(String url, Class<T> clazz, String errMessage) throws MovieException {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();
            HttpResponse<String> response = httpClient.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() != HttpStatus.OK.value()) {
                throw new MovieException(errMessage);
            }

            return objectMapper.readValue(
                    response.body(),
                    clazz
            );

        } catch (Exception ex) {
            throw new MovieException(ex.getMessage());
        }
    }
}
