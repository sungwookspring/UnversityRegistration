package com.registration.sungwook.service;

import com.registration.sungwook.controller.Dto.CourseRequestCreateDto;
import com.registration.sungwook.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    /***
     * 강의 등록
     */
    @Transactional
    public Long create(CourseRequestCreateDto requestdto){
        return courseRepository.save(requestdto.toEntity()).getId();
    }

}
