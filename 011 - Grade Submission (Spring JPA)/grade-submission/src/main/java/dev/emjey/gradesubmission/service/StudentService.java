package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Course;
import dev.emjey.gradesubmission.entity.Student;

import java.util.List;
import java.util.Set;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: StudentService.java
 * Date: 2024/01/27
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface StudentService {
    Student getStudent(Long id);

    Student saveStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getStudents();

    Set<Course> getEnrolledCourses(Long id);
}