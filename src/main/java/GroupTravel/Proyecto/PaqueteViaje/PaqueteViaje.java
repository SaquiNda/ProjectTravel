package GroupTravel.Proyecto.PaqueteViaje;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PaqueteViaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_paquete;
    private long id_destino;
    private String fecha_viaje;
    private String itinerario;
    private String precio;
}
