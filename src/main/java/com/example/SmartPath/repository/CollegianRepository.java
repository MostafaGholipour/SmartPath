package com.example.SmartPath.repository;

import com.example.SmartPath.entity.Collegian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CollegianRepository extends JpaRepository<Collegian,Long> {
    @Query("select m from Collegian m where m.username=?1")
    Optional<Collegian> findByUsername(String user);
}
