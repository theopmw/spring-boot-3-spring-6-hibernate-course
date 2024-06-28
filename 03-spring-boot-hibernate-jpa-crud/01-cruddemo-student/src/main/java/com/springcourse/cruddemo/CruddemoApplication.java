package com.springcourse.cruddemo;

import com.springcourse.cruddemo.dao.StudentDAO;
import com.springcourse.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
//			createStudent(studentDAO);

			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

//		Create multiple students
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("John", "Doe", "john@test.com");
		Student tempStudent2 = new Student("Mary", "Lamb", "mary@test.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@test.com");

//		Save the student objects
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

//		Create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@test.com");

//		Save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

//		Display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

}
