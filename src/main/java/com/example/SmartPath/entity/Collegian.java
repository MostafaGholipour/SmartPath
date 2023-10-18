package com.example.SmartPath.entity;

import com.example.SmartPath.entity.base.Person;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@Entity
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Collegian extends Person {
    @ManyToMany(mappedBy = "personList",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<Course> courseList=new ArrayList<>();

}