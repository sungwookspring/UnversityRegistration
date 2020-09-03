package com.registration.sungwook.controller.Dto;

import com.registration.sungwook.domain.Student;
import lombok.Getter;

import java.time.LocalDateTime;

/***
 * 관리자 - 모든 회원가입 정보 출력
 */
@Getter
public class StudentRequestAll {
    private Long id;
    private String first_name;
    private String last_name;
    private LocalDateTime created_time;

    public StudentRequestAll(Student entity) {
        id = entity.getId();
        first_name = entity.getFirstName();
        last_name = entity.getLastName();
        created_time = entity.getCreateDate();
    }
}