package com.sunsin.hogwarts1.mapper;

import com.sunsin.hogwarts1.model.dto.FacultyDto;
import com.sunsin.hogwarts1.model.entity.Faculty;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FacultyMapper {

    private final ModelMapper modelMapper;

    public FacultyMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Faculty toEntity(FacultyDto dto) {
        return modelMapper.map(dto, Faculty.class);
    }

    public FacultyDto toDto(Faculty faculty) {
        return modelMapper.map(faculty, FacultyDto.class);
    }
}
