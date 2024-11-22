package dev.emjey.grade_submission.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import dev.emjey.grade_submission.entity.Course;
import dev.emjey.grade_submission.entity.Student;
import dev.emjey.grade_submission.exception.EntityNotFoundException;
import dev.emjey.grade_submission.repository.StudentRepository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: StudentServiceImpl.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

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

    @Override
    public Set<Course> getEnrolledCourses(Long id) {
        Student student = getStudent(id);
        return student.getCourses();
    }

    static Student unwrapStudent(Optional<Student> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, Student.class);
    }

}