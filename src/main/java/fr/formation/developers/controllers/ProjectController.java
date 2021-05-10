package fr.formation.developers.controllers;


import fr.formation.developers.entities.Project;
import fr.formation.developers.entities.ProjectEnd;
import fr.formation.developers.entities.ProjectUpdate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    //Create project
    @PostMapping
    public void create(@Valid @RequestBody Project project){

        System.out.println("create: " + project);
    }

    //Update project by description and budget
    @PatchMapping("/{name}/description")
    public void updateDescription(@PathVariable("name") String name,
                                @Valid @RequestBody ProjectUpdate partial) {
        System.out.println("Update : " + name
                + " with new description : " + partial.getDescription() + " \n" + " The budget is "+  partial.getBudget());
    }

    @DeleteMapping("/{name}/endDate")
    public void deleteTeam(@PathVariable("name") String name, @Valid @RequestBody ProjectEnd projectEnd ){

        System.out.println("Close: " + name + " " + " your project at "+  projectEnd.getEndDate() + " is close");
    }
}


