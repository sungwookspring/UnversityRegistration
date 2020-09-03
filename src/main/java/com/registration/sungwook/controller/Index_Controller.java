package com.registration.sungwook.controller;

import com.registration.sungwook.controller.Dto.CourseRequestAllDto;
import com.registration.sungwook.controller.Dto.StudentRequestAllDto;
import com.registration.sungwook.service.CourseService;
import com.registration.sungwook.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class Index_Controller {
    private final StudentService studentService;
    private final CourseService courseService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    /***
     * 회권가입 창
     * @return
     */
    @GetMapping("/student/register")
    public String registerForm(){
        return "student/register";
    }

    /***
     * 교수 - 수강등록 페이지
     * todo - 교수 엔티티
     * @return
     */
    @GetMapping("/professor/course/enroll")
    public String enrollCourseForm(){
        return "professor/enroll_course";
    }

    /***
     * 관리자 - 모든 학생목록
     * @return
     */
    @GetMapping("/admin/student/list")
    public String ALLstudents(Model model){
        List<StudentRequestAllDto> allstudents = studentService.getAllStudents();
        model.addAttribute("students", allstudents);

        return "admin/student/studentlist";
    }

    /***
     * 모든강의 조회
     * @param model
     * @return
     */
    @GetMapping("/course/all")
    public String AllCoursesForStudent(Model model){
        List<CourseRequestAllDto> allCourse = courseService.getAll();
        model.addAttribute("courses", allCourse);

        return "student/courselist";
    }

    /***
     * 교수 - 모든강의 조회
     * @param model
     * @return
     */
    @GetMapping("/professor/course/all")
    public String AllCoursesForProfessor(Model model){
        List<CourseRequestAllDto> allCourse = courseService.getAll();
        model.addAttribute("courses", allCourse);

        return "professor/courselist";
    }
}
