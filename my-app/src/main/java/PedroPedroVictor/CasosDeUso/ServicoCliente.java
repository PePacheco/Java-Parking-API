package PedroPedroVictor.CasosDeUso;

import java.util.List;
import PedroPedroVictor.Entidades.Cliente;
import PedroPedroVictor.Entidades.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCliente {
    private RepositorioClientes cadClientes;
    private RepositorioVagas cadVagas;
    private PoliticaSugestaoDeVagas politicaSugestao;
    private PoliticaCalculoDesconto politicaDesconto;
    private Cliente cacheCliente;
    
    @Autowired
    public ServicoCliente(RepositorioClientes r, PoliticaSugestaoDeVagas politicaSugestao, PoliticaCalculoDesconto politicaDesconto) {
        this.cadClientes = r;
        this.politicaSugestao = politicaSugestao;
        this.politicaDesconto = politicaDesconto;
        this.cacheCliente = null;
    }

    public double precoFinal(int horas) {
        double preco = horas * 5;
        double calculoDesconto = politicaDesconto.getDesconto(cacheCliente);
        double precoFinal = preco*calculoDesconto;
        return precoFinal;
    }

    public Vaga sugereVaga(int rg) {
        if (cacheCliente == null || rg != this.cacheCliente.getRg()) {
            cacheCliente = getClientePorRg(rg);
        }
        return politicaSugestao.sugereVaga(cacheCliente, cadVagas);
    }

    public Cliente getClientePorRg(int rg) {
        Cliente cliente = cadClientes.findByRg(rg);
        if (cliente == null) {
            throw new IllegalArgumentException("Registro nao encontrado");
        } else {
            cacheCliente = cliente;
            return cliente;
        }
    }

    public List<Cliente> listaDeClientes() {
        List<Cliente> clientes = cadClientes.findAll();
        return clientes;
    }
}