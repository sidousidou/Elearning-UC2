package mt.dev.gerermodule.web;

import mt.dev.gerermodule.dao.CoursRepository;
import mt.dev.gerermodule.dao.ModulesRepository;
import mt.dev.gerermodule.entitie.cour;
import mt.dev.gerermodule.entitie.module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
public class gestionResteControler {
    @Autowired
    private ModulesRepository modulesRepository ;
    @Autowired
    private CoursRepository repository;
    @PostMapping("/ajouterUnModule")
    public module ajouterUnModule(@RequestBody module e) {
        return modulesRepository.save(e);
    }
    @PostMapping("/ajouterUncour")
    public cour ajouterUnCour(@RequestBody cour c) {        return repository.save(c);    }

    @PutMapping(value = "/module")
    public void updateProduit(@RequestBody module e) {

        modulesRepository.save(e);
    }
    /*@GetMapping(value = "/module")
    public void SHOWMODULE() {
        modulesRepository.findAll();
    }*/

    @GetMapping(value = "/students/{id}")
    public Optional<module> getStudentById(@PathVariable Long id) {
        return modulesRepository.findById(id);
    }

    @DeleteMapping (value = "/module/{id}")
    public void supprimerProduit(@PathVariable Long id) {

        modulesRepository.deleteById(id);
    }

  /*  @DeleteMapping (value = "/module/{id}")
    public void supprimerProduit(@PathVariable Long id) {

        modulesRepository.deleteById(id);
    }*/
}
