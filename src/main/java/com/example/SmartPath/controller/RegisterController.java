package com.example.SmartPath.controller;

import com.example.SmartPath.dto.CollegianDto;
import com.example.SmartPath.dto.ManagerDto;
import com.example.SmartPath.service.CollegianService;
import com.example.SmartPath.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/register")
public class RegisterController {
    private final CollegianService collegianService;
    private final ManagerService managerService;

    @PostMapping("/singup-collegian")
    public void singUpCollegian(@RequestBody CollegianDto collegianDto) {
        collegianService.singUp(collegianDto);
    }

    @PostMapping("/singup-manager")
    public void singUpManager(@RequestBody ManagerDto managerDto) {
        managerService.singUp(managerDto);
    }
}
