package com.machingclee.hibernatetest;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.machingclee.hibernatetest.dao.StudentDAO;

@SpringBootApplication
public class HibernatetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatetestApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDAO studentDAO) {
		return (runner) -> {
			// var student = new Student("James", "Lee", "machingclee@gmail.com");
			// studentDAO.create(student);
			var student = studentDAO.findByEmail("machingclee@gmail.com");
			System.out.println(student);
		};
	}

}
