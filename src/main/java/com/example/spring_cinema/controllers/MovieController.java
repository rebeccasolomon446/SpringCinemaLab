package com.example.spring_cinema.controllers;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.serivces.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> newMovie(@RequestBody Movie movie) {
        movieService.addNewMovie(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<>

}
