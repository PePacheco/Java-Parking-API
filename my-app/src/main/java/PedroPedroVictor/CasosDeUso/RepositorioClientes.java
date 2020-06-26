package PedroPedroVictor.CasosDeUso;
import java.util.List;

import PedroPedroVictor.Entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioClientes extends CrudRepository<Cliente, Integer>{
    Cliente findByRg(int rg);
    List<Cliente> findAll();
}