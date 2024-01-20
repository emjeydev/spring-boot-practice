package dev.emjey.workbookninepointone.service;

import dev.emjey.workbookninepointone.entity.Student;

import java.util.List;


// This file is made by EmJey
// Project: Workbook 9.1 - GradeSubmission
// FileName: StudentService.java
// Date: 2024/01/20
// Modified Date: 2024/01/20
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
}