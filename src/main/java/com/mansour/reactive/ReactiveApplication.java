package com.mansour.reactive;

import com.mansour.reactive.students.Student;
import com.mansour.reactive.students.StudentRepo;
import com.mansour.reactive.students.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(StudentRepo studentRepo){
		return args -> {
			for (int i=0;i<100;i++){
				studentRepo.save(Student.builder()
								.firstname("mansour "+i)
								.lastname("ben "+i)
								.age(i)

						.build()).subscribe();


			}

		};

	}

}
