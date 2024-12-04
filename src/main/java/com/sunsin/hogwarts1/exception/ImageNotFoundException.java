package com.sunsin.hogwarts1.exception;

public class ImageNotFoundException extends RuntimeException {
    public ImageNotFoundException(long studentId) {

        super("Image not found for student Id: " + studentId);
    }
}
