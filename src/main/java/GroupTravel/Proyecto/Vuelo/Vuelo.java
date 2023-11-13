package GroupTravel.Proyecto.Vuelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Vuelo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String ruta;
    private String horario;
    private String aerolinea;
    private float precio;
}
