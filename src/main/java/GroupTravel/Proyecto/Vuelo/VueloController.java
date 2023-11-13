package GroupTravel.Proyecto.Vuelo;


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
@RequestMapping("/vuelo")
@CrossOrigin(("*"))
public class VueloController {
    @Autowired
    private VueloRepository vueloService;

    @PostMapping("/")
    public Vuelo save(@RequestBody Vuelo entity) {
        return vueloService.save(entity);
    }

    // Metodo getAll
    @GetMapping("/")
    public List<Vuelo> findAll() {
        return vueloService.findAll();
    }

    // Metodo getOne
    @GetMapping("/{id}/")
    public Optional<Vuelo> getOne(@PathVariable long id) {
        return vueloService.findById(id);
    }

    // Metodo update
    @PutMapping("/{id}/")
    public Vuelo update(@RequestBody Vuelo entity) {
        return vueloService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        vueloService.deleteById(id);
    }
}
