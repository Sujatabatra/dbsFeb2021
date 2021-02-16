package com.sujata.demo;

public class PopCornStore {

	//PopCorn store has PopCorn
	private PopCorn popCorn;
	
	public void setType(PopCorn popCorn){
		this.popCorn=popCorn;
	}
	
	public void buy(){
		popCorn.pop();
	}
	
}
