package GroupTravel.Proyecto.PaqueteViaje;

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
@RequestMapping("api/paqueviaje")
@CrossOrigin({"*"})
public class PaqueteViajeController {
    @Autowired
    private PaqueteViajeService paqueteViajeService;

    @PostMapping("/")
    public PaqueteViaje savPaqueteViaje(@RequestBody PaqueteViaje entity)
    {
        return paqueteViajeService.savPaqueteViaje(entity);
    }
    @GetMapping("/")
    public List<PaqueteViaje> findAll()
    {
        return paqueteViajeService.findPaqueteViajes();
    }
    @PutMapping("/{id}/")
    public PaqueteViaje updPaqueteViaje(@RequestBody PaqueteViaje entity)
    {
        return paqueteViajeService.savPaqueteViaje(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        paqueteViajeService.deleteById(id);
    }
}
