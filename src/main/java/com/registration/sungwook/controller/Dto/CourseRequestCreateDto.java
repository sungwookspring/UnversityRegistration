package com.registration.sungwook.controller.Dto;

import com.registration.sungwook.domain.Course;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CourseRequestCreateDto {

    private String title;
    private int grade;

    @Builder
    public CourseRequestCreateDto(String title, int grade) {
        this.title = title;
        this.grade = grade;
    }

    public Course toEntity(){
        return Course.builder()
                .grade(grade)
                .title(title)
                .build();
    }
}
