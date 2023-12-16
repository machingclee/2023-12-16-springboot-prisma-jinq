package com.machingclee.jooq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.machingclee.jooq.dao.StudentDAO;

@SpringBootApplication
public class JooqApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooqApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDAO studentDAO) {
		return (runner) -> {
			// var student = new StudentRecord();
			// "Super", "James", "machingclee@gmail.com"
			// student.setFirstName("Super");
			// student.setLastName("James");
			// student.setEmail("super.james@gmail.com");
			// studentDAO.create(student);
			// var student = studentDAO.findByEmail("machingclee@gmail.com");
			// System.out.println(student);

			var students = studentDAO.getStudents();
			for (var s : students) {
				System.out.println(s);
			}
		};
	}

}
