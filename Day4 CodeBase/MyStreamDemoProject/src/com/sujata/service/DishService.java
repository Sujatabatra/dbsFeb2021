package com.sujata.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.sujata.bean.Dish;
import com.sujata.dao.DishDao;

public class DishService {

	private DishDao dishDao=new DishDao();
	
	ArrayList<String> getVegetarianMenu(){
//		
//		ArrayList<Dish> vegetarianDishes=(ArrayList<Dish>)dishDao.getAllDishes().stream()
//				.filter(dish->dish.isVegetarian())
//		        .map(dish->dish.getName())
//				.collect(Collectors.toList());
		
		ArrayList<String> vegetarianDishes=(ArrayList<String>)dishDao.getAllDishes().stream()
				.filter(Dish::isVegetarian)
				.map(Dish::getName)
				.collect(Collectors.toList());
		return vegetarianDishes;
	}
	
	long totalVegetarianItemsInMenu(){
		
		return dishDao.getAllDishes().stream()
		.filter(Dish::isVegetarian)
		.count();
	}
	
	
}
