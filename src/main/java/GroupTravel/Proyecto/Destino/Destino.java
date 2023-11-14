package GroupTravel.Proyecto.Destino;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_destino;
    private String name;
    private String description;
    private byte image;
    private String tarifa;
}
