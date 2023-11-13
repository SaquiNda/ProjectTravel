package GroupTravel.Proyecto.Hotel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Hotel {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String ubicacion;
    private int numHabitaciones;
    private float tarifa;
}
