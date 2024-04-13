package dev.emjey.gradesubmission.repository;


// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: CourseRepository.java
// Date: 2024/01/27
// Modified Date: 2024/04/13
// Email: emjeydev@gmail.com
// Github: emjeydev

import dev.emjey.gradesubmission.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}