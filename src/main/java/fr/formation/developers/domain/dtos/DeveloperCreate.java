package fr.formation.developers.domain.dtos;

import fr.formation.developers.validators.Majority;
import fr.formation.developers.validators.UniqueDevNickname;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DeveloperCreate {

    @NotNull
    @UniqueDevNickname
    private String nickName;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @Majority
    @NotNull
    private  LocalDate birthday;
    @NotNull
    private Long mainSkillId;

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

    public Long getMainSkillId() {
        return mainSkillId;
    }

    public void setMainSkillId(Long mainSkillId) {
        this.mainSkillId = mainSkillId;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DeveloperCreate{" +
                "nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", mainSkillId=" + mainSkillId +
                '}';
    }
}
