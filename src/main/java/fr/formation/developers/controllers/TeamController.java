package fr.formation.developers.controllers;


import fr.formation.developers.domain.dtos.Team;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/teams")
public class TeamController {
   // Team team;

    @GetMapping("/{name}")
    public Team getByName(@PathVariable("name") String name){
        Team team = new Team();
        team.setName(name);
        team.setAgile(true);

        return team;
    }

    //Create team
    @PostMapping
    public void create(@Valid @RequestBody Team team){
        //this.team = team;
        System.out.println("create: " + team);
    }
    
    //Delete team by name
    @DeleteMapping("/{name}")
    public void deleteTeam(@PathVariable("name") String name){
        System.out.println("delete: " + name);
    }
}
