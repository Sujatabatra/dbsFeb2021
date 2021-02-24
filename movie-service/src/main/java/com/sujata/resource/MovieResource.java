package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Movie;
import com.sujata.service.MovieService;

@RestController
public class MovieResource {

	@Autowired
	private MovieService movieService;
	@GetMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable("id")String id) {
		return movieService.getMovieById(id);
	}
}
