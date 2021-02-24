package com.sujata.bean;

public class Rating {

	private int ratingId;
	private String movieId;
	private String userId;
	private int rating;
	
	public Rating() {
		
	}

	public Rating(int ratingId, String movieId, String userId, int rating) {
		super();
		this.ratingId = ratingId;
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
	
	
}
