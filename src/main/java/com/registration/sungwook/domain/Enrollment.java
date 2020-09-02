package com.registration.sungwook.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Enrollment {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ENROLLMENT_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="STUDENT_ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name="COURSE_ID")
    private Course course;
}
