package PedroPedroVictor.Entidades;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rg;
    @Enumerated(EnumType.STRING) Sexo sexo;
    private Integer quant;
    private ArrayList<Integer> vagasPreferidas;
    private ArrayList<Integer> vagas;

    public Cliente(Integer rg, Sexo s) {
        this.rg = rg;
        this.sexo = s;
        this.quant = 0;
        vagasPreferidas = new ArrayList<Integer>();
        vagas = new ArrayList<Integer>();
    }

    public Cliente() {
        
    }

    public boolean estacionar(Vaga v) {
        if(v.estacionarCarro(this.rg)) {
            this.vagas.add(v.getPosicao());
            this.atualizaVagasPreferidas();
            this.quant++;
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> getVagasPreferidas() {
        return this.vagasPreferidas;
    }

    public void atualizaVagasPreferidas() {
        this.limparVagasPreferidas();
        for(Integer vaga: vagas) {
            int count = 0;
            for(Integer vag: vagas) {
                if(vaga == vag) {
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


    public Sexo getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo s) {
        this.sexo = s;
    }

    public Integer getRg() {
        return this.rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Integer getQtdadeDeUsos() {
        return this.quant;
    }

    public void setQtdadeDeUsos(int q) {
        this.quant = q;
    }
}