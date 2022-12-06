package com.example.spring_cinema.serivces;

import com.example.spring_cinema.controllers.MovieController;
import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    private ArrayList<Movie> movies;
    private Movie movie;

    public MovieService() {
    }


    public Movie addNewMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getAllMovies() {

        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }
}
