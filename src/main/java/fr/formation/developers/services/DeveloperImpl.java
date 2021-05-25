package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

import fr.formation.developers.domain.dtos.IDeveloperView;
import fr.formation.developers.domain.entities.Developer;
import fr.formation.developers.repositories.DeveloperRepository;

import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class DeveloperImpl implements DeveloperService {

    private final DeveloperRepository repository;

    //Injection du repository par constructeur
    public DeveloperImpl(DeveloperRepository repository) {
        this.repository = repository;
    }

    //Get by Nicknama
    @Override
    public DeveloperView getByNickName(String nickName) {

        Developer entity = repository.findByNickName(nickName).get();
        DeveloperView view = new DeveloperView();
        view.setNickName(entity.getNickName());
        view.setFirstName(entity.getFirstName());
        view.setLastName(entity.getLastName());
        view.setBirthday(entity.getBirthday());
        return view;
    }

    //Create
    @Override
    public void create(DeveloperCreate dto) {
        Developer entity = new Developer();
        entity.setNickName(dto.getNickName());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setBirthday(dto.getBirthday());

        repository.save(entity);
    }

    //Update
    public void updateBirthDay(String nickname, @Valid DeveloperUpdate partial) {
        Developer entity = repository.findByNickName(nickname).get();
        entity.setBirthday(partial.getBirthday());
        repository.save(entity);
    }

   /* public IDeveloperView find(){
        String firstName = "Tata";
        String lastName = "SYLLA";
        return repository.findByFirstNameAndLastName(firstName, lastName).get();
    }*/
}
