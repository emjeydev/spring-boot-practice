package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Course;
import dev.emjey.gradesubmission.entity.Grade;
import dev.emjey.gradesubmission.entity.Student;
import dev.emjey.gradesubmission.repository.CourseRepository;
import dev.emjey.gradesubmission.repository.GradeRepository;
import dev.emjey.gradesubmission.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: GradeServiceImpl.java
// Date: 2024/01/27
// Modified Date: 2024/04/13
// Email: emjeydev@gmail.com
// Github: emjeydev


@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService {

    GradeRepository gradeRepository;

    StudentRepository studentRepository;

    CourseRepository courseRepository;
    
    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        return gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
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
        Grade grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        grade.setScore(score);
        return gradeRepository.save(grade);
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
