package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;
import com.sujata.bean.MovieReview;
import com.sujata.bean.MovieReviewList;
import com.sujata.bean.Rating;
import com.sujata.bean.RatingList;

@Service
public class CatalogServiceImpl implements CatalogService {

	//With RestTemplate Consumer of Rest API
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public MovieReviewList getMovieReviewDetailsByUserId(String uId) {
		
		RatingList ratingList=restTemplate.getForObject("http://localhost:8082/ratings/"+uId, RatingList.class);
		
		MovieReviewList movieReviewList=new MovieReviewList();
		
		for(Rating rating:ratingList.getRatingList()) {
			Movie movie=restTemplate.getForObject("http://localhost:8080/movies/"+rating.getMovieId(), Movie.class);
			
			MovieReview movieReview=new MovieReview(rating.getUserId(),movie.getMovieName(),rating.getRating());
			
			movieReviewList.getMovieReviewList().add(movieReview);
		}
		return movieReviewList;
	}

}
