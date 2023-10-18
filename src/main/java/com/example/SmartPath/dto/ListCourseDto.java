package com.example.SmartPath.dto;

import lombok.*;

import java.util.List;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListCourseDto {
    List<CourseDto> list;
}
