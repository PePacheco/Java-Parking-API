package PedroPedroVictor.CasosDeUso;

import PedroPedroVictor.Entidades.Cliente;

public class PoliticaCalculoDescontoFidelidade implements PoliticaCalculoDesconto {
    @Override
    public double getDesconto(Cliente c) {
        if (c.getQtdadeDeUsos() > 10) {
            return 0.05;
        } else if (c.getQtdadeDeUsos() > 20) {
            return 0.1;
        } else if (c.getQtdadeDeUsos() > 30) {
            return 0.15;
        } else if (c.getQtdadeDeUsos() > 40) {
            return 0.2;
        } else if (c.getQtdadeDeUsos() > 50) {
            return 0.25;
        } else if (c.getQtdadeDeUsos() > 60) {
            return 0.3;
        } else if (c.getQtdadeDeUsos() > 70) {
            return 0.35;
        } else {
            return 0.4;
        }
    }
}