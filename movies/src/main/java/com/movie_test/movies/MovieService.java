// Uses Repo to talk to DB and return data to API Layer
package com.movie_test.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // framework to instantiate movieRepo
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll(); // returns all via Mongo method
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
