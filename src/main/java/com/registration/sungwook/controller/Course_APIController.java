package com.registration.sungwook.controller;

import com.registration.sungwook.controller.Dto.CourseRequestAllDto;
import com.registration.sungwook.controller.Dto.CourseRequestCreateDto;
import com.registration.sungwook.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Course_APIController {
    private final CourseService courseService;

    /***
     * 수강등록
     */
    @PostMapping("/professor/course/enroll")
    public Long enroll(@RequestBody CourseRequestCreateDto requestdto){
        log.info("[*] 수강등록");
        Long saveid = courseService.create(requestdto);
        return saveid;
    }
}
