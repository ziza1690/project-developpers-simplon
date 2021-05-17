package fr.formation.developers.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class MajorityValidator implements ConstraintValidator<Majority, LocalDate> {


    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {

           return LocalDate.now().isAfter(localDate.plusYears(18) );
       }
    }
