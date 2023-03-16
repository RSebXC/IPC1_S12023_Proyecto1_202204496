/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author rodri
 */
public class Agregar {
   private String correo;
   private String nom;
   private String ape;
   private int DPI;
   private String Rol;
   private String pass;
   private String fech;
   private String gen;
   private String naci;
   private String alias;
   private String tel;

    public Agregar() {
        this.correo = null;
        this.nom = null;
        this.ape = null;
        this.DPI = 0;
        this.Rol = null;
        this.pass = null;
        this.fech = null;
        this.gen = null;
        this.naci = null;
        this.alias = null;
        this.tel = null;
    }

   
   
    public Agregar(String correo, String nom, String ape, int DPI, String Rol, String pass, String fech, String gen, String naci, String alias, String tel) {
        this.correo = correo;
        this.nom = nom;
        this.ape = ape;
        this.DPI = DPI;
        this.Rol = Rol;
        this.pass = pass;
        this.fech = fech;
        this.gen = gen;
        this.naci = naci;
        this.alias = alias;
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getNaci() {
        return naci;
    }

    public void setNaci(String naci) {
        this.naci = naci;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
   
   public String getDatos(){
    return "Nombre: " + nom + " Apellido: " + ape + " Rol: " + Rol ;
   }
}
