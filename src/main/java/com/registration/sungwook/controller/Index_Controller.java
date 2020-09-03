package com.registration.sungwook.controller;

import com.registration.sungwook.controller.Dto.StudentRequestAll;
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
        return "register";
    }

    /***
     * 관리자 - 모든 학생목록
     * @return
     */
    @GetMapping("/admin/student/list")
    public String ALLstudents(Model model){
        List<StudentRequestAll> allstudents = studentService.getAllStudents();
        model.addAttribute("students", allstudents);

        return "admin/student/studentlist";
    }
}
