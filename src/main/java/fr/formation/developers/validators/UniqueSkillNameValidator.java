package fr.formation.developers.validators;

import fr.formation.developers.repositories.SkillRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueSkillNameValidator implements ConstraintValidator<UniqueSkillName, String> {

    private final SkillRepository skills;

    public UniqueSkillNameValidator(SkillRepository skills) {
        this.skills = skills;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){
            return true;

        }
        //Existe-t-il un objet dont le nom = value
        //select * from skills where name = "JAVA" =>true =>false
        // Si java existe en tant que competence alors c'est pas valide
        //select * from skills where name = "Javascript" =>false =>true
        // Si javascript n'exisste pa alors c'est valide
        return !skills.existsByName( value); //inverse existByName
    }
}
