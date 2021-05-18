package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperView;

public interface DeveloperService {
    DeveloperView getByNickName(String nickName);
}
