package com.example.SmartPath.mapper;

import com.example.SmartPath.dto.CollegianDto;
import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.entity.Collegian;
import com.example.SmartPath.entity.Course;

public class CourseMapper {
    public Course convert(CourseDto courseDto) {
        Course course = new Course();
        course.setName(courseDto.getName());
        course.setSpan(courseDto.getSpan());
        return course;
    }

    public CourseDto convert(Course course) {
        CourseDto courseDto =new CourseDto();
        courseDto.setName(course.getName());
        courseDto.setSpan(course.getSpan());
        return courseDto;
    }
}
