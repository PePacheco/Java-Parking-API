package PedroPedroVictor.CasosDeUso;

import java.util.List;

import PedroPedroVictor.Entidades.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioClientes extends CrudRepository<Cliente, Integer>{
    List<Cliente> findByRg(Integer rg);
    List<Cliente> findAll();
}