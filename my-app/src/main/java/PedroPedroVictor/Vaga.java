package PedroPedroVictor;

public class Vaga {
    private int posicao;
    private boolean ocupada;
    private Carro carro;

    public Vaga(int p) {
        this.posicao = p;
        this.ocupada = false;
        this.carro = null;
    }

    public boolean estacionarCarro(Carro c) {
        if(!this.isOcupada()) {
            this.carro = c;
            this.ocupa();
            return true;
        } else {
            return false;
        }
    }

    public boolean retirarCarro() {
        if(this.isOcupada()) {
            this.carro = null;
            this.desocupa();
            return true;
        } else {
            return false;
        }
    }

    public Carro getCarro() {
        return this.carro;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setPosicao(int p) {
        this.posicao = p;
    }

    public void ocupa() {
        this.ocupada = true;
    }

    public void desocupa() {
        this.ocupada = false;
    }

    public boolean isOcupada() {
        return this.ocupada;
    }
}