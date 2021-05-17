package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DeveloperView {

    private String nickName;
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public DeveloperView() {
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

    public  LocalDate getBirthday() {
        return birthday;
    }

    public  void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DeveloperView{" +
                "nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
