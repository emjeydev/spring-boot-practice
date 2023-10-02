package dev.emjey.gradesubmission;

// This file is made by EmJey
// Project: Grade.java
// FileName: RecordController.java
// Date: 2023/09/11
// Modified Date: 2023/10/02
// Email: emjeydev@gmail.com
// Github: emjeydev

import java.util.UUID;

public class Grade {
    private String name;
    private String subject;
    private String score;
    private String id;

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


//    This is for printing purposes. If we don't have this we can't print it.
    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
