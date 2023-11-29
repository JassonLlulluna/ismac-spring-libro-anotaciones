package com.distribuida.principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Libro;

@Configuration
@ComponentScan("com.distribuida")
@PropertySource("classpath:datosempresa.properties")

public class Config {
	
	
	//CREAR UN BEAN A NIVEL DE METODO
	@Bean("cliente")
	public Cliente cliente() {
		return new Cliente();
	}
	
	@Bean
	public Libro producto() {
		return new Libro();
	}
	
	
	
	
	
	
	
	

}
