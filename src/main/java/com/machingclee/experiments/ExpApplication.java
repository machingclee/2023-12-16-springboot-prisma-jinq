package com.machingclee.experiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner runner(StudentDAO studentDAO) {
	// return (runner) -> {
	// var student = new StudentRecord();
	// student.setFirstName("Super");
	// student.setLastName("James3");
	// student.setEmail("super.james3@gmail.com");
	// studentDAO.create(student);
	// // var student = studentDAO.findByEmail("machingclee@gmail.com");
	// // System.out.println(student);

	// // var students = studentDAO.getStudents();
	// // for (var s : students) {
	// // System.out.println(s);
	// // }
	// };
	// }

}
