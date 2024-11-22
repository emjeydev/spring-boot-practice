package dev.emjey.grade_submission.repository;

import java.util.List;
import java.util.Optional;

import dev.emjey.grade_submission.entity.Grade;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;


/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: GradeRepository.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface GradeRepository extends CrudRepository<Grade, Long> {
    Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);

    List<Grade> findByStudentId(Long studentId);

    List<Grade> findByCourseId(Long courseId);

    @Transactional
    void deleteByStudentIdAndCourseId(Long studentId, Long courseId);

}