package com.example.SmartPath.repository;

import com.example.SmartPath.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    void deleteByName(String name);
}
