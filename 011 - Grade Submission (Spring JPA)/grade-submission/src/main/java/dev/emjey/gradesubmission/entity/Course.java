package dev.emjey.gradesubmission.entity;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: Course.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Course {

    private Long id;
    private String subject;
    private String code;
    private String description;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
