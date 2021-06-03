package fr.formation.developers.domain.dtos;

import fr.formation.developers.validators.UniqueSkillName;
import fr.formation.developers.validators.Uppercase;

import javax.validation.constraints.NotBlank;

public class SkillCreate {

    @NotBlank
    @Uppercase
    @UniqueSkillName
    private String name;

    // Constructeur par defaut
    public SkillCreate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                '}';
    }

}
