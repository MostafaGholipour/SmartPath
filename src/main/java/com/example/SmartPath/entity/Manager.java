package com.example.SmartPath.entity;

import com.example.SmartPath.entity.base.Person;
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
}
