package fr.formation.developers.validators;


import fr.formation.developers.repositories.DeveloperRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueDevNicknameValidator implements ConstraintValidator<UniqueDevNickname, String> {

    public final DeveloperRepository devs;

    public UniqueDevNicknameValidator(DeveloperRepository devs) {
        this.devs = devs;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){
            return true;
        }

        return !devs.existsByNickName(value);
    }
}
