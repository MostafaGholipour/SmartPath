package com.example.SmartPath.controller;

import com.example.SmartPath.dto.AddCourse;
import com.example.SmartPath.dto.ListCourseDto;
import com.example.SmartPath.dto.RemoveCourse;
import com.example.SmartPath.service.CollegianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/collegian")
public class CollegianController {

    private final CollegianService service;


    @GetMapping("/showCourseList/{username}")
    public ListCourseDto showCourseList(@PathVariable String username) {
        return service.showCourseList(username);
    }

    @PostMapping("/addCourse")
    public void addCourse(@RequestBody AddCourse addCourse) {
        service.addCourse(addCourse);
    }
    @PostMapping("/removeCourse")
    public void removeCourse(@RequestBody RemoveCourse removeCourse) {
        service.removeCourse(removeCourse);
    }
}
