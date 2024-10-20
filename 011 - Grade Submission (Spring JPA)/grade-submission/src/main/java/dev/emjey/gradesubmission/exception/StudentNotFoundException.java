package dev.emjey.gradesubmission.exception;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: StudentNotFoundException.java
 * Date: 2024/10/20
 * Modified Date: 2024/10/20
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(Long id) {
        super("The student id '" + id + "' does not exist in our records");
    }

}