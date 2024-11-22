package dev.emjey.grade_submission.exception;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: GradeNotFoundException.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class GradeNotFoundException extends RuntimeException { 

    public GradeNotFoundException(Long studentId, Long courseId) {
        super("The grade with student id: '" + studentId + "' and course id: '" + courseId + "' does not exist in our records");
    }
    
}