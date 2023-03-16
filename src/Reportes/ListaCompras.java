/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class ListaCompras {
    ArrayList <DatosF> Compras;
    
    
    public ListaCompras() {
        this.Compras = new ArrayList <> ();
}
    
    public void GCR(String tampaque, String cantidad, String departamento, String municipio, String nombre, String nit, String total){
   DatosF Nuevo = new DatosF(tampaque,cantidad,departamento,municipio,nombre,nit,total);
   Compras.add(Nuevo);
   }
    
    public int CCompras(){
        return Compras.size();
}
    
    public DatosF NoCom(int index){
        return Compras.get(index);
    }
}
