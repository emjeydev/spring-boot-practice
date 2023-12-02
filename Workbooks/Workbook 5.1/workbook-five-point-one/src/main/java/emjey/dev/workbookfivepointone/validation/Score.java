package emjey.dev.workbookfivepointone.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This file is made by EmJey
// Project: Workbook 5.1
// FileName: Score.java
// Date: 2023/12/02
// Modified Date: 2023/1/02
// Email: emjeydev@gmail.com
// Github: emjeydev


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ScoreValidator.class)
public @interface Score {

    String message() default "Invalid Data";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
