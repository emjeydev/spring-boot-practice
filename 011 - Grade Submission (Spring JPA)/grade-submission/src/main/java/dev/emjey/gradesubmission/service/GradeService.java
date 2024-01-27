package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Grade;

import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: GradeService.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface GradeService {
    Grade getGrade(Long studentId, Long courseId);
    Grade saveGrade(Grade grade, Long studentId, Long courseId);
    Grade updateGrade(String score, Long studentId, Long courseId);
    void deleteGrade(Long studentId, Long courseId);
    List<Grade> getStudentGrades(Long studentId);
    List<Grade> getCourseGrades(Long courseId);
    List<Grade> getAllGrades();
}
