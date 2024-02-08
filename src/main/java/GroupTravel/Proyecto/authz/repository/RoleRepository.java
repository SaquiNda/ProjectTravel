package GroupTravel.Proyecto.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import GroupTravel.Proyecto.authz.entity.Role;






public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
