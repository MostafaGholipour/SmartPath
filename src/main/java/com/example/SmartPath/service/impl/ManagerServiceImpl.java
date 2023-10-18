package com.example.SmartPath.service.impl;

import com.example.SmartPath.dto.CourseDto;
import com.example.SmartPath.dto.ManagerDto;
import com.example.SmartPath.entity.Course;
import com.example.SmartPath.entity.Manager;
import com.example.SmartPath.exception.NotFoundException;
import com.example.SmartPath.mapper.ManagerMapper;
import com.example.SmartPath.repository.ManagerRepository;
import com.example.SmartPath.service.CourseService;
import com.example.SmartPath.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository repository;
    private final CourseService courseService;
    private final PasswordEncoder passwordEncoder;
    ManagerMapper managerMapper = new ManagerMapper();


    @Override
    public void singUp(ManagerDto managerDto) {
        Manager convert = managerMapper.convert(managerDto);
        System.out.println(managerDto);
        convert.setPassword(passwordEncoder.encode(managerDto.getPassword()));
        repository.save(convert);
    }

    @Override
    public void addCourse(CourseDto courseDto) {
        courseService.save(courseDto);
    }

    @Override
    public void deleteById(Long Id) {
        courseService.deleteById(Id);
    }

    @Override
    public void updateCourseName(String oldName, String newName) {
        Optional<Course> course = courseService.findByName(oldName);
        if(course.isEmpty()){
            throw new NotFoundException("You entered the wrong course name!");
        }
        course.get().setName(newName);
        courseService.update(course.get());
    }
}
