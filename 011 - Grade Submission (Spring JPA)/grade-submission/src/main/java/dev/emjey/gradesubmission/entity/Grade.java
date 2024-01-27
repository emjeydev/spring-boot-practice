package dev.emjey.gradesubmission.entity;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: Grade.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Grade {

    private Long id;
    private String score;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
