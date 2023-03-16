/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;
import java.util.ArrayList;
/**
 *
 * @author rodri
 */
public class AgregarC {
   
    ArrayList<DatosTarj> Tarjeta;
    ArrayList<DatosCom> Factura; 
    
    public AgregarC() {
        this.Tarjeta = new ArrayList<> ();
        this.Factura = new ArrayList<> ();
        
    }
    
    
    
    
    
    public void GuardarT(int ntarj, String nomtarj, String ftarj){
    DatosTarj save = new DatosTarj (ntarj,nomtarj,ftarj);
   Tarjeta.add(save);
    }

    public void GuardarF (String nomf,String dirf,String nit){
    DatosCom Save = new DatosCom (nomf,dirf,nit);
    Factura.add(Save);
    }
    
    public int CElementosF (){
    return Factura.size();
    }
    
    public DatosCom  NoElem(int noele){
        return Factura.get(noele);
    }
    
    public int CelementosT(){
    return Tarjeta.size();
    }
    
    public DatosTarj NoTarj(int notarj){
        return Tarjeta.get(notarj);
    }
    
    
}
