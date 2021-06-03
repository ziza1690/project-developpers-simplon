package fr.formation.developers.repositories;

import fr.formation.developers.domain.dtos.IDeveloperView;
import fr.formation.developers.domain.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    Optional<Developer> findByNickName(String nickname);

    boolean existsByNickName(String value);

    // Optional<IDeveloperView>findByFirstNameAndLastName(String firstname, String lastname);

}
