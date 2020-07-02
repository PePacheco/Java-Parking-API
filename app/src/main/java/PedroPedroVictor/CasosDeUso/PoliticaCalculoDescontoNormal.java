package PedroPedroVictor.CasosDeUso;

import PedroPedroVictor.Entidades.Cliente;

public class PoliticaCalculoDescontoNormal implements PoliticaCalculoDesconto {
    @Override
    public double getDesconto(Cliente c) {
        return 0;
    }
}