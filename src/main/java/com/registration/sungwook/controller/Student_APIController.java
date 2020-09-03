package com.registration.sungwook.controller;

import com.registration.sungwook.controller.Dto.StudentRequestDto;
import com.registration.sungwook.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Student_APIController {
    private final StudentService studentService;

    @PostMapping("/student/register")
    public Long register(@RequestBody StudentRequestDto requestDto){
        Long saveId = studentService.join(requestDto);
        return saveId;
    }
}
