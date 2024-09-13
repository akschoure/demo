package com.example.demo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ProperDatesValidator.class)
@Documented
public @interface ProperDates {
  String message() default "{ProperDates.invalid}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
