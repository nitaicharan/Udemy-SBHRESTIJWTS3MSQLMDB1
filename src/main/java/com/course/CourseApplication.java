package com.course;

import com.course.dominio.Pessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquin@gmail.com");
		Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");
		
		SpringApplication.run(CourseApplication.class, args);
	}

}
