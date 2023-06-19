package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable{
    
    private Integer codCategoria;
    private String nomeCategoria;

    public Categoria() {
    }

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codCategoria);
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
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.codCategoria, other.codCategoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomeCategoria;
    }
    
    
}
