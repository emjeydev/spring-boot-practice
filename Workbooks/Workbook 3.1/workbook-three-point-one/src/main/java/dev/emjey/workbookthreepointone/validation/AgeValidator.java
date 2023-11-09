package dev.emjey.workbookthreepointone.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Date;
import java.util.concurrent.TimeUnit;

// This file is made by EmJey
// Project: WorkbookThreePointThree
// FileName: AgeValidator.java
// Date: 2023/11/09
// Modified Date: 2023/11/09
// Email: emjeydev@gmail.com
// Github: emjeydev

public class AgeValidator implements ConstraintValidator<Age, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext constraintValidatorContext) {
        long diff = new Date().getTime() - value.getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);

        return false;
    }
}
