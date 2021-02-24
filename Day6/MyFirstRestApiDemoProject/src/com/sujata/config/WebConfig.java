package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//Components : the classes annotated with @Component,@Service,@Repository,@RestController,@Controller 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sujata.controller")
public class WebConfig implements WebMvcConfigurer {

	
	/*
	 * Configure a handler to delegate unhandled requests by forwarding to the 
	 * Servlet's container "default" servlet.
	 */
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
		
	}
	
	
}
