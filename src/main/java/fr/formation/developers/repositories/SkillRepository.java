package fr.formation.developers.repositories;

import fr.formation.developers.domain.entities.Developer;
import fr.formation.developers.domain.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    Optional<Skill> findByName(String name);

    boolean existsByName(String value);
}
