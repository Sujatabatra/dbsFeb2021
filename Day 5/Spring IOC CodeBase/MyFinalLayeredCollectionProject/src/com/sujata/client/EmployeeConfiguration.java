package com.sujata.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.dao.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeServiceImpl;

@Configuration
public class EmployeeConfiguration {

	@Bean("dao")
	public EmployeeDaoImpl getDaoImpl(){
		return new EmployeeDaoImpl();
	}
	
	@Bean("service")
	public EmployeeServiceImpl getService(){
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.setEmpDao(getDaoImpl());
		return service;
	}
	
	@Bean("presentation")
	public EmployeePresentationImpl getPresentation(){
		return new EmployeePresentationImpl(getService());
	}
}
