package dev.emjey.gradesubmission.entity;

import lombok.*;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: Course.java
// Date: 2024/01/27
// Modified Date: 2024/02/11
// Email: emjeydev@gmail.com
// Github: emjeydev

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private Long id;
    private String subject;
    private String code;
    private String description;

}
