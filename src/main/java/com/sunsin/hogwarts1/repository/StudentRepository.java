package com.sunsin.hogwarts1.repository;

import com.sunsin.hogwarts1.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {


    Collection<Student> findAllByAge(int age);

    Collection<Student> findAllByFacultyId(int id);

    Collection<Student> findAllByAgeBetween(int minAge, int maxAge);

    Collection<Student> findAllByAgeIn(List<Integer> age);
}
