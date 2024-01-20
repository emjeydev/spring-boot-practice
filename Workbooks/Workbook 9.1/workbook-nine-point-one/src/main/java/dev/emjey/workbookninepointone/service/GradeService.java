package dev.emjey.workbookninepointone.service;

import dev.emjey.workbookninepointone.entity.Grade;

import java.util.List;


// This file is made by EmJey
// Project: Workbook 9.1 - GradeSubmission
// FileName: GradeService.java
// Date: 2024/01/20
// Modified Date: 2024/01/20
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
