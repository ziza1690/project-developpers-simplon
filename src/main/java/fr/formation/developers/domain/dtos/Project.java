package fr.formation.developers.domain.dtos;


import javax.validation.constraints.*;
import java.time.LocalDate;

public class Project {

    @NotNull
    @NotBlank
    @Size(min = 1, max =255)
    private String name;

    //qui ne contient pas d'espace
    @NotBlank
    @NotNull
    @Size(min = 100, max =1000)
    private String description;

    //obligatoire
    @NotNull
    //supérieure ou égale à la date du jour
    @FutureOrPresent
    private LocalDate startDate;

    @NotNull
    @Future
    private LocalDate endDate;

    //si présent alors supérieur à zéro
    @PositiveOrZero
    int budget;

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", budget=" + budget +
                '}';
    }
}
