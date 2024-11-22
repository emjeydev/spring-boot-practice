package dev.emjey.grade_submission.exception;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: StudentNotEnrolledException.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class StudentNotEnrolledException extends RuntimeException { 

    public StudentNotEnrolledException(Long studentId, Long courseId) {
        super("The student with id: '" + studentId + "' is not enrolled in the course with id: '" + courseId);
    }
    
}