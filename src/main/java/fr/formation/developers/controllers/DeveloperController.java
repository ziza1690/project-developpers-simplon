package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.domain.dtos.DevelopperUpdate;
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
        /*DeveloperCreate developerCreate = new DeveloperCreate();
        LocalDate date = LocalDate.of(2021, 03, 16);

        developerCreate.setNickName("Supman");
        developerCreate.setFirstName("toto");
        developerCreate.setLastName("tata");
        developerCreate.setBirthday(date);*/
        System.out.println("testons cela");
        return service.getByNickName(nickName);
    }

    @PostMapping
    public void create(@RequestBody DeveloperCreate developerCreate) {
        System.out.println(developerCreate);
    }


    @PatchMapping("/{nickname}/birthday")
    public void updateBirthday(@PathVariable("nickname") String nickname,
                                @Valid @RequestBody DevelopperUpdate partial) {
       // System.out.println("Partial object=" + partial);
       // DeveloperCreate developerCreate = new DeveloperCreate();
        // developerCreate.setNickName(nickname);
        // developerCreate.setFirstName("Ziza");
        //developerCreate.setLastName("SYLLA");
        // developerCreate.setBirthday(partial.getBirthday());

        System.out.println("Update birth date of: " + nickname
                + " with new date : " + partial.getBirthday());
    }
}

