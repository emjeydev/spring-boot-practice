package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Course;

import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: CourseService.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}