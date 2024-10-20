package dev.emjey.gradesubmission.repository;

import dev.emjey.gradesubmission.entity.Grade;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: GradeRepository.java
 * Date: 2024/01/27
 * Modified Date: 2024/10/20
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */

public interface GradeRepository extends CrudRepository<Grade, Long> {
    Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
    @Transactional
    void deleteByStudentIdAndCourseId(Long studentId, Long courseId);
    List<Grade> findByStudentId(Long studentId);
    List<Grade> findByCourseId(Long courseId);
}