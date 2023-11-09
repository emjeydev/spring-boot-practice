package dev.emjey.workbookthreepointone.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This file is made by EmJey
// Project: WorkbookThreePointThree
// FileName: Age.java
// Date: 2023/11/09
// Modified Date: 2023/11/09
// Email: emjeydev@gmail.com
// Github: emjeydev

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

    String message() default "INVALID AGE";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
