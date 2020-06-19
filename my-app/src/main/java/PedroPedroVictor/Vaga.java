package PedroPedroVictor;

public class Vaga {
    private int posicao;
    private boolean ocupada;

    public Vaga(int p) {
        this.posicao = p;
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