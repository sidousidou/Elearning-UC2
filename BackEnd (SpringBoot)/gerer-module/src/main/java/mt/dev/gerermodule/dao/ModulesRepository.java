package mt.dev.gerermodule.dao;

import mt.dev.gerermodule.entitie.module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin("*")
@RepositoryRestResource
@Repository
public interface ModulesRepository extends JpaRepository<module,Long> {

}
