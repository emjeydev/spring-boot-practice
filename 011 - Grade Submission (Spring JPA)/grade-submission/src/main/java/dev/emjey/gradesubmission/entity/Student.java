package dev.emjey.gradesubmission.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: Student.java
// Date: 2024/01/27
// Modified Date: 2024/02/11
// Email: emjeydev@gmail.com
// Github: emjeydev


@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

}
