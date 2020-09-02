package com.registration.sungwook.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="COURSE_ID")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int grade;
}
