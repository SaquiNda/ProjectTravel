package GroupTravel.Proyecto.Aerolinea;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_aerolinea;
    private String name;
    private String description;
}
