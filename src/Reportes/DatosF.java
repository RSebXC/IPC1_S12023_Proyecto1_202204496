/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

/**
 *
 * @author rodri
 */
public class DatosF {
    String tampaque;
    String cantidad;
    String departamento;
    String municipio;
    String nombre;
    String nit;
    String total;

    public DatosF(String tampaque, String cantidad, String departamento, String municipio, String nombre, String nit, String total) {
        this.tampaque = tampaque;
        this.cantidad = cantidad;
        this.departamento = departamento;
        this.municipio = municipio;
        this.nombre = nombre;
        this.nit = nit;
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

       
    public String getTampaque() {
        return tampaque;
    }

    public void setTampaque(String tampaque) {
        this.tampaque = tampaque;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
}
