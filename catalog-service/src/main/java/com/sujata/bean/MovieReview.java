package com.sujata.bean;

public class MovieReview {

	private String userId;
	private String movieName;
	private int rating;
	public MovieReview() {
		
	}
	public MovieReview(String userId, String movieName, int rating) {
		super();
		this.userId = userId;
		this.movieName = movieName;
		this.rating = rating;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
