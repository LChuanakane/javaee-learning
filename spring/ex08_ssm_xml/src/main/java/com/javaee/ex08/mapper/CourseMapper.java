package com.javaee.ex08.mapper;

import com.javaee.ex08.po.Course;
import java.util.List;
public interface CourseMapper {
    List<Course> findCourses();
    Course findCourseById(int id);
}

