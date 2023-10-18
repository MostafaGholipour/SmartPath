package com.example.SmartPath.service;

import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.entity.Course;
import jakarta.transaction.Transactional;

import java.util.Optional;

public interface CourseService {
    @Transactional
    void save(CourseDto courseDto);
    @Transactional
    void update(Course course);
    @Transactional
    void deleteByName(String s);
    @Transactional
    void deleteById(Long id);
    Optional<Course> findByName(String name);
}
