package dev.emjey.grade_submission.service;

import java.util.List;
import java.util.Optional;

import dev.emjey.grade_submission.entity.Course;
import dev.emjey.grade_submission.entity.Grade;
import dev.emjey.grade_submission.entity.Student;
import dev.emjey.grade_submission.exception.GradeNotFoundException;
import dev.emjey.grade_submission.exception.StudentNotEnrolledException;
import dev.emjey.grade_submission.repository.CourseRepository;
import dev.emjey.grade_submission.repository.GradeRepository;
import dev.emjey.grade_submission.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: GradeServiceImpl.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService {
    
    private GradeRepository gradeRepository;
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    
    @Override
    public Grade getGrade(Long studentId, Long courseId) {
         Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
         return unwrapGrade(grade, studentId, courseId);
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = StudentServiceImpl.unwrapStudent(studentRepository.findById(studentId), studentId);
        Course course = CourseServiceImpl.unwrapCourse(courseRepository.findById(courseId), courseId);
        if (!student.getCourses().contains(course)) throw new StudentNotEnrolledException(studentId, courseId);
        grade.setStudent(student);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        Grade unwrappedGrade = unwrapGrade(grade, studentId, courseId);
        unwrappedGrade.setScore(score);
        return gradeRepository.save(unwrappedGrade);
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {
        gradeRepository.deleteByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return gradeRepository.findByCourseId(courseId);
    }

    @Override
    public List<Grade> getAllGrades() {
        return (List<Grade>) gradeRepository.findAll();
    }

    static Grade unwrapGrade(Optional<Grade> entity, Long studentId, Long courseId) {
        if (entity.isPresent()) return entity.get();
        else throw new GradeNotFoundException(studentId, courseId);
    }

}
