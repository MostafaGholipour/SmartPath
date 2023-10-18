package com.example.SmartPath.entity;

import com.example.SmartPath.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "orders")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends BaseEntity<Long> {
    String name;
    int span;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Person> personList=new ArrayList<>();
}
