package com.example.SmartPath.mapper;

import com.example.SmartPath.dto.CollegianDto;
import com.example.SmartPath.entity.Collegian;

public class CollegianMapper {
    public CollegianDto convert(Collegian collegian){
        CollegianDto dto=new CollegianDto();
        dto.setFirstName(collegian.getFirstName());
        dto.setLastName(collegian.getLastName());
        dto.setUsername(collegian.getUsername());
        dto.setPassword(collegian.getPassword());
        return dto;
    }
    public Collegian convert(CollegianDto collegianDto){
        Collegian collegian=new Collegian();
        collegian.setFirstName(collegianDto.getFirstName());
        collegian.setLastName(collegianDto.getLastName());
        collegian.setUsername(collegianDto.getUsername());
        collegian.setPassword(collegianDto.getPassword());
        return collegian;
    }

}
