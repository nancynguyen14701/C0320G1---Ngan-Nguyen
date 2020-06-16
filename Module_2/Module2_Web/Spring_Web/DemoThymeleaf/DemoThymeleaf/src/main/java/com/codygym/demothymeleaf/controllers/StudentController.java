package com.codygym.demothymeleaf.controllers;

import com.codygym.demothymeleaf.models.Student;
import com.codygym.demothymeleaf.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ModelAndView getHomeStudent(){
        return new ModelAndView("student/index", "students", studentService.getAllStudent());
    }

    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message", "Delete Successful!!");
        studentService.deleteStudentById(id);
        return "redirect:/";
    }

    @GetMapping("/student/edit/{id}")
    public ModelAndView getEditPage(@PathVariable Integer id){
        return new ModelAndView("student/edit", "student", studentService.getStudentById(id));
    }

    @PostMapping("/student/edit")
    public String editStudent(@ModelAttribute Student student
    ,RedirectAttributes redirectAttributes
    ){
        redirectAttributes.addFlashAttribute("message","Edit successful!!");
        studentService.saveStudent(student);
        return "redirect:/";
    }
}
