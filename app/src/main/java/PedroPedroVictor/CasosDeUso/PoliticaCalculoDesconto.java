package PedroPedroVictor.CasosDeUso;

import PedroPedroVictor.Entidades.Cliente;

public interface PoliticaCalculoDesconto {
    double getDesconto(Cliente cliente);
}