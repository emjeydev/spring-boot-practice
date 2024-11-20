package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Course;
import dev.emjey.gradesubmission.entity.Student;

import java.util.List;
import java.util.Set;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: CourseService.java
 * Date: 2024/01/27
 * Modified Date: 2024/11/21
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */

public interface CourseService {
    Course getCourse(Long id);

    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> getCourses();

    Course addStudentToCourse(Long studentId, Long courseId);

    Set<Student> getEnrolledStudents(Long courseId);
}