package fr.formation.developers.controllers;

import fr.formation.developers.entities.Skill;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//Ce controlleur va etre de type rest(anotation)
@RestController
@RequestMapping("/skills")
public class SkillController {

    // @leVerbe + mapping ici nous avons un Get
    @GetMapping("/{id}")
    public Skill getById(@PathVariable("id") Long id){
        Skill skill = new Skill();
        skill.setName("Spring boot");
        return skill;
    }

    // Créé une nouvelle compétence à partir des données récupérée du JSON.
    @PostMapping
    public void create(@Valid @RequestBody Skill skill) {
        System.out.println(skill);
    }

}
