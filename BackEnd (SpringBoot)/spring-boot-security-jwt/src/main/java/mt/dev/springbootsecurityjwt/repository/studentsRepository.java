package mt.dev.springbootsecurityjwt.repository;


import mt.dev.springbootsecurityjwt.model.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentsRepository extends JpaRepository<students, Long> {
  //  etudient findById(int id);
  students findUserByUsernameAndPasseword(String username, String passeword);
}
