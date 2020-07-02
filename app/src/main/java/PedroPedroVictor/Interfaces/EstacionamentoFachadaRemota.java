package PedroPedroVictor.Interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PedroPedroVictor.CasosDeUso.ServicoCliente;
import PedroPedroVictor.Entidades.Carro;
import PedroPedroVictor.Entidades.Cliente;
import PedroPedroVictor.Entidades.Vaga;

@RestController
@RequestMapping("/estacionamento")
public class EstacionamentoFachadaRemota {
    private ServicoCliente servicoCliente;

    @Autowired
	public EstacionamentoFachadaRemota(ServicoCliente servicoCliente) {
		this.servicoCliente = servicoCliente;
	}
    
    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/dadoscliente")
    public Cliente getDadosCliente(@RequestParam Integer rg){
        Cliente cliente = servicoCliente.getClientePorRg(rg);
        return cliente;
    }

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/dadoscarro")
    public Carro getDadosCarro(@RequestParam Integer rg){
        Carro carro = servicoCliente.getCarroPorRg(rg);
        return carro;
    }

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/dadosvaga")
    public Vaga getDadosVaga(@RequestParam Integer rg){
        Vaga vaga = servicoCliente.getVagaPorRg(rg);
        return vaga;
    }

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/todosalunos")
    public List<Cliente> getListaClientes(){
        List<Cliente> alunos = servicoCliente.listaDeClientes();
        return alunos;
    } 

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/cadastrocarro")
    public void cadastrarCarro(@RequestParam Integer rg, String c, String m, String p){
        servicoCliente.cadastroCarro(rg, c,m,p);
    } 

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/cadastrocliente")
    public void cadastroCliente(@RequestParam Integer rg, String s){
        servicoCliente.cadastroCliente(rg, s);
    } 

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/todasvagas")
    public List<Vaga> getListaVagas(){
        List<Vaga> vagas = servicoCliente.listaDeVagas();
        return vagas;
    } 

    @CrossOrigin(origins = "*") 
    @GetMapping("/preco")
    public double getAprovado(@RequestParam Integer horas){
        double preco = servicoCliente.precoFinal(horas);
        return preco;
    }
}
