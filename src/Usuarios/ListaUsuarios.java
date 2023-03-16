/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class ListaUsuarios {
    ArrayList<Agregar> listaAgregados ;

    public ListaUsuarios() {
        
      this.listaAgregados  = new ArrayList<>();
    }
    
    public Agregar Validacion(String user, String pass){
        Agregar Usuarios;
        for (int i = 0; i < listaAgregados.size(); i++) {
            Usuarios = listaAgregados.get(i);
            if(Usuarios.getCorreo().equals(user) && Usuarios.getPass().equals(pass) ){
            return Usuarios;
            }
        } return null;
    } 
    
    
   public boolean Registrar(String correo, String nom, String ape, int DPI, String Rol, String pass, String fech, String gen, String naci, String alias, String tel){
   if (ExistProduct(correo) == -1){
       Agregar Nuevo = new Agregar(correo,nom,ape,DPI,Rol,pass,fech,gen,naci,alias,tel);
   
   listaAgregados.add(Nuevo);
   return true;
   
   }
   return false;
   }
   
   private int ExistProduct(String correo)
    {
        String correoBuscado = "";
        for (int i = 0; i < listaAgregados.size(); i++) {
            correoBuscado = listaAgregados.get(i).getCorreo();
            
            if(correoBuscado.equals(correo)) return i;
        }
        return -1;
    }
   
   public int NUsuarios(){
   return listaAgregados.size();
   }
   
   public Agregar Obtener(int index){
    return this.listaAgregados.get(index);
    }
}
