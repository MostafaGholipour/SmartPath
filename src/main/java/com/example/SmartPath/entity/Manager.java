package com.example.SmartPath.entity;

import com.example.SmartPath.entity.base.Person;
import com.example.SmartPath.entity.enums.UserRole;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Manager extends Person {
    public Manager(String firstName, String lastName
            , String username, String password) {
        super(firstName, lastName, username, password, UserRole.MANAGER, true);
    }
}
