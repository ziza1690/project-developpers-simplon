package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
    @Override
    public SkillView getById(Long id) { // ici nous avons deplace ce bloc de SkillController
        System.out.println("call in controller IMPL");
        SkillView skill = new SkillView();
        skill.setName("Spring boot");
        return skill;
    }

    @Override
    public void create(SkillCreate skill) {
        System.out.println(skill);
        System.out.println("call in controller");
    }
}
