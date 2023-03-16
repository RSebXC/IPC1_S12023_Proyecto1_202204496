/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author rodri
 */
public class DatosTarj {
    int ntarj;
    String nomTarj;
    String feTarj;

    public DatosTarj(int ntarj, String nomTarj, String feTarj) {
        this.ntarj = ntarj;
        this.nomTarj = nomTarj;
        this.feTarj = feTarj;
    }

    public int getNtarj() {
        return ntarj;
    }

    public void setNtarj(int ntarj) {
        this.ntarj = ntarj;
    }

    public String getNomTarj() {
        return nomTarj;
    }

    public void setNomTarj(String nomTarj) {
        this.nomTarj = nomTarj;
    }

    public String getFeTarj() {
        return feTarj;
    }

    public void setFeTarj(String feTarj) {
        this.feTarj = feTarj;
    }
    
    
}
