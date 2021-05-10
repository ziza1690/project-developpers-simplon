package fr.formation.developers.entities;

import javax.validation.constraints.Future;
import java.time.LocalDate;

public class ProjectEnd {

    @Future
    private LocalDate endDate;

    public ProjectEnd() {
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ProjectEnd{" +
                "endDate=" + endDate +
                '}';
    }
}
