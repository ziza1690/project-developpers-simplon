package fr.formation.developers.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Team {

    @NotNull
    @Size(min = 1, max =255)
    private  String name;
    private  boolean agile;

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAgile() {
        return agile;
    }

    public void setAgile(boolean agile) {
        this.agile = agile;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", agile=" + agile +
                '}';
    }
}
