package PedroPedroVictor;

import java.util.*;

public class Cliente {
    private Sexo sexo;
    private int rg;
    private int qtdadeDeUsos;
    private Carro carro;
    private ArrayList<Vaga> vagasPreferidas;
    private ArrayList<Vaga> vagas;

    public Cliente(int rg, Sexo s) {
        this.rg = rg;
        this.sexo = s;
        this.qtdadeDeUsos = 0;
        vagasPreferidas = new ArrayList<Vaga>();
        vagas = new ArrayList<Vaga>();
    }

    public boolean estacionar(Vaga v) {
        if(this.carro != null){
            if(v.estacionarCarro(this.carro)) {
                this.vagas.add(v);
                this.atualizaVagasPreferidas();
                this.qtdadeDeUsos++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public ArrayList<Vaga> getVagasPreferidas() {
        return this.vagasPreferidas;
    }

    public void atualizaVagasPreferidas() {
        this.limparVagasPreferidas();
        for(Vaga vaga: vagas) {
            int count = 0;
            for(Vaga vag: vagas) {
                if(vaga.getPosicao() == vag.getPosicao()) {
                    count++;
                }
            }
            if(count >= 3) {
                if(!this.getVagasPreferidas().contains(vaga)) {
                    this.getVagasPreferidas().add(vaga);
                }
            }
        }  
    }

    public void limparVagasPreferidas() {
        this.getVagasPreferidas().clear();
    }

    public void adicionarCarro(Carro c) {
        this.carro = c;
    }

    public Carro getCarro() {
        return this.carro;
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