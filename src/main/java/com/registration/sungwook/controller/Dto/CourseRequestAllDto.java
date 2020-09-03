package com.registration.sungwook.controller.Dto;

import com.registration.sungwook.domain.Course;
import lombok.Getter;

@Getter
public class CourseRequestAllDto {
    private Long id;
    private String title;
    private int grade;

    public CourseRequestAllDto(Course entity) {
        id = entity.getId();
        title = entity.getTitle();
        grade = entity.getGrade();
    }
}
