package fr.formation.developers.domain.entities;

import fr.formation.developers.validators.Majority;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_day")
    private  LocalDate birthday;
    // 1 Developer maitrise 1 Skill
    // 1 Skill est maitrisee par N Developer
    //
    // 1 Developer ToOne Skill
    // Many Developers to One Skill
    // 1 Skill ToMany Developer
    // One Skill toMany Developers
    // @Many(Developers)ToOne(Skill)
    @ManyToOne
    @JoinColumn(name = "main_skill_id", nullable = false)
    private Skill mainSkill;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Skill getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(Skill mainSkill) {
        this.mainSkill = mainSkill;
    }
}
