package GroupTravel.Proyecto.Vuelo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface VueloRepository extends CrudRepository <Vuelo, Long> {
    List<Vuelo> findAll();

}
