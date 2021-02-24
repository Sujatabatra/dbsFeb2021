package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.RatingList;
import com.sujata.dao.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public RatingList getratingByUserId(String userId) {
		RatingList ratingList=new RatingList();
		ratingList.setRatingList(ratingDao.getRatingByUserId(userId));
		return ratingList;
	}

}
