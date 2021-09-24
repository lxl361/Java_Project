package com.zd.ssm.controller;

import com.zd.ssm.model.Student;
import com.zd.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired(required = false)
    private StudentService studentService;
    @GetMapping("/student")
    public String studnet(Model model) {
        List<Student> student=new ArrayList<>();
        model.addAttribute("students",studentService.allStudent());
        return "student";
    }
}
