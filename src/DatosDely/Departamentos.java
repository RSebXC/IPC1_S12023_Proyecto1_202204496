/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosDely;

/**
 *
 * @author rodri
 */
public class Departamentos {
    String CodigoR;
    String CodigoD;
    String NombreD;

    public Departamentos(String CodigoR, String CodigoD, String NombreD) {
        this.CodigoR = CodigoR;
        this.CodigoD = CodigoD;
        this.NombreD = NombreD;
    }

    public String getCodigoR() {
        return CodigoR;
    }

    public void setCodigoR(String CodigoR) {
        this.CodigoR = CodigoR;
    }

    public String getCodigoD() {
        return CodigoD;
    }

    public void setCodigoD(String CodigoD) {
        this.CodigoD = CodigoD;
    }

    public String getNombreD() {
        return NombreD;
    }

    public void setNombreD(String NombreD) {
        this.NombreD = NombreD;
    }
    
    
}
