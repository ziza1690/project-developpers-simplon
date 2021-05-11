package fr.formation.developers.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {UppercaseValidator.class})//ta contrainte de validation c'est une classe
public @interface Uppercase {

    String message() default "Doit être en majuscule";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
