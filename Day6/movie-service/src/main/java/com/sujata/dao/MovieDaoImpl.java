package com.sujata.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.sujata.bean.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {

	private static HashMap<String, Movie> movieList=new HashMap<>();

	static {
		movieList.put("M001", new Movie("M001", "Titanic"));
		movieList.put("M002", new Movie("M002", "Black And White"));
		movieList.put("M003", new Movie("M003", "Home Alone"));
		movieList.put("M004", new Movie("M004", "Jurrasic Park"));
		
	}
	@Override
	public Movie getMovieById(String id) {
		
		return movieList.get(id);
	}
	
}
