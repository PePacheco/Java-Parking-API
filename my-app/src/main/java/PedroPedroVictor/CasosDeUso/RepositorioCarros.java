package PedroPedroVictor.CasosDeUso;
import java.util.List;

import PedroPedroVictor.Entidades.Carro;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioCarros extends CrudRepository<Carro, Integer>{
    List<Carro> findByPlaca(int placa);
    List<Carro> findAll();
}
