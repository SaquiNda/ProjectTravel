package GroupTravel.Proyecto.Destino;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;

    //Crud
    public Destino savDestino(Destino entity)
    {
        return destinoRepository.save(entity);
    }
    //Read
    public Destino findByDestino(long id)
    {
        return destinoRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        destinoRepository.deleteById(id);
    }
    public List<Destino> findDestinos()
    {
        return destinoRepository.findAll();
    }
}
