package emjey.dev.workbookfivepointone.pojo;

import java.util.UUID;


import emjey.dev.workbookfivepointone.validation.Score;
import jakarta.validation.constraints.NotBlank;

// This file is made by EmJey
// Project: Workbook 5.1
// FileName: Grade.java
// Date: 2023/12/02
// Modified Date: 2023/1/02
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Grade {

    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Subject cannot be blank")
    private String subject;
    @Score(message = "Score must be a letter grade")
    private String score;
    private String id;


    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

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
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
