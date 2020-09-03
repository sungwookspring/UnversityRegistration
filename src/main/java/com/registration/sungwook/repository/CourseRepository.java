package com.registration.sungwook.repository;

import com.registration.sungwook.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
