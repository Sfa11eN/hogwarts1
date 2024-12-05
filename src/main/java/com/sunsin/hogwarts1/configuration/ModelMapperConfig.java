package com.sunsin.hogwarts1.configuration;

import com.sunsin.hogwarts1.model.dto.StudentDto;
import com.sunsin.hogwarts1.model.entity.Faculty;
import com.sunsin.hogwarts1.model.entity.Student;
import org.modelmapper.Condition;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        Condition<Faculty, Faculty> notNullFacility = ctx -> ctx.getSource() != null;
        modelMapper.createTypeMap(Student.class, StudentDto.class).addMappings(mapper ->
                mapper.when(notNullFacility).map(scr -> scr.getFaculty().getId(), StudentDto::setFacultyId));
        modelMapper.createTypeMap(StudentDto.class, Student.class).addMappings(mapper -> mapper.skip(Student::setFaculty));
        return modelMapper;
    }

}
