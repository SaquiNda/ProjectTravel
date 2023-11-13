package GroupTravel.Proyecto.Habitacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HabitacionService {
    @Autowired
    private HabitacionRepository habitacionRepository;

    //? Post
    public Habitacion save(Habitacion entity){
        return habitacionRepository.save(entity);
    }

    //? GetAll
    public List<Habitacion> findAll() {
        return habitacionRepository.findAll();
    }

    //? Metodo getOne busca por id
    public Habitacion findOne(long id) {
        return habitacionRepository.findById(id).orElse(null);
    }

    //? Metodo Delete
    public void deleteById(long id){
        habitacionRepository.deleteById(id);
    }
}
