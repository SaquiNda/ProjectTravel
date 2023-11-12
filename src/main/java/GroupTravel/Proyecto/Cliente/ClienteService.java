package GroupTravel.Proyecto.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    //Crud
    public Cliente savCliente(Cliente entity)
    {
        return clienteRepository.save(entity);
    }
    //Read
    public Cliente findByCliente(long id)
    {
        return clienteRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        clienteRepository.deleteById(id);
    }
    public List<Cliente> findClientes()
    {
        return clienteRepository.findAll();
    }
}
