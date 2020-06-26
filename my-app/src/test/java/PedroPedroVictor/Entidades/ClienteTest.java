package PedroPedroVictor.Entidades;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ClienteTest
{

    @Test
    public void estacionaSemCarro() {
        Vaga v = new Vaga(1);
        Cliente c = new Cliente(123456, Sexo.MASCULINO);
        assertTrue( !c.estacionar(v) );
    }

    @Test
    public void estacionaComCarroVagaOcupada() {
        Vaga v = new Vaga(1);
        v.ocupa();
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Cliente cliente = new Cliente(123456, Sexo.MASCULINO);
        cliente.adicionarCarro(c);
        assertTrue( !cliente.estacionar(v) );
    }

    @Test
    public void estacionaComCarroVagaDesocupada() {
        Vaga v = new Vaga(1);
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Cliente cliente = new Cliente(123456, Sexo.MASCULINO);
        cliente.adicionarCarro(c);
        assertTrue( cliente.estacionar(v) );
    }

    @Test
    public void atualizaVagasPreferidas() {
        Vaga v1 = new Vaga(1);
        Vaga v2 = new Vaga(2);
        Vaga v3 = new Vaga(3);
        Vaga v4 = new Vaga(4);

        Carro c = new Carro("azul", "Fiat", "ABC123");
        Cliente cliente = new Cliente(123456, Sexo.MASCULINO);
        cliente.adicionarCarro(c);

        cliente.estacionar(v1);
        v1.retirarCarro();
        cliente.estacionar(v1);
        v1.retirarCarro();
        cliente.estacionar(v1);
        v1.retirarCarro();
        cliente.estacionar(v2);
        v2.retirarCarro();
        cliente.estacionar(v3);
        v3.retirarCarro();
        cliente.estacionar(v4);
        v4.retirarCarro();
        cliente.estacionar(v4);
        v4.retirarCarro();

        if(cliente.getVagasPreferidas().get(0).getPosicao() == 1) {
            assertTrue( true );
        } else {
            assertTrue( false );
        }
    }
}
