package com.registration.sungwook.service;


import com.registration.sungwook.controller.Dto.StudentRequestDto;
import com.registration.sungwook.domain.Student;
import com.registration.sungwook.repository.StudentRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void 회원가입(){
        //given
        StudentRequestDto studentRequestDto = StudentRequestDto.builder()
                .first_name("abc")
                .last_name("ttt")
                .build();

        //when
        studentService.join(studentRequestDto);

        //then
        List<Student> all = studentRepository.findAll();
        Assertions.assertThat(all.get(0).getFirstName()).isEqualTo(studentRequestDto.getFirst_name());
        Assertions.assertThat(all.get(0).getLastName()).isEqualTo(studentRequestDto.getLast_name());
    }

}