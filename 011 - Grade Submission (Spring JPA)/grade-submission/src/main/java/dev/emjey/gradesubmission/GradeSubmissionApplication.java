package dev.emjey.gradesubmission;

import dev.emjey.gradesubmission.entity.Student;
import dev.emjey.gradesubmission.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: GradeSubmissionApplication.java
// Date: 2024/01/27
// Modified Date: 2024/02/11
// Email: emjeydev@gmail.com
// Github: emjeydev

@SpringBootApplication
public class GradeSubmissionApplication implements CommandLineRunner {

    @Autowired
    StudentService studentService;
    public static void main(String[] args) {
        SpringApplication.run(GradeSubmissionApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Student[] students = new Student[]{
                new Student(1L, "Harry Potter", LocalDate.parse(("1980-07-31"))),
                new Student(2L, "Ron Weasley", LocalDate.parse(("1980-03-01"))),
                new Student(3L, "Hermione Granger", LocalDate.parse(("1979-09-19"))),
                new Student(4L, "Neville Longbottom", LocalDate.parse(("1980-07-30")))
        };

        for (int i = 0; i < students.length; i++) {
            studentService.saveStudent(students[i]);
        }
    }
}
