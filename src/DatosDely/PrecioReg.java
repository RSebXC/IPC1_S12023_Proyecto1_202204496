/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosDely;

import Usuarios.Agregar;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class PrecioReg {
    ArrayList <Precios> PrecioRegiones;
    Precios precioM = new Precios("M","Metropolitana", 35.0, 25.0);
    Precios precioNT = new Precios("NT", "Norte", 68.50, 45.55);
    Precios precioNO = new Precios("NO", "Nororiente", 58.68, 35.48);
    Precios precioSO = new Precios("SO","Suroriente" ,38.68, 32.48);
    Precios precioSOC = new Precios ("SOC", "Suroccidente",34.00, 29.00);
    Precios precioNOC = new Precios("NOC","Noroccidente" ,44.50,40.00);
    
    ArrayList <Departamentos> listaDep;
    Departamentos Dep1 = new Departamentos("M","D01","Guatemala");
    Departamentos Dep2 = new Departamentos("NT","D02","Alta Verapaz");
    Departamentos Dep3 = new Departamentos("NO","D03","Izabal");
    Departamentos Dep4 = new Departamentos("SO","D04","Jutiapa");
    Departamentos Dep5 = new Departamentos("SOC","D05","San Marcos");
    Departamentos Dep6 = new Departamentos("NOC","D06","Quiche");
    
    ArrayList <Municipios> listaMun;
    Municipios MunDep01 = new Municipios("D01","Ciudad de Guatemala");
    Municipios MunDep02 = new Municipios("D02","Coban");
    Municipios MunDep03 = new Municipios("D03","La libertad");
    Municipios MunDep04 = new Municipios("D04","Comapa");
    Municipios MunDep05 = new Municipios("D05","El Tumbador");
    Municipios MunDep06 = new Municipios("D06","Santa Cruz");
    
    Municipios MunDep07 = new Municipios("D01","Villa Canales");
    Municipios MunDep08 = new Municipios("D01","Villa Nueva");
    Municipios MunDep09 = new Municipios("D01","Amatitlan");
    Municipios MunDep10 = new Municipios("D01","Mixco");
    Municipios MunDep11 = new Municipios("D02","Tactic");
    Municipios MunDep12 = new Municipios("D02","Lanquin");
    
    Municipios MunDep13 = new Municipios("D02","Tucuru");
    Municipios MunDep14 = new Municipios("D02","Tamahu");
    Municipios MunDep15 = new Municipios("D03","Dolores");
    Municipios MunDep16 = new Municipios("D03","San Luis");
    Municipios MunDep17 = new Municipios("D03","Poptun");
    Municipios MunDep18 = new Municipios("D03","El chal");
    
    Municipios MunDep19 = new Municipios("D04","Jalpatagua");
    Municipios MunDep20 = new Municipios("D04","Jutiapa");
    Municipios MunDep21 = new Municipios("D04","Zapotitlan");
    Municipios MunDep22 = new Municipios("D04","Moyuta");
    Municipios MunDep23 = new Municipios("D06","Chiche");
    Municipios MunDep24 = new Municipios("D06","Uspantan");
    
    
    public PrecioReg(){
    this.PrecioRegiones = new ArrayList<>();
    this.listaDep = new ArrayList<>();
    this.listaMun = new ArrayList<>();
    PrecioRegiones.add(precioM);
    PrecioRegiones.add(precioNT);
    PrecioRegiones.add(precioNO);
    PrecioRegiones.add(precioSO);
    PrecioRegiones.add(precioSOC);
    PrecioRegiones.add(precioNOC);
    listaDep.add(Dep1);
    listaDep.add(Dep2);
    listaDep.add(Dep3);
    listaDep.add(Dep4);
    listaDep.add(Dep5);
    listaDep.add(Dep6);
    listaMun.add(MunDep01);
    listaMun.add(MunDep02);
    listaMun.add(MunDep03);
    listaMun.add(MunDep04);
    listaMun.add(MunDep05);
    listaMun.add(MunDep06);
    listaMun.add(MunDep07);
    listaMun.add(MunDep08);
    listaMun.add(MunDep09);
    listaMun.add(MunDep10);
    listaMun.add(MunDep11);
    listaMun.add(MunDep12);
    listaMun.add(MunDep13);
    listaMun.add(MunDep14);
    listaMun.add(MunDep15);
    listaMun.add(MunDep16);
    listaMun.add(MunDep17);
    listaMun.add(MunDep18);
    listaMun.add(MunDep19);
    listaMun.add(MunDep20);
    listaMun.add(MunDep21);
    listaMun.add(MunDep22);
    listaMun.add(MunDep23);
    listaMun.add(MunDep24);
    
    
    
    }
    
    public Precios verificar (String nombre){
        for (int i = 0; i < CElementosD(); i++) {
            if (listaDep.get(i).getNombreD().equals(nombre)){
                for (int j = 0; j < Cantidad(); j++) {
                    if (PrecioRegiones.get(j).getCodigo().equals(listaDep.get(i).CodigoR)){
                    return PrecioRegiones.get(j);
                    }
                }
            }
        }
        return null;
    }
    
    
    
    
    public ArrayList<String> municipios (String nombre){
        ArrayList<String> MunDep = new ArrayList();
        for (int i = 0; i < CElementosD(); i++) {
            if (listaDep.get(i).getNombreD().equals(nombre)){
                for (int j = 0; j < CelementosM(); j++) {
                    if (listaMun.get(j).getCodigoD().equals(listaDep.get(i).CodigoD)){
                    MunDep.add(listaMun.get(j).NombreM);
                    }
                }
            }
        }
        return MunDep;
        
    }
    
    
    
    
    public void actualizar(String codigo,double estandar, double especial){
        for (int i = 0; i < Cantidad(); i++) {
            if (PrecioRegiones.get(i).getCodigo().equals(codigo)){
                               
                if (estandar != 0){
                    PrecioRegiones.get(i).setPrestandar(estandar);
    
    }
                if (especial != 0){
                    PrecioRegiones.get(i).setPreregular(especial);
    }}}
    }
    
    public void GDEP(String CodigoR, String CodigoD,String NombreD){
   Departamentos Nuevo = new Departamentos(CodigoR,CodigoD,NombreD);
   listaDep.add(Nuevo);
   }
    
   public void GMUN(String CodigoD, String NombreM){
       Municipios Nuevo = new Municipios (CodigoD,NombreM);
       listaMun.add(Nuevo);
   }
   
   public int CElementosD (){
    return listaDep.size();
    }
    
    public Departamentos  NoDep(int noele){
        return listaDep.get(noele);
    }
    
    public int CelementosM(){
    return listaMun.size();
    }
    
    public Municipios NoMun(int notarj){
        return listaMun.get(notarj);
    }

    public int Cantidad(){
    return PrecioRegiones.size();
    }
    
    public Precios Obtener(int indice){
    return this.PrecioRegiones.get(indice);
    }
}
