package fr.formation.developers.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//indiquer au framework que la bdd gere la genretion de la valeur de la clé ex: auto increment avec mysql
    private Long id;

    @Column(name = "skill_name", nullable = false)
    private String name;

    public Skill() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
