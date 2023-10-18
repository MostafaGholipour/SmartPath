package com.example.SmartPath.service;

import com.example.SmartPath.dto.AddCourse;
import com.example.SmartPath.dto.CollegianDto;
import com.example.SmartPath.dto.ListCourseDto;
import com.example.SmartPath.dto.RemoveCourse;
import jakarta.transaction.Transactional;

public interface CollegianService {
    void singUp(CollegianDto collegianDto);
    ListCourseDto showCourseList(String username);
    @Transactional
    void addCourse (AddCourse addCourse);
    @Transactional
    void removeCourse(RemoveCourse removeCourse);

}
