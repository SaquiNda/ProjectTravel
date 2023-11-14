package GroupTravel.Proyecto.Habitacion;

import java.util.Date;

import GroupTravel.Proyecto.Hotel.Hotel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
    
    //Relacion para traer el id del hotel
    @ManyToOne
    private Hotel hotel;
}
