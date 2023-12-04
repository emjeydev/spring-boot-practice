package dev.emjey.gradesubmission.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission.java
// FileName: ScoreValidator.java
// Date: 2023/11/09
// Modified Date: 2023/12/04
// Email: emjeydev@gmail.com
// Github: emjeydev

public class ScoreValidator implements ConstraintValidator<Score, String> {
    List<String> scores = Arrays.asList(
            "A+", "A", "A-",
            "B+", "B", "B-",
            "C+", "C", "C-",
            "D+", "D", "D-",
            "F"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        for (String str : scores) {
            if (value.equals(str))
                return true;
        }
        return false;
    }
}
