package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.dtos.IDeveloperView;

public interface DeveloperService {
    DeveloperView getByNickName(String nickName);

    void create(DeveloperCreate dto);

    void updateBirthDay(String nickname, DeveloperUpdate partial);

   // IDeveloperView find();
}