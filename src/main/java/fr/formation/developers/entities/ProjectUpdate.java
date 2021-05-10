package fr.formation.developers.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class ProjectUpdate {

    @NotNull
    @Size(min = 100, max =1000)
    private String description;

    @PositiveOrZero
    int budget;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
