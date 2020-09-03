package com.registration.sungwook.controller;

import com.registration.sungwook.controller.Dto.CourseRequestCreateDto;
import com.registration.sungwook.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Course_APIController {
    private final CourseService courseService;

    /***
     * 수강등록
     */
    @PostMapping("/professor/course/enroll")
    public Long enroll(@RequestBody CourseRequestCreateDto requestdto){
        Long saveid = courseService.create(requestdto);
        return saveid;
    }
}
