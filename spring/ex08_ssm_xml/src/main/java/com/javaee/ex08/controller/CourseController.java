package com.javaee.ex08.controller;

import com.javaee.ex08.po.Course;
import com.javaee.ex08.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Course> courses = courseService.findCourses();
        model.addAttribute("courses", courses);
        return "course/course_list";
    }
    @RequestMapping("/detail")
    public String detail(@RequestParam("id") int id, Model model){
        Course course = courseService.findCourseById(id);
        model.addAttribute("course", course);
        return "course/course_detail";
    }
}

