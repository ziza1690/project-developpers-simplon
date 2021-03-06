package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.dtos.IDeveloperView;
import fr.formation.developers.services.DeveloperService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/developers")
public class DeveloperController {
    private final DeveloperService service;

    public DeveloperController(DeveloperService service) {
        this.service = service;
    }

    @GetMapping("/{nickname}")
    public DeveloperView getByNickName (@PathVariable("nickname") String nickName){
        return service.getByNickName(nickName);
    }

    @PostMapping
    //ici nous allons utiliser le dto
    public void create(@RequestBody DeveloperCreate dto) {
        service.create(dto);
    }


    @PatchMapping("/{nickname}/birthday")
    public void updateBirthday(@PathVariable("nickname") String nickname,
                                @Valid @RequestBody DeveloperUpdate partial) {
        service.updateBirthDay(nickname, partial);
    }


    /*@GetMapping("/find")
    public IDeveloperView find(){
        return service.find();

    }*/
}

