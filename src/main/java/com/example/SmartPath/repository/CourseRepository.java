package com.example.SmartPath.repository;

import com.example.SmartPath.entity.Collegian;
import com.example.SmartPath.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    void deleteByName(String name);
    Optional<Course> findByName(String name);
}
