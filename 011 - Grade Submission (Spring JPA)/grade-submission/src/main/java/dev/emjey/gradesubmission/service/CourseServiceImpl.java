package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: CourseServiceImpl.java
// Date: 2024/01/27
// Modified Date: 2024/04/13
// Email: emjeydev@gmail.com
// Github: emjeydev

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    @Override
    public Course getCourse(Long id) {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {        
    }

    @Override
    public List<Course> getCourses() {
        return null;
    }

}
