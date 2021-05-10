package fr.formation.developers.entities;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DeveloperCreate {

    @NotNull
    private String nickName;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private static LocalDate birthday;

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

    public static LocalDate getBirthday() {
        return birthday;
    }

    public static void setBirthday(LocalDate birthday) {
        DeveloperCreate.birthday = birthday;
    }
}
