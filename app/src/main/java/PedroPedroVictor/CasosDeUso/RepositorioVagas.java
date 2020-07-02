package PedroPedroVictor.CasosDeUso;
import java.util.List;

import PedroPedroVictor.Entidades.Vaga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioVagas extends CrudRepository<Vaga, Integer>{
    List<Vaga> findByRg(Integer rg);
    List<Vaga> findAll();
}

