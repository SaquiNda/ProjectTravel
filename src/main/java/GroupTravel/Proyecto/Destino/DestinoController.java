package GroupTravel.Proyecto.Destino;

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
@RequestMapping("api/destino")
@CrossOrigin({"*"})
public class DestinoController {
    @Autowired
    private DestinoService destinoService;

    @PostMapping("/")
    public Destino savDestino(@RequestBody Destino entity)
    {
        return destinoService.savDestino(entity);
    }
    @GetMapping("/")
    public List<Destino> findAll()
    {
        return destinoService.findDestinos();
    }
    @PutMapping("/{id}/")
    public Destino updaDestino(@RequestBody Destino entity)
    {
        return destinoService.savDestino(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        destinoService.deleteById(id);
    }
}
