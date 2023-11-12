package GroupTravel.Proyecto.Reserva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reserva")
@CrossOrigin({"*"})
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @PostMapping("/")
    public Reserva savReserva(@RequestBody Reserva entity)
    {
        return reservaService.savReserva(entity);
    }
    @GetMapping("/")
    public List<Reserva> findAll()
    {
        return reservaService.findReservas();
    }
    @PutMapping("/{id}/")
    public Reserva updatReserva(@RequestBody Reserva entity)
    {
        return reservaService.savReserva(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        reservaService.deleteById(id);
    }
}
