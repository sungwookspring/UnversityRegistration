package com.registration.sungwook.controller.Dto;

import com.registration.sungwook.domain.Student;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StudentRequestDto {
    private String first_name;
    private String last_name;

    @Builder
    public StudentRequestDto(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Student toEntity(){
        return Student.builder()
                .firstName(first_name)
                .lastName(last_name)
                .build();
    }
}
