package dev.emjey.gradesubmission.exception;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: StudentNotEnrolledException.java
 * Date: 2024/11/21
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class StudentNotEnrolledException extends RuntimeException { 

    public StudentNotEnrolledException(Long studentId, Long courseId) {
        super("The student with id: '" + studentId + "' is not enrolled in the course with id: '" + courseId);
    }
    
}