package fr.formation.developers.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UppercaseValidator implements ConstraintValidator<Uppercase, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        // Value doit être en majuscule
        // Si value n'est pas en majuscule alors return false
        // Comparer value à sa version en majuscule
        // Si value est en majuscules alors return false

        if (value == null){
            return true;
        }
        String uppercased = value.toUpperCase();
        return value.equals(uppercased);
    }
}
