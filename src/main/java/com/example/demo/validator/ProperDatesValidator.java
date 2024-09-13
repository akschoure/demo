package com.example.demo.validator;

import com.example.demo.dto.CricketMatch;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProperDatesValidator implements ConstraintValidator<ProperDates, CricketMatch> {

  @Override
  public boolean isValid(CricketMatch cricketMatch, ConstraintValidatorContext constraintValidatorContext) {
    System.out.println("Validating dates");
    return cricketMatch.getStartDate().isBefore(cricketMatch.getEndDate());
  }

}
