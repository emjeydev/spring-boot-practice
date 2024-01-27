package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Student;

import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: StudentService.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev


public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
}