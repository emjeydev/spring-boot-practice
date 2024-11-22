package dev.emjey.grade_submission.service;

import dev.emjey.grade_submission.entity.Grade;

import java.util.List;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: GradeService.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface GradeService {
    Grade getGrade(Long studentId, Long courseId);

    Grade saveGrade(Grade grade, Long studentId, Long courseId);

    Grade updateGrade(String score, Long studentId, Long courseId);

    void deleteGrade(Long studentId, Long courseId);

    List<Grade> getStudentGrades(Long studentId);

    List<Grade> getCourseGrades(Long courseId);

    List<Grade> getAllGrades();
}
