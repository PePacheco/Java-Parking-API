package PedroPedroVictor.CasosDeUso;
import java.util.List;

import PedroPedroVictor.Entidades.Vaga;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioVagas extends CrudRepository<Vaga, Integer>{
    Vaga findByPosition(int position);
    List<Vaga> findAll();
}
