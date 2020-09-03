package com.registration.sungwook.service;

import com.registration.sungwook.controller.Dto.CourseRequestAllDto;
import com.registration.sungwook.controller.Dto.CourseRequestCreateDto;
import com.registration.sungwook.domain.Course;
import com.registration.sungwook.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    /***
     * 강의 등록
     */
    @Transactional
    public Long create(CourseRequestCreateDto requestdto){
        return courseRepository.save(requestdto.toEntity()).getId();
    }

    /***
     * 모든 수강조회
     * @return
     */
    public List<CourseRequestAllDto> getAll(){
        List<CourseRequestAllDto> courseRequestAllDtos = new ArrayList<>();
        List<Course> allCourse =  courseRepository.findAll();

        allCourse.forEach(course -> courseRequestAllDtos.add(new CourseRequestAllDto(course)));

        return courseRequestAllDtos;
    }
}
