package com.example.spring_cinema.serivces;

import com.example.spring_cinema.controllers.MovieController;
import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

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
}
