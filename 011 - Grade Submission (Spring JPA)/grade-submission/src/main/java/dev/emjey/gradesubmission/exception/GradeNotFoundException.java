package dev.emjey.gradesubmission.exception;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: GradeNotFoundException.java
 * Date: 2024/10/20
 * Modified Date: 2024/10/20
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class GradeNotFoundException extends RuntimeException { 

    public GradeNotFoundException(Long studentId, Long courseId) {
        super("The grade with student id: '" + studentId + "' and course id: '" + courseId + "' does not exist in our records");
    }
    
}