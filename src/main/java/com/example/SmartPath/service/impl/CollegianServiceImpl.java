package com.example.SmartPath.service.impl;

import com.example.SmartPath.dto.*;
import com.example.SmartPath.entity.Collegian;
import com.example.SmartPath.entity.Course;
import com.example.SmartPath.exception.NotFoundException;
import com.example.SmartPath.exception.SaveException;
import com.example.SmartPath.mapper.CollegianMapper;
import com.example.SmartPath.mapper.CourseMapper;
import com.example.SmartPath.repository.CollegianRepository;
import com.example.SmartPath.service.CollegianService;
import com.example.SmartPath.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CollegianServiceImpl implements CollegianService {
    private final CollegianRepository repository;
    private final CourseService courseService;
    private final PasswordEncoder passwordEncoder;
     CourseMapper courseMapper=new CourseMapper();
     CollegianMapper collegianMapper=new CollegianMapper();

    @Override
    public void singUp(CollegianDto collegianDto) {
        Optional<Collegian> collegian=repository.findByUsername(collegianDto.getUsername());
        if(collegian.isPresent()){
            throw new SaveException("This Username is already registered");
        }
        Collegian convert = collegianMapper.convert(collegianDto);
        convert.setPassword(passwordEncoder.encode(collegianDto.getPassword()));
        repository.save(convert);
    }

    @Override
    public ListCourseDto showCourseList(String username) {
        Optional<Collegian> collegian = repository.findByUsername(username);
        List<CourseDto> list=new ArrayList<>();

        if (collegian.isEmpty()) {
            throw new NotFoundException("You entered the wrong username!");
        }


        for (Course course : collegian.get().getCourseList()){
            list.add(courseMapper.convert(course));
        }
        return new ListCourseDto(list);
    }

    @Override
    public void addCourse(AddCourse addCourse) {
        Optional<Collegian> collegian = repository.findByUsername(addCourse.getUsername());
        System.out.println(collegian);
        if (collegian.isEmpty()) {
            throw new NotFoundException("You entered the wrong username!");
        }
        Optional<Course> course=courseService.findByName(addCourse.getCourseName());
        System.out.println(course);
        if (collegian.isEmpty()) {
            throw new NotFoundException("You entered the wrong course name!");
        }
        collegian.get().getCourseList().add(course.get());
        course.get().getPersonList().add(collegian.get());
        courseService.update(course.get());
        repository.save(collegian.get());
    }

    @Override
    public void removeCourse(RemoveCourse removeCourse) {
        Optional<Collegian> collegian = repository.findByUsername(removeCourse.getUsername());
        if (collegian.isEmpty()) {
            throw new NotFoundException("You entered the wrong username!");
        }
        Optional<Course> course=courseService.findByName(removeCourse.getCourseName());
        if (collegian.isEmpty()) {
            throw new NotFoundException("You entered the wrong course name!");
        }
        collegian.get().getCourseList().remove(course.get());
        course.get().getPersonList().remove(collegian.get());
        courseService.update(course.get());
        repository.save(collegian.get());
    }
}
