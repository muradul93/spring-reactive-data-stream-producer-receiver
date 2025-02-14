package com.murad.reactive;

import com.murad.reactive.student.Student;
import com.murad.reactive.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class ReactiveAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveAppApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//		return args -> {
//			// inserting student data
//			for (int i = 0; i < 100; i++) {
//				studentRepository.save(
//						Student.builder()
//								.firstname("firstname" + i)
//								.lastname("lastname" + i)
//								.age(new Random().nextInt(40) + 10)
//								.build()
//				).subscribe();
//			}
//		};
//	}

}