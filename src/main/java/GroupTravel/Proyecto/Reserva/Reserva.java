package GroupTravel.Proyecto.Reserva;


import GroupTravel.Proyecto.Cliente.Cliente;
import GroupTravel.Proyecto.Habitacion.Habitacion;
import GroupTravel.Proyecto.Hotel.Hotel;
import GroupTravel.Proyecto.PaqueteViaje.PaqueteViaje;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_reserva;
    private String fecha_reserva;

    //Relacion para traer el id del cliente
    @ManyToOne
    private Cliente cliente;

    //Relacion para traer el id del hotel
    @ManyToOne
    private Hotel hotel;

    //Relacion para traer el id del paquete
    @ManyToOne
    private PaqueteViaje paqueteViaje;

    //Relacion para traer el id de la habitacion 
    @ManyToOne
     private Habitacion habitacion;
}
