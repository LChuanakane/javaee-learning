package com.javaee.ex08.service.impl;

import com.javaee.ex08.mapper.CourseMapper;
import com.javaee.ex08.po.Course;
import com.javaee.ex08.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public List<Course> findCourses(){
        return courseMapper.findCourses();
    }

    public Course findCourseById(int id){
        return courseMapper.findCourseById(id);
    }
}