package GroupTravel.Proyecto.Habitacion;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface HabitacionRepository extends CrudRepository <Habitacion, Long> {
    List<Habitacion> findAll();

}
