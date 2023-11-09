package dev.emjey.workbookthreepointone.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This file is made by EmJey
// Project: WorkbookThreePointThree
// FileName: Username.java
// Date: 2023/11/09
// Modified Date: 2023/11/09
// Email: emjeydev@gmail.com
// Github: emjeydev

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UsernameValidator.class)
public @interface Username {

    String message() default "INVALID UserName";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
