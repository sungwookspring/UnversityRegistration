package com.registration.sungwook;

import com.registration.sungwook.controller.Dto.StudentRequestDto;
import com.registration.sungwook.repository.StudentRepository;
import com.registration.sungwook.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@RequiredArgsConstructor
public class SungwookApplication {
	private final StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SungwookApplication.class, args);
	}

	/***
	 * 학생등록 SQL
	 * @param
	 * @return
	 */
	@Bean
	public CommandLineRunner RegisterStudent() {
		return (args) -> {
			studentService.join(StudentRequestDto.builder()
					.first_name("a1")
					.last_name("b1")
					.build());
			studentService.join(StudentRequestDto.builder()
					.first_name("a2")
					.last_name("b2")
					.build());
			studentService.join(StudentRequestDto.builder()
					.first_name("a3")
					.last_name("b3")
					.build());
			studentService.join(StudentRequestDto.builder()
					.first_name("a3")
					.last_name("b3")
					.build());
		};
	}
}
