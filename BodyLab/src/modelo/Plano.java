package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Plano implements Serializable{
    
    private String tipo;
    private Double valor;
    private Integer codPlano;

    public Plano() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCodPlano() {
        return codPlano;
    }

    public void setCodPlano(Integer codPlano) {
        this.codPlano = codPlano;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codPlano);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plano other = (Plano) obj;
        if (!Objects.equals(this.codPlano, other.codPlano)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return tipo;
    }
    
}
