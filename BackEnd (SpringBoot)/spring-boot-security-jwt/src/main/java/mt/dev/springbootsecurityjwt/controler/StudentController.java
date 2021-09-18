package mt.dev.springbootsecurityjwt.controler;



import mt.dev.springbootsecurityjwt.model.students;
import mt.dev.springbootsecurityjwt.repository.studentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/")
public class StudentController {
@Autowired
    private studentsRepository repository;
//get all students
    @GetMapping("/students")
    public List<students> GetAllStudent(){
        return repository.findAll();
    }

 //create Students rest api
    @PostMapping("/students")
public students creeetudiant(@RequestBody students e) {
        return repository.save(e);
}

    @GetMapping(value = "/students/{id}")
    public Optional<students> getStudentById(@PathVariable Long id) {
        return repository.findById(id);
    }
    /*
    public ResponseEntity<etudient> getStudentById(@PathVariable long id){
        etudient e = repository.findById(id).orElseThrow(()-> new ResourceNotFoundExeption("Prodect not found whithe this id : "+id));
         return ResponseEntity.ok(e);
    */
    @PutMapping (value = "/students")
    public void updateProduit(@RequestBody students e) {

        repository.save(e);
    }
    /*@PutMapping (value = "/students/{id}")
    public void updateProduit( @PathVariable Long id, etudient e) {
        Optional<etudient> e1 =repository.findById(id);
        e1.setFirstName(e.getFirstName());
        e1.setLastName(e.getLastName());
        e1.setIdemail(e.getIdemail());
                repository.save(e1);
    }*/
    @DeleteMapping (value = "/students/{id}")
    public void supprimerProduit(@PathVariable Long id) {

     repository.deleteById(id);
    }
    @GetMapping("/user/{username}/{password}")
    students login(@PathVariable String username,@PathVariable String password){
        return repository.findUserByUsernameAndPasseword(username,password);
    }
}
