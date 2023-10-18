package com.example.SmartPath.controller;

import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/manager")
public class ManagerController {
    private final ManagerService managerService;

    @PostMapping("/addCourse")
    public void addCourse(@RequestBody CourseDto courseDto){
        managerService.addCourse(courseDto);
    }
    @GetMapping("/deleteCourse/{courseId}")
    public void deleteCourse(@PathVariable Long courseId){
        managerService.deleteById(courseId);
    }
    @GetMapping("/updateCourseName/{oldName}/{newName}")
    public void updateCourseName(@PathVariable String oldName,@PathVariable String newName){
        managerService.updateCourseName(oldName,newName);
    }

}
