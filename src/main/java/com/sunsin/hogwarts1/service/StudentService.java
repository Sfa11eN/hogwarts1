package com.sunsin.hogwarts1.service;

import com.sunsin.hogwarts1.model.dto.StudentDto;
import com.sunsin.hogwarts1.model.entity.Student;
import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.List;

public interface StudentService {
    @Transactional
    Student addStudent(StudentDto studentDto);

    @Transactional
    Student updateStudent(long id, StudentDto studentDto);

    void deleteStudent(long id);

    Student getStudent(Long id);

    Collection<Student> getAllStudents();

    Collection<Student> findStudentByAge(List<Integer> age);

    Collection<Student> findStudentByFaculty(String faculty);

    Collection<Student> findStudentByFaculty(int facultyId);
}
