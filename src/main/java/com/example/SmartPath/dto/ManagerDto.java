package com.example.SmartPath.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ManagerDto {
    String firstName;
    String lastName;
    String username;
    String password;
}
