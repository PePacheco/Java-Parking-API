package PedroPedroVictor.CasosDeUso;

import PedroPedroVictor.Entidades.Cliente;

public class PoliticaCalculoDescontoFeriados implements PoliticaCalculoDesconto {
    @Override
    public double getDesconto(Cliente c) {
        return 0.1;
    }
}