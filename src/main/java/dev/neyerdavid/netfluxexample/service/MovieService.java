package dev.neyerdavid.netfluxexample.service;

import dev.neyerdavid.netfluxexample.domain.Movie;
import dev.neyerdavid.netfluxexample.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Flux<MovieEvent> events(String movieId);

    Mono<Movie> getMovieById(String id);
    Flux<Movie> getAllMovies();

}
