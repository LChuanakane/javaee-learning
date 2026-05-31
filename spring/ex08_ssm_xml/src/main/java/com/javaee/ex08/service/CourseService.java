package com.javaee.ex08.service;

import com.javaee.ex08.po.Course;
import java.util.List;
public interface CourseService {
    List<Course> findCourses();
    Course findCourseById(int id);
}

