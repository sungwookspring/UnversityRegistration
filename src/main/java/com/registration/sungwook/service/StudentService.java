package com.registration.sungwook.service;

import com.registration.sungwook.controller.Dto.StudentRequestAllDto;
import com.registration.sungwook.controller.Dto.StudentRequestDto;
import com.registration.sungwook.domain.Student;
import com.registration.sungwook.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StudentService {
    private final StudentRepository studentRepository;

    /***
     * 회원가입
     * @param studentDto
     */
    @Transactional
    public Long join(StudentRequestDto studentDto){
        return studentRepository.save(studentDto.toEntity()).getId();
    }

    /***
     * 관리자 - 모든 회원 조회
     * @return
     */
    public List<StudentRequestAllDto> getAllStudents(){
        List<Student> allstudents =  studentRepository.findAll();
        List<StudentRequestAllDto> studentRequestAllDto = new ArrayList<>();

        allstudents.forEach(student -> studentRequestAllDto.add(new StudentRequestAllDto(student)));

        return studentRequestAllDto;
    }
}
