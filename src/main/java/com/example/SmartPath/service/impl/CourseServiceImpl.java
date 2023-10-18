package com.example.SmartPath.service.impl;

import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.entity.Course;
import com.example.SmartPath.mapper.CourseMapper;
import com.example.SmartPath.repository.CourseRepository;
import com.example.SmartPath.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository repository;
    private final CourseMapper courseMapper;

    @Override
    public void save(CourseDto courseDto) {
        Course course = courseMapper.convert(courseDto);
        repository.save(course);
    }

    @Override
    public void update(Course course) {
        repository.save(course);
    }

    @Override
    public void deleteByName(String s) {
        repository.deleteByName(s);
    }
}
