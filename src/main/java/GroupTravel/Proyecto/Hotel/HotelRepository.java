package GroupTravel.Proyecto.Hotel;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface HotelRepository extends CrudRepository <Hotel, Long> {
    List<Hotel> findAll();

}
