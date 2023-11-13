package GroupTravel.Proyecto.Vuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    //? Post
    public Vuelo save(Vuelo entity){
        return vueloRepository.save(entity);
    }

    //? GetAll
    public List<Vuelo> findAll() {
        return vueloRepository.findAll();
    }

    //? Metodo getOne busca por id
    public Vuelo findOne(long id) {
        return vueloRepository.findById(id).orElse(null);
    }

    //? Metodo Delete
    public void deleteById(long id){
        vueloRepository.deleteById(id);
    }
}
