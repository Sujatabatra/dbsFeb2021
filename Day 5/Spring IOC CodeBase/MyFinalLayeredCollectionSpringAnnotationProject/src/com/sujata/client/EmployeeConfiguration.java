package com.sujata.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.dao.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeServiceImpl;

/*
 * Component Scan make scanning of all packages mentioned in basePackages 
 * and look for classes annotated with @Component, @Service and @Repository and then spring container runs life cycle for all the respective classes
 * annotated with @Component, @Service and @Repository
 * 
 */
@Configuration
@ComponentScan(basePackages="com.sujata") 
public class EmployeeConfiguration {

	
}
