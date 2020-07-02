package PedroPedroVictor.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer posicao;
    private boolean ocupada;
    private Integer rg;

    public Vaga(Integer p, Integer r) {
        this.posicao = p;
        this.ocupada = false;
        this.rg = r;
    }

    public boolean estacionarCarro(Integer rg) {
        if(!this.isOcupada()) {
            this.rg = rg;
            this.ocupa();
            return true;
        } else {
            return false;
        }
    }

    public boolean retirarCarro() {
        if(this.isOcupada()) {
            this.rg = null;
            this.desocupa();
            return true;
        } else {
            return false;
        }
    }

    public Integer getRg() {
        return this.rg;
    }

    public Integer getPosicao() {
        return this.posicao;
    }

    public void setPosicao(Integer p) {
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