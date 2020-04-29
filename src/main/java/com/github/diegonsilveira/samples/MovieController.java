package com.github.diegonsilveira.samples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.diegonsilveira.samples.entity.Movie;
import com.github.diegonsilveira.samples.entity.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieRepository repo;
	
    @GetMapping
    public List<Movie> getAll() {
    	return repo.findAll();
    }
	
}
