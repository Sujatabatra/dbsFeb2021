package com.sujata.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.sujata.bean.Rating;

@Repository
public class RatingDaoImpl implements RatingDao {

	private static ArrayList<Rating> ratingList=new ArrayList<Rating>();
	
	static {
		ratingList.add(new Rating(1, "M002", "U001", 5));
		ratingList.add(new Rating(2, "M001", "U001", 4));
		ratingList.add(new Rating(3, "M002", "U004", 3));
		ratingList.add(new Rating(4, "M003", "U004", 5));
		ratingList.add(new Rating(5, "M004", "U001", 5));
		ratingList.add(new Rating(6, "M003", "U003", 2));
		ratingList.add(new Rating(7, "M004", "U003", 3));
		ratingList.add(new Rating(8, "M001", "U002", 5));
		ratingList.add(new Rating(9, "M002", "U002", 4));
	}
	@Override
	public ArrayList<Rating> getRatingByUserId(String uId) {
		ArrayList<Rating> newList=new ArrayList<>();
		for(Rating rating:ratingList) {
			if(rating.getUserId().equals(uId))
				newList.add(rating);
		}
		return newList;
	}

}
