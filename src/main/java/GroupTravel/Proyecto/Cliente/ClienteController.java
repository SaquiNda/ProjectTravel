package GroupTravel.Proyecto.Cliente;

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
@RequestMapping("api/client")
@CrossOrigin({"*"})
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @PostMapping("/")
    public Cliente savCliente(@RequestBody Cliente entity)
    {
        return clienteService.savCliente(entity);
    }
    @GetMapping("/")
    public List<Cliente> findAll()
    {
        return clienteService.findClientes();
    }
    @PutMapping("/{id}/")
    public Cliente updaCliente(@RequestBody Cliente entity)
    {
        return clienteService.savCliente(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        clienteService.deleteById(id);
    }
}
