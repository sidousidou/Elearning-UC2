package mt.dev.gerermodule.dao;

import mt.dev.gerermodule.entitie.cour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface CoursRepository extends JpaRepository<cour,Long> {


    @RestResource(path = "/getcbym")
    public List<cour> findByModule_Id(@Param("i")int i);
}
