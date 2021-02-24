package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformerConfiguration {
	
	//if we are not giving the name attribute of the name ,name will b the name of function 
	@Bean
	public Dancer Anju(){
		return new Dancer("Free Style");
	}

	@Bean(name="Niharika")
	public Juggler getJuggler(){
		return new Juggler(5);
	}
	
	@Bean
	public Singer Pavan(){
		Singer singer=new Singer();
		singer.setSong("LALALALA");
		return singer;
	}
	
	@Bean
	public Guitar guitar(){
		return new Guitar();
	}
	
	@Bean
	public Drum drum(){
		return new Drum();
	}
	
	@Bean
	public Tabla tabla(){
		return new Tabla();
	}
	
	@Bean(name="Radha")
	public Instrumentalist getInstrumentalist(){
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(drum());
		return instrumentalist;
	}
	
	@Bean(name="Fikki")
	public Stage getStage(){
		return new Stage(Anju());
	}
}
