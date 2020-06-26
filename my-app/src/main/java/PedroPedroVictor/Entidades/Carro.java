package PedroPedroVictor.Entidades;

public class Carro {
    private String cor;
    private String marca;
    private String placa;

    public Carro(String c, String m, String p) {
        this.cor = c;
        this.marca = m;
        this.placa = p;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }
}