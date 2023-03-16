/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author rodri
 */
import Cliente.AgregarC;
import DatosDely.PrecioReg;
import Kioscos.GKioscos;
import OpAdmin.Reporte;
import Package1.Login;
import Reportes.ListaCompras;
import Usuarios.ListaUsuarios;
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaUsuarios listaAgregados = new ListaUsuarios();
        AgregarC Tarjeta = new AgregarC();
        AgregarC Factura = new AgregarC();
        GKioscos NKiosco = new GKioscos();
        PrecioReg Dep = new PrecioReg();
        PrecioReg Mun = new PrecioReg();
        PrecioReg Reg = new PrecioReg();
        Reporte Rep = new Reporte();
        ListaCompras Com = new ListaCompras();
        
        // TODO code application logic here
        Login inicio = new Login();
        
        inicio.RecibirRegistros(listaAgregados,Tarjeta,NKiosco,Factura,Mun, Dep,Reg,Rep,Com);
        inicio.setVisible(true);
        
        
    }
    
}
