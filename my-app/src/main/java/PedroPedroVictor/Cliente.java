package PedroPedroVictor;

import java.util.ArrayList;

public class Cliente {
    private Sexo sexo;
    private int rg;
    private int qtdadeDeUsos;
    private ArrayList<Carro> carros;
    private ArrayList<Vaga> vagasPreferidas;

    public Cliente(int rg, Sexo s) {
        this.rg = rg;
        this.sexo = s;
        this.qtdadeDeUsos = 0;
        vagasPreferidas = new ArrayList<Vaga>();
    }

    public void cadastrarCarro(Carro c) {
        carros.add(c);
    }

    public ArrayList<Vaga> getVagasPreferidas() {
        return this.vagasPreferidas;
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo s) {
        this.sexo = s;
    }

    public int getRg() {
        return this.rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getQtdadeDeUsos() {
        return this.qtdadeDeUsos;
    }

    public void setQtdadeDeUsos(int q) {
        this.qtdadeDeUsos = q;
    }
}