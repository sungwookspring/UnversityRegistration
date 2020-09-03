package com.registration.sungwook.service;

import com.registration.sungwook.controller.Dto.CourseRequestAllDto;
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

    @Test
    public void 모든강의_조회(){
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
        List<CourseRequestAllDto> allCourses =  courseService.getAll();

        Assertions.assertThat(allCourses.size()).isEqualTo(2);
        Assertions.assertThat(allCourses.get(0).getTitle()).isEqualTo(coursedto1.getTitle());
        Assertions.assertThat(allCourses.get(1).getTitle()).isEqualTo(coursedto2.getTitle());
    }

}