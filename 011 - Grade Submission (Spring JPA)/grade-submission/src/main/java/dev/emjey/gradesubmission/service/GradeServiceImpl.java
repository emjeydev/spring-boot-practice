package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Course;
import dev.emjey.gradesubmission.entity.Grade;
import dev.emjey.gradesubmission.entity.Student;
import dev.emjey.gradesubmission.exception.GradeNotFoundException;
import dev.emjey.gradesubmission.repository.CourseRepository;
import dev.emjey.gradesubmission.repository.GradeRepository;
import dev.emjey.gradesubmission.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: GradeServiceImpl.java
 * Date: 2024/01/27
 * Modified Date: 2024/10/20
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService {

    GradeRepository gradeRepository;

    StudentRepository studentRepository;

    CourseRepository courseRepository;

    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        if (grade.isPresent()) {
            return grade.get();
        } else {
            throw new GradeNotFoundException(studentId, courseId);
        }
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId).get();
        Course course = courseRepository.findById(courseId).get();
        grade.setStudent(student);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        if (grade.isPresent()) {
            Grade unwrappedGrade = grade.get();
            unwrappedGrade.setScore(score);
            return gradeRepository.save(unwrappedGrade);
        } else {
            throw new GradeNotFoundException(studentId, courseId);
        }
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {

    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return null;
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return null;
    }

    @Override
    public List<Grade> getAllGrades() {
        return null;
    }

}
