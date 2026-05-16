package ar.edu.ungs.billetera;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String cuit;
    private String razonSocial;
    

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }
   
}