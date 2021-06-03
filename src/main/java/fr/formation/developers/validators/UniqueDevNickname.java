package fr.formation.developers.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {UniqueDevNicknameValidator.class})
public @interface UniqueDevNickname {

    String message() default "Le pseudo doit être unique";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
