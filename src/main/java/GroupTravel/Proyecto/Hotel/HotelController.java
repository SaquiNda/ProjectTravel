package GroupTravel.Proyecto.Hotel;


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
@RequestMapping("/hotel")
@CrossOrigin(("*"))
public class HotelController {
    @Autowired
    private HotelRepository hotelService;

    @PostMapping("/")
    public Hotel save(@RequestBody Hotel entity) {
        return hotelService.save(entity);
    }

    // Metodo getAll
    @GetMapping("/")
    public List<Hotel> findAll() {
        return hotelService.findAll();
    }

    // Metodo getOne
    @GetMapping("/{id}/")
    public Optional<Hotel> getOne(@PathVariable long id) {
        return hotelService.findById(id);
    }

    // Metodo update
    @PutMapping("/{id}/")
    public Hotel update(@RequestBody Hotel entity) {
        return hotelService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        hotelService.deleteById(id);
    }
}
