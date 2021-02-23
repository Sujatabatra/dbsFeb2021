package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.demo.GoodMorning;
import com.sujata.demo.Greet;

public class App 
{
    public static void main( String[] args )
    {
//        Greet gm=new GoodMorning();
//        gm.wish("Sujata");
    	
    	  ApplicationContext springContainer=new AnnotationConfigApplicationContext(GreetConfiguration.class);
    	  
    	  Greet g1=(Greet)springContainer.getBean("eve");
    	  
    	  g1.wish("Varun");
    }
}
