package PedroPedroVictor.CasosDeUso;

import PedroPedroVictor.Entidades.Vaga;
import PedroPedroVictor.Entidades.Cliente;
import PedroPedroVictor.CasosDeUso.RepositorioVagas;

public interface PoliticaSugestao {
    Vaga sugereVaga(Cliente c, RepositorioVagas rep);
}