package com.example.SmartPath.repository;

import com.example.SmartPath.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
