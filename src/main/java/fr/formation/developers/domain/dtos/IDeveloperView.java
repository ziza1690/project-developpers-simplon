package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public interface IDeveloperView {
    String getNickName();

    LocalDate getBirthDay();
}
