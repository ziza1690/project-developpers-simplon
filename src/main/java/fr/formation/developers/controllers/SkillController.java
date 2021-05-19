package fr.formation.developers.controllers;

import fr.formation.developers.domain.dtos.SkillCreate;

import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//Ce controlleur va etre de type rest(anotation)
@RestController
@RequestMapping("/skills")
public class SkillController {
  // @Autowired ou  @inject dans javaEE au moment de construire, le constrolleur va instancier SkillService new: injecter une instance dans la classe concrete.
   private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @GetMapping("/{id}")  // @leVerbe + mapping ici nous avons un
    public SkillView getById(@PathVariable("id") Long id){
        //ici nous avons mis ce comtenu dans Serviceimpl
        System.out.println("call in controller CONTR");
        return service.getById(id);
    }

    // Créé une nouvelle compétence à partir des données récupérée du JSON.
    @PostMapping
    public void create(@Valid @RequestBody SkillCreate dto) {
        //System.out.println("call in controller CONTR");
        service.create(dto);

    }

    @GetMapping("/skills/{name}/by-name")
    public SkillView getByName(@PathVariable("name") String name) {
        return service.getByName(name);
    }

}
