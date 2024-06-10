package com.springcourse.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

If multiple packages, explicitly list base packages to scan
https://www.udemy.com/course/spring-hibernate-tutorial/learn/lecture/5232922#overview

@SpringBootApplication(
		scanBasePackages = {"com.springcourse.springcoredemo",
				"com.springcourse.util"}
)
*/

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
