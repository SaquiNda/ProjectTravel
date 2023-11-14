package GroupTravel.Proyecto.Aerolinea;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AerolineaRepository extends CrudRepository <Aerolinea, Long>{
    List<Aerolinea> findAll();
}
