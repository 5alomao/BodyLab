
package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Marca implements Serializable{
    
    private Integer codMarca;
    private String nomeMarca;

    public Marca() {
    }

    public Integer getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(Integer codMarca) {
        this.codMarca = codMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codMarca);
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
        final Marca other = (Marca) obj;
        if (!Objects.equals(this.codMarca, other.codMarca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomeMarca;
    }
    
    
}
