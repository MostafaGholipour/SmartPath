package com.example.SmartPath.entity;

import com.example.SmartPath.entity.base.BaseEntity;
import com.example.SmartPath.entity.base.Person;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends BaseEntity<Long> {
    String name;
    int span;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Set<Person> personList=new HashSet<>();

    public Course(String name, int span) {
        this.name = name;
        this.span = span;
    }
}
