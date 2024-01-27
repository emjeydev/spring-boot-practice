package dev.emjey.gradesubmission.entity;

import java.time.LocalDate;


// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: Student.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev


public class Student {

    private Long id;
    private String name;
    private LocalDate birthDate;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
