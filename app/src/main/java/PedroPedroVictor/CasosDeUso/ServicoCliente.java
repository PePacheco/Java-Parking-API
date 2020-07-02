package PedroPedroVictor.CasosDeUso;

import java.util.List;

import PedroPedroVictor.Entidades.Carro;
import PedroPedroVictor.Entidades.Cliente;
import PedroPedroVictor.Entidades.Sexo;
import PedroPedroVictor.Entidades.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCliente {
    private RepositorioClientes cadClientes;
    private RepositorioVagas cadVagas;
    private RepositorioCarros cadCarros;
    private PoliticaCalculoDesconto politicaDesconto;
    private Cliente cacheCliente;
    private Carro cacheCarro;
    private Vaga cacheVaga;
    
    @Autowired
    public ServicoCliente(RepositorioClientes r,  PoliticaCalculoDesconto politicaDesconto) {
        this.cadClientes = r;
        this.politicaDesconto = politicaDesconto;
        this.cacheCliente = null;
    }

    public double precoFinal(int horas) {
        double preco = horas * 5;
        double calculoDesconto = politicaDesconto.getDesconto(cacheCliente);
        double precoFinal = preco*calculoDesconto;
        return precoFinal;
    }

    public Carro getCarroPorRg(int rg) {
        List<Carro> carros = cadCarros.findByRg(rg);
        if (carros.size() == 0) {
            throw new IllegalArgumentException("Registro nao encontrado");
        } else {
            cacheCarro = carros.get(0);
            return cacheCarro;
        }
    }

    public Vaga getVagaPorRg(int rg) {
        List<Vaga> vagas = cadVagas.findByRg(rg);
        if (vagas.size() == 0) {
            throw new IllegalArgumentException("Registro nao encontrado");
        } else {
            cacheVaga = vagas.get(0);
            return cacheVaga;
        }
    }

    public Cliente getClientePorRg(int rg) {
        List<Cliente> clientes = cadClientes.findByRg(rg);
        if (clientes.size() == 0) {
            throw new IllegalArgumentException("Registro nao encontrado");
        } else {
            cacheCliente = clientes.get(0);
            return cacheCliente;
        }
    }

    public void cadastroCliente(Integer r,String s){
        Cliente c = new Cliente(r,Sexo.valueOf(s));
        cadClientes.save(c);
    }

    public void cadastroCarro(Integer r, String c, String m, String p){
        Carro carro = new Carro(r,c,m,p);
        cadCarros.save(carro);
    }

    public List<Cliente> listaDeClientes() {
        List<Cliente> clientes = cadClientes.findAll();
        return clientes;
    }

    public List<Vaga> listaDeVagas() {
        List<Vaga> vagas = cadVagas.findAll();
        return vagas;
    }
}