package com.registration.sungwook.service;

import com.registration.sungwook.controller.Dto.StudentRequestDto;
import com.registration.sungwook.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
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
}
