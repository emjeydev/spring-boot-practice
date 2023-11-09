package dev.emjey.workbookthreepointone.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This file is made by EmJey
// Project: WorkbookThreePointThree
// FileName: UsernameValidator.java
// Date: 2023/11/09
// Modified Date: 2023/11/09
// Email: emjeydev@gmail.com
// Github: emjeydev

public class UsernameValidator implements ConstraintValidator<Username,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]");
        Matcher matcher = pattern.matcher(value);
        boolean badCharacters = matcher.find(); //false if characters are a-z or 0-9

        return !badCharacters;
    }
}
