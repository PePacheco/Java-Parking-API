package PedroPedroVictor.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rg;
    private String cor;
    private String marca;
    private String placa;
    

    public Carro(Integer rg, String c, String m, String p) {
        this.rg = rg;
        this.cor = c;
        this.marca = m;
        this.placa = p;
    }

    public Integer getRg() {
        return this.rg;
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