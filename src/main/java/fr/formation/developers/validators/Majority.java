package fr.formation.developers.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

@Constraint(validatedBy = {MajorityValidator.class})
public @interface Majority {

    String message() default "L'utilisateur doit être majeur";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
