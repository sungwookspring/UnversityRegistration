package com.registration.sungwook.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Student extends BaseTimeEntinity{

    @Builder
    public Student(String lastName, String firstName) {
        LastName = lastName;
        FirstName = firstName;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false)
    private String FirstName;

    @OneToMany(mappedBy = "student")
    List<Enrollment> enrollments;
}
