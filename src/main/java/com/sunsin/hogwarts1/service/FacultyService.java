package com.sunsin.hogwarts1.service;

import com.sunsin.hogwarts1.model.dto.FacultyDto;
import com.sunsin.hogwarts1.model.dto.StudentDto;
import com.sunsin.hogwarts1.model.entity.Faculty;
import jakarta.transaction.Transactional;

import java.util.Collection;

public interface FacultyService {
    Collection<Faculty> getFaculties();

    Collection<Faculty> findFacultiesByColor(String color);

    Faculty getFaculty(int id);

    Faculty getFaculty(String name);

    @Transactional
    Faculty updateFaculty(int id, FacultyDto dto);

    Collection<Faculty> findFaculty(String name, String color);

    void deleteFaculty(int id);

    @Transactional
    Faculty addFaculty(FacultyDto dto);

    Collection<StudentDto> getFacultyStudents(int id);
}
