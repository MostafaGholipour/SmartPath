package com.example.SmartPath.entity;

import com.example.SmartPath.entity.base.Person;
import com.example.SmartPath.entity.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Collegian extends Person {
    @ManyToMany(mappedBy = "personList",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    Set<Course> courseList=new HashSet<>();

    public Collegian(String firstName, String lastName,
                     String username, String password) {
        super(firstName, lastName, username, password, UserRole.COLLEGIAN, true);
    }
}
