package GroupTravel.Proyecto.Destino;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DestinoRepository extends CrudRepository <Destino, Long>{
    List<Destino> findAll();
}
