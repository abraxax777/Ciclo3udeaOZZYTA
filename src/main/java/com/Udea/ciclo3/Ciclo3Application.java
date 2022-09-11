package com.Udea.ciclo3;


import entidades.Empresa;
import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
public class Ciclo3Application {

	@GetMapping("/hello world")
	public String hello(){
		return "hola coclo 3 ...lo voy a sacar adelante!";
	}
	@GetMapping("/test")//este get mapping es para testear
	public String test(){
		Empresa empresa= new Empresa("solar","sanjo","3178718738","00000");
		System.out.println();
		empresa.setNombre("slaris lmnrr"); //seteamos un nuevo nombre

		return empresa.getNombre(); // devuelve el nombre de la empresa

	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
		System.out.println("hola mundo");
	}

}
