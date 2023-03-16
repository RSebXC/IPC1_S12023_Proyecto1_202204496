/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosDely;

/**
 *
 * @author rodri
 */
public class Precios {
    String codigo;
    String nombre;
    double prestandar;
    double preregular;

    public Precios() {
        this.codigo = null;
        this.nombre = null;
        this.prestandar = 0.00;
        this.preregular = 0.00;
    }
    
    public Precios(String codigo, String nombre, double prestandar, double preregular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.prestandar = prestandar;
        this.preregular = preregular;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrestandar() {
        return prestandar;
    }

    public void setPrestandar(double prestandar) {
        this.prestandar = prestandar;
    }

    public double getPreregular() {
        return preregular;
    }

    public void setPreregular(double preregular) {
        this.preregular = preregular;
    }
    
    
}
