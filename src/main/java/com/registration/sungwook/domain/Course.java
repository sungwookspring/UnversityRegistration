package com.registration.sungwook.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Course {

    @Builder
    public Course(String title, int grade) {
        this.title = title;
        this.grade = grade;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="COURSE_ID")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int grade;
}
