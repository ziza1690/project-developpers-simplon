package fr.formation.developers.entities;

import com.sun.istack.internal.NotNull;

public class Skill {

    @NotNull
    private String name;

    // Constructeur par defaut très important
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
