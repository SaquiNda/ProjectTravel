package GroupTravel.Proyecto.Habitacion;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Habitacion {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private Date fechaIngreso;
    private Date fechaSalida;
    private int nHabitacion;
    
}
