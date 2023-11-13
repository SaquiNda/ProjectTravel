package GroupTravel.Proyecto.Hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    //? Post
    public Hotel save(Hotel entity){
        return hotelRepository.save(entity);
    }

    //? GetAll
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    //? Metodo getOne busca por id
    public Hotel findOne(long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    //? Metodo Delete
    public void deleteById(long id){
        hotelRepository.deleteById(id);
    }
}
