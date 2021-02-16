package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Car;
import com.sujata.demo.Driver;
import com.sujata.demo.Suzuki;
import com.sujata.demo.Toyota;

public class CarRentalService {

	public static void main(String[] args) {
		Car car1 = new Audi("A8", "Red");
		Car car2 = new BMW("Q5", "Blue");
		Car car3 = new Toyota("Altis", "Golden");
		Car car4=new Suzuki("Ciaz", "Silver");

		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		Driver raju=new Driver("Raju");
		
		sonu.setCar(car4);
		sonu.drive();
	}

}
