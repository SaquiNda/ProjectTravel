package GroupTravel.Proyecto.PaqueteViaje;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PaqueteViajeRepository extends CrudRepository <PaqueteViaje, Long>{
    List <PaqueteViaje> findAll();
}
