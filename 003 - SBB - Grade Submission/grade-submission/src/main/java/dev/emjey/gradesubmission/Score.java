package dev.emjey.gradesubmission;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This file is made by EmJey
// Project: GradeSubmission.java
// FileName: Score.java
// Date: 2023/11/09
// Modified Date: 2023/11/09
// Email: emjeydev@gmail.com
// Github: emjeydev

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ScoreValidator.class)
public @interface Score {

    // According to SpringBoot Documents when we are using constraints we have to add Group and Payload.
    String message() default "Invalid Data";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
