package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.SkillRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {

    //@Autowired
    private final  SkillRepository repository;

    public SkillServiceImpl(SkillRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillView getById(Long id) { // ici nous avons deplace ce bloc de SkillController
        /*System.out.println("call in controller IMPL");
        SkillView skill = new SkillView();
        skill.setName("Spring boot");
        return skill;*/
        Skill skill = repository.findById(id).get();
        SkillView view = new SkillView();
        view.setName(skill.getName());
        return view;
    }

    @Override
    public void create(SkillCreate dto) {
        System.out.println(dto);
        Skill skill = new Skill();
        //sauvegarder Skill dans la base
        skill.setName(dto.getName());
        repository.save(skill);
    }

    @Override
    public SkillView getByName(String name) {
        Skill skill = repository.findByName(name).get();
        SkillView view = new SkillView();
        view.setName(skill.getName());
        return view;
    }
}
