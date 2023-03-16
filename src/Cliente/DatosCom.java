/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author rodri
 */
public class DatosCom {
    String nomFac;
    String dirFac;
    String NIT;

    public DatosCom(String nomFac, String dirFac, String NIT) {
        this.nomFac = nomFac;
        this.dirFac = dirFac;
        this.NIT = NIT;
    }

    public String getNomFac() {
        return nomFac;
    }

    public void setNomFac(String nomFac) {
        this.nomFac = nomFac;
    }

    public String getDirFac() {
        return dirFac;
    }

    public void setDirFac(String dirFac) {
        this.dirFac = dirFac;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
    
}
