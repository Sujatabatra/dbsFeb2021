package com.sujata.service;

import com.sujata.bean.MovieReviewList;

public interface CatalogService {

	MovieReviewList getMovieReviewDetailsByUserId(String uId);
}
