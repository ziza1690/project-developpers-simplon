package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperView;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

@Service
public class DeveloperImpl implements DeveloperService {
    @Override
    public DeveloperView getByNickName(String nickName) {
        DeveloperView developer = new DeveloperView();
        LocalDate date = LocalDate.of(2021, 03, 16);

        developer.setNickName("Supman");
        developer.setFirstName("toto");
        developer.setLastName("tata");
        developer.setBirthday(date);
        return developer;
    }
}
