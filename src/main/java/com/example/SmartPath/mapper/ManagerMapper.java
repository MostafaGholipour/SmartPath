package com.example.SmartPath.mapper;

import com.example.SmartPath.dto.CollegianDto;
import com.example.SmartPath.dto.ManagerDto;
import com.example.SmartPath.entity.Collegian;
import com.example.SmartPath.entity.Manager;

public class ManagerMapper {
    public Manager convert(ManagerDto managerDto){
        Manager manager =new Manager(managerDto.getFirstName(),
                managerDto.getFirstName(),managerDto.getUsername(),
                managerDto.getPassword());

        return manager;
    }
}
