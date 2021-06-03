package fr.formation.developers.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {UniqueSkillNameValidator.class})
public @interface UniqueSkillName {

    String message() default "Skill doit être unique";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
