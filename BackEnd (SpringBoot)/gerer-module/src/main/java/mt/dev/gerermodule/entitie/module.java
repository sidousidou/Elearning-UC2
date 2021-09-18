package mt.dev.gerermodule.entitie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;
    String NomModule ;
    String courProf;
    String tdProf;
    String tpProf;
    @OneToMany( mappedBy="module" ,cascade = CascadeType.ALL)
    private Collection<cour> p;
}
