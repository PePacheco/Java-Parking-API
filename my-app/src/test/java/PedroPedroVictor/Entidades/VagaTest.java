package PedroPedroVictor.Entidades;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VagaTest {
    @Test
    public void estacionarVagaOcupada() {
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Vaga v = new Vaga(1);
        v.ocupa();
        assertTrue( !v.estacionarCarro(c) );
    }

    @Test
    public void estacionarVagaDesocupada() {
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Vaga v = new Vaga(1);
        assertTrue( v.estacionarCarro(c) );
    }

    @Test
    public void estacionarVagaAposDesocupar() {
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Vaga v = new Vaga(1);
        v.ocupa();
        v.desocupa();
        assertTrue( v.estacionarCarro(c) );
    }

    @Test
    public void retirarVagaDesocupada() {
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Vaga v = new Vaga(1);
        assertTrue( !v.retirarCarro() );
    }

    @Test
    public void retirarVagaOcupada() {
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Vaga v = new Vaga(1);
        v.estacionarCarro(c);
        assertTrue( v.retirarCarro() );
    }

    @Test
    public void retirarVagaAposDesocupar() {
        Carro c = new Carro("azul", "Fiat", "ABC123");
        Vaga v = new Vaga(1);
        v.estacionarCarro(c);
        v.desocupa();
        assertTrue( !v.retirarCarro() );
    }
}