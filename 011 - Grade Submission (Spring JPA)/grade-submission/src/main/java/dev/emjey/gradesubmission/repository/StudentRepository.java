package dev.emjey.gradesubmission.repository;


// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: StudentRepository.java
// Date: 2024/01/27
// Modified Date: 2024/02/11
// Email: emjeydev@gmail.com
// Github: emjeydev

import dev.emjey.gradesubmission.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}