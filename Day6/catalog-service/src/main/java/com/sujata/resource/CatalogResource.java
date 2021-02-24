package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.MovieReviewList;
import com.sujata.service.CatalogService;

@RestController
public class CatalogResource {

	@Autowired
	private CatalogService catalogService;
	
	@GetMapping("/catalogs/{uid}")
	public MovieReviewList getMovieReviewsByUserId(@PathVariable("uid")String uId) {
		return catalogService.getMovieReviewDetailsByUserId(uId);
	}
}

