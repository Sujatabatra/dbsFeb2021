package com.sujata.bean;

public class Dish {
	private String name;
	private boolean vegetarian;
	private int calories;
	
	public Dish(){
		
	}

	public Dish(String name, boolean vegetarian, int calories) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + "]";
	}
	
	

}
