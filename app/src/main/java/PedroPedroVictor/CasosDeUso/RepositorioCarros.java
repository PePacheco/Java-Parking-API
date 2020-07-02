package PedroPedroVictor.CasosDeUso;
import java.util.List;

import PedroPedroVictor.Entidades.Carro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCarros extends CrudRepository<Carro, Integer>{
    List<Carro> findByRg(Integer rg);
    List<Carro> findAll();
}
