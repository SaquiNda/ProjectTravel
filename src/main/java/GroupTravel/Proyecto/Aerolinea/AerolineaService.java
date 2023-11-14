package GroupTravel.Proyecto.Aerolinea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AerolineaService {
    @Autowired
    private AerolineaRepository aerolineaRepository;

    public Aerolinea savAerolinea(Aerolinea entity)
    {
        return aerolineaRepository.save(entity);
    }
    public Aerolinea findByAerolinea(long id)
    {
        return aerolineaRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        aerolineaRepository.deleteById(id);
    }
    public List<Aerolinea> findByAerolinea()
    {
        return aerolineaRepository.findAll();
    }
}
