package com.registration.sungwook.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class Student extends BaseTimeEntinity{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false)
    private String FirstName;

    @OneToMany(mappedBy = "enrollment")
    List<Enrollment> enrollments;
}
