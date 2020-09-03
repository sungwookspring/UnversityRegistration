package com.registration.sungwook.service;

import com.registration.sungwook.controller.Dto.CourseRequestCreateDto;
import com.registration.sungwook.domain.Course;
import com.registration.sungwook.repository.CourseRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CourseServiceTest {
    @Autowired
    CourseService courseService;

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void 강의등록(){
        //given
        CourseRequestCreateDto coursedto1 = CourseRequestCreateDto.builder()
                .title("전공1")
                .grade(3)
                .build();

        CourseRequestCreateDto coursedto2 = CourseRequestCreateDto.builder()
                .title("전공2")
                .grade(3)
                .build();

        //when
        courseService.create(coursedto1);
        courseService.create(coursedto2);

        //then
        List<Course> allCourses = courseRepository.findAll();

        Assertions.assertThat(allCourses.size()).isGreaterThan(0);
        Assertions.assertThat(allCourses.get(0).getTitle()).isEqualTo(coursedto1.getTitle());
        Assertions.assertThat(allCourses.get(1).getTitle()).isEqualTo(coursedto2.getTitle());
    }

}