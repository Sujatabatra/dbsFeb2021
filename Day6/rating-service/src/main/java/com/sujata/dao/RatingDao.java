package com.sujata.dao;

import java.util.ArrayList;

import com.sujata.bean.Rating;

public interface RatingDao {

	ArrayList<Rating> getRatingByUserId(String uId);
}
