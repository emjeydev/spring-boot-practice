package dev.emjey.grade_submission.service;

import dev.emjey.grade_submission.entity.Course;
import dev.emjey.grade_submission.entity.Student;

import java.util.List;
import java.util.Set;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: CourseService.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface CourseService {
    Course getCourse(Long id);

    Course saveCourse(Course course);

    void deleteCourse(Long id);

    Course addStudentToCourse(Long studentId, Long courseId);

    List<Course> getCourses();

    Set<Student> getEnrolledStudents(Long id);
}