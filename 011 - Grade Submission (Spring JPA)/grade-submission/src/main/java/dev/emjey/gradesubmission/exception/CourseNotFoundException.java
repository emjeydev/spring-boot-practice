package dev.emjey.gradesubmission.exception;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: CourseNotFoundException.java
 * Date: 2024/10/20
 * Modified Date: 2024/10/20
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class CourseNotFoundException extends RuntimeException { 

    public CourseNotFoundException(Long id) {
        super("The course id '" + id + "' does not exist in our records");
    }
    
}