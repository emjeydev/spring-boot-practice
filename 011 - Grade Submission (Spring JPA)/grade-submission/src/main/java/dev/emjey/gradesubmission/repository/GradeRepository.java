package dev.emjey.gradesubmission.repository;


// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: GradeRepository.java
// Date: 2024/01/27
// Modified Date: 2024/02/11
// Email: emjeydev@gmail.com
// Github: emjeydev


import dev.emjey.gradesubmission.entity.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade, Long> {
    Grade findByStudentIdAndCourseId(Long studentId, Long courseId);
}