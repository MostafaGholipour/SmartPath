package com.example.SmartPath.service;

import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.entity.Course;

public interface CourseService {
    void save(CourseDto courseDto);
    void update(Course course);
    void deleteByName(String s);
}
