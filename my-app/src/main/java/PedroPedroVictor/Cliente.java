package PedroPedroVictor;

import java.util.ArrayList;

public class Cliente {
    private int rg;
    private int qtdadeDeUsos;
    private ArrayList<Integer> vagasPreferidas;

    public Cliente(int rg) {
        this.rg = rg;
        this.qtdadeDeUsos = 0;
        vagasPreferidas = new ArrayList<Integer>();
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