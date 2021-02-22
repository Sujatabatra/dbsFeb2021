package com.sujata.dao;

import java.util.ArrayList;

import com.sujata.bean.Dish;

public class DishDao {

	static private ArrayList<Dish> dishes=new ArrayList<>();
	static{
		dishes.add(new Dish("Egg", false, 120));
		dishes.add(new Dish("Roti", true, 140));
		dishes.add(new Dish("Chicken Masala", false, 520));
		dishes.add(new Dish("Fish Fry", false, 450));
		dishes.add(new Dish("Palak Paneer", true, 220));
		dishes.add(new Dish("Dal", true, 150));
		dishes.add(new Dish("Lady Fingure", true, 160));
	}
	
	public ArrayList<Dish> getAllDishes(){
		return dishes;
	}
}
