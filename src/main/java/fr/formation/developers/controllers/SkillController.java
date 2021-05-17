package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.SkillCreate;

import fr.formation.developers.domain.dtos.SkillView;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//Ce controlleur va etre de type rest(anotation)
@RestController
@RequestMapping("/skills")
public class SkillController {

    // @leVerbe + mapping ici nous avons un
    @GetMapping("/{id}")
    public SkillView getById(@PathVariable("id") Long id){
        SkillView skill = new SkillView();
        skill.setName("Spring boot");
        return skill;
    }

    // Créé une nouvelle compétence à partir des données récupérée du JSON.
    @PostMapping
    public void create(@Valid @RequestBody SkillCreate skillCreate) {
        System.out.println(skillCreate);
    }

}
