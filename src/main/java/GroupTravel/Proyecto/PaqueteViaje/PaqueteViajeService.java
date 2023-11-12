package GroupTravel.Proyecto.PaqueteViaje;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaqueteViajeService {
    @Autowired
    private PaqueteViajeRepository paqueteViajeRepository;

    public PaqueteViaje savPaqueteViaje(PaqueteViaje entity)
    {
        return paqueteViajeRepository.save(entity);
    }
    public PaqueteViaje findByPaqueteViaje(long id)
    {
        return paqueteViajeRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        paqueteViajeRepository.deleteById(id);
    }
    public List<PaqueteViaje> findPaqueteViajes()
    {
        return paqueteViajeRepository.findAll();
    }
}
