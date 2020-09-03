package com.registration.sungwook.repository;

import com.registration.sungwook.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
