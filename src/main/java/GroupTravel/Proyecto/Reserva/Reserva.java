package GroupTravel.Proyecto.Reserva;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_reserva;
    private long id_cliente;
    private long id_paquete;
    private long id_hotel;
    private Date fecha_reserva;
}
