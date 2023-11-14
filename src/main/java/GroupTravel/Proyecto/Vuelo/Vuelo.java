package GroupTravel.Proyecto.Vuelo;

import GroupTravel.Proyecto.Aerolinea.Aerolinea;
import GroupTravel.Proyecto.Destino.Destino;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Vuelo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String ruta;
    private String horario;
    private float precio;

    //Relacion del vuelo con la aerolinea
    @ManyToOne
    private Aerolinea aerolinea;

    //Relacion del vuelo con el destino
    @ManyToOne
    private Destino destino;
}
