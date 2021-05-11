package fr.formation.developers.entities;

import com.sun.istack.internal.NotNull;
import fr.formation.developers.validators.Uppercase;

public class Skill {

    @Uppercase
    private String name;

    // Constructeur par defaut
    public Skill() {

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
