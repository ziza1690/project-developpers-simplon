package fr.formation.developers.domain.dtos;

import fr.formation.developers.validators.Majority;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DeveloperUpdate {
    @Majority
    @NotNull
    private LocalDate birthday;

    public DeveloperUpdate() {
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DeveloperUpdate [birthday=" + birthday + "]";
    }
}

