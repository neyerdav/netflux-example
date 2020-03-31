package dev.neyerdavid.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import dev.neyerdavid.netfluxexample.domain.Movie;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

}
