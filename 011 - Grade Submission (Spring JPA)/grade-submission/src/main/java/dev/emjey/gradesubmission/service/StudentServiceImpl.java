package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Student;
import dev.emjey.gradesubmission.exception.StudentNotFoundException;
import dev.emjey.gradesubmission.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring JPA
 * FileName: StudentServiceImpl.java
 * Date: 2024/01/27
 * Modified Date: 2024/10/20
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return unwrapStudent(student, id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    static Student unwrapStudent(Optional<Student> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new StudentNotFoundException(id);
    }
}