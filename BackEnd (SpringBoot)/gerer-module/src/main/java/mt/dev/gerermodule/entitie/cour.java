package mt.dev.gerermodule.entitie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;
    String Nomfilecours ;

    @ManyToOne(fetch = FetchType.LAZY)
    private module module;
}
