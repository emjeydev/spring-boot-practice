package dev.emjey.workbookninepointone.service;

import dev.emjey.workbookninepointone.entity.Course;

import java.util.List;

// This file is made by EmJey
// Project: Workbook 9.1 - GradeSubmission
// FileName: CourseService.java
// Date: 2024/01/20
// Modified Date: 2024/01/20
// Email: emjeydev@gmail.com
// Github: emjeydev

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}