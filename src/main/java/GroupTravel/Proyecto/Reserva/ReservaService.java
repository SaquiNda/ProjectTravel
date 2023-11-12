package GroupTravel.Proyecto.Reserva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva savReserva(Reserva entity)
    {
        return reservaRepository.save(entity);
    }
    public Reserva findByReserva(long id)
    {
        return reservaRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        reservaRepository.deleteById(id);
    }
    public List<Reserva> findReservas()
    {
        return reservaRepository.findAll();
    }
}
