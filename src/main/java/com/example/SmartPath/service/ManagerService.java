package com.example.SmartPath.service;

import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.dto.ManagerDto;
import jakarta.transaction.Transactional;

public interface ManagerService {
    @Transactional
    void  singUp (ManagerDto managerDto);
    @Transactional
    void addCourse(CourseDto courseDto);
    @Transactional
    void deleteById(Long Id);
    @Transactional
    void updateCourseName(String oldName, String newName);


}
