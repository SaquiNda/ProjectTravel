package GroupTravel.Proyecto.PaqueteViaje;


import GroupTravel.Proyecto.Destino.Destino;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PaqueteViaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_paquete;
    private String fecha_viaje;
    private String itinerario;
    private String precio;

    //Relacion para traer el id del destino
    @ManyToOne
    private Destino destino;
}
