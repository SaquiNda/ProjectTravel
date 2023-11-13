package GroupTravel.Proyecto.Habitacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/habitacion")
@CrossOrigin(("*"))
public class HabitacionController {
    @Autowired
    private HabitacionRepository habitacionService;

    @PostMapping("/")
    public Habitacion save(@RequestBody Habitacion entity) {
        return habitacionService.save(entity);
    }

    // Metodo getAll
    @GetMapping("/")
    public List<Habitacion> findAll() {
        return habitacionService.findAll();
    }

    // Metodo getOne
    @GetMapping("/{id}/")
    public Optional<Habitacion> getOne(@PathVariable long id) {
        return habitacionService.findById(id);
    }

    // Metodo update
    @PutMapping("/{id}/")
    public Habitacion update(@RequestBody Habitacion entity) {
        return habitacionService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        habitacionService.deleteById(id);
    }
}
