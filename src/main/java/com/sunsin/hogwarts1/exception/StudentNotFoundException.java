package com.sunsin.hogwarts1.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(long id) {
        super("Student with id " + id + " not found");
    }
}
