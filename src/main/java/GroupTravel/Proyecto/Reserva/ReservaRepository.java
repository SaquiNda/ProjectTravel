package GroupTravel.Proyecto.Reserva;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReservaRepository extends CrudRepository <Reserva, Long>{
    List <Reserva> findAll();
}
