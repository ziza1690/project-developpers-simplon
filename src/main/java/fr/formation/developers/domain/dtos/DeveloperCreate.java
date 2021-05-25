package fr.formation.developers.domain.dtos;

import fr.formation.developers.validators.Majority;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DeveloperCreate {

    @NotNull
    private String nickName;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @Majority
    @NotNull
    private  LocalDate birthday;

    public DeveloperCreate() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
