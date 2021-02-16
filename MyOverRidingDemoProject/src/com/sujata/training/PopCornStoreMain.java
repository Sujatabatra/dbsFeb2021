package com.sujata.training;

import java.awt.Choice;
import java.util.Scanner;

import com.sujata.demo.ButterPopCorn;
import com.sujata.demo.CaramelPopCorn;
import com.sujata.demo.PopCorn;
import com.sujata.demo.PopCornStore;

public class PopCornStoreMain {

	public static void main(String[] args) {
		PopCornStore popCornMart=new PopCornStore();
		Scanner scanner=new Scanner(System.in);
		String choice=null;
		do{
			System.out.println("Enter b for Butter , c for caramel and p for plain popcorn ");
			String type=scanner.next();
			switch (type) {
			case "b":
				popCornMart.setType(new ButterPopCorn());
				break;
			case "c":
				popCornMart.setType(new CaramelPopCorn());
				break;
			case "p":
				popCornMart.setType(new PopCorn());
				break;

			default:
				break;
			}
			
			popCornMart.buy();
			
			System.out.println("Do you want to buy more popcorns press y for yes and n for no:");
			choice=scanner.next();
			
		}while(choice.equalsIgnoreCase("y"));

	}

}
