package fr.formation.developers.domain.dtos;

import fr.formation.developers.validators.Majority;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DevelopperUpdate {
    @Majority
    @NotNull
    private LocalDate birthday;

    public DevelopperUpdate() {
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthDate(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DeveloperUpdate [birthday=" + birthday + "]";
    }
}

