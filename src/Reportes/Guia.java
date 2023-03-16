/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;
import Cliente.AgregarC;
import Cliente.DatosCom;
import DatosDely.Departamentos;
import DatosDely.PrecioReg;
import Kioscos.GKioscos;
import Usuarios.Agregar;
import Usuarios.ListaUsuarios;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
/**
 *
 * @author rodri
 */
public class Guia {
    
    String reporte;
    String nombre;
    
    public Guia(){
    
    this.reporte = "";
    this.nombre = "";
}
    
  public boolean CrearDoc(String nombre,String codigo,  String user, String cantidad, String Dorigen, String MunO, String Tpago, String DestinoD, String DestinoM){
        this.nombre = nombre;
        try {
            
            /* Se crea el archivo con el nombre que se le envia*/
            FileOutputStream archivo = new FileOutputStream(nombre+".html"); 
            /* Esta instancia de OutputStreamWriter nos permitira escribir en el archivo */
            OutputStreamWriter  osw = new OutputStreamWriter (archivo, StandardCharsets.UTF_8);
            /* Metodo para crear el reporte */
            crearReporte(nombre,codigo, user, cantidad,Dorigen,MunO,DestinoD,DestinoM,Tpago);
            /* Se escribe la cadena para formar el contenido del archivo */
            osw.write(this.reporte);
            /* Se cierra el documento esto siempre se debe hacer para que no se presente
            ningun problema*/
            osw.close();
            archivo.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error "+e);
            return false;
        }
    }


    public void crearReporte(String titulo,String codigo,String nombre,  String cantidad, String Dorigen, String MunO,String DestinoD,String DestinoM, String Tpago){
        /* Estructura basica de un archivo HTML */
        this.reporte += "<!DOCTYPE html>\n";
        this.reporte += "<html>\n";
        this.reporte += "<head>\n";
        this.reporte += "\t<meta charset=\"utf-8\">\n";
        this.reporte += "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
        /* Titulo a mostrar en la pestaña del navegador */
        this.reporte += "\t<title>"+titulo+"</title>\n";
        this.reporte += "</head>\n";
        this.reporte += "<body>\n";
        /* Titulo a mostrar en la pagina */
        this.reporte += "<h1>"+titulo+"</h1>\n";
        /* Salto de linea */
        nextLine();
        /* Datos del usuario */
        datosUsuario(codigo,nombre,Dorigen,MunO,DestinoD, DestinoM,cantidad,Tpago);
        /* Salto de linea */
        nextLine();
        /* Creacion de la tabla de productos*/
        
        /* Cierre del cuerpo y del archivo HTML */
        this.reporte += "</body>\n";
        this.reporte += "</html>";
    }
    
    
    private void datosUsuario(String codigo,String nombre, String Dorigen, String MunO, String detd,String destm,String cant,String total){
        /*  Se crea la etiqueta que abre una lista para mostrar los datos del usuario */
        this.reporte += "\t<ul>\n";
        /* Se agregan los elemento a la lista */
        nextData("Codigo: "+ codigo);
        nextData("Nombre del cliente: "+ nombre);
        nextData("Origen del Paquete: " + MunO + "," + Dorigen);
        nextData("Destino del Paquete: " + destm + ", " + detd);
        nextData("Cantidad de Paquetes: " + cant);
        nextData("Total a pagar: " + total);
        nextData("Fecha: " + String.valueOf(LocalDateTime.now()));
        /*  Se crea la etiqueta que cierra la lista */
        this.reporte += "\t<ul>\n";
    }
    
    private void nuevaTabla(String cantidad, String Tamaño, String Tpago){
        /* Se crea la etiqueta que abre para una tabla */
        this.reporte += "\t<table border=\"1\">\n";
        /* Se agrega el titulo de la pagina */
         addTitulosCulomns();
        
        /* Se verifica que la factura que se envia sea diferente de null  */
        addRow(cantidad, Tamaño, Tpago);
        /* Se crea la etiqueta que cierra la tabla */
        this.reporte += "\t</table>\n";
    }
    
     private void addTitulosCulomns(){
        /* Se crea la etiqueta que abre la fila*/
        openRow();
        addColumn("Cantidad de Paquetes");
        addColumn("Tamaño del Paquete");
        addColumn("Total a pagar");
        
        /* Se crea la etiqueta que cierra la fila */
        closeRow();
    }
    
    private void addRow(String cantidad, String Tamaño, String Tpago){
        openRow();
        addColumn(cantidad);
        addColumn(Tamaño);
        addColumn(Tpago);
        
        closeRow();
    }
    
    private void nextData(String dato){
        /* Se crea la etiqueta para mostrar el elemento */
        this.reporte += "\t\t<li>"+dato+"</li>\n";
    }
    
    private void addColumn(String dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    }
    
    private void addColumn(int dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    }
    
    private void addColumn(double dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    } 
    
    private void openRow(){
        /* Se crea la etiqueta que abre la fila */
        this.reporte += "\t\t<tr>\n";        
    }
    
    private void closeRow(){
        /* Se crea la etiqueta que cierra la fila */
        this.reporte += "\t\t</tr>\n";
    } 
    
    private void openColumn(){
        /* Se crea la etiqueta que abre la columna */
        this.reporte += "\t\t\t<th>";        
    }
    
    private void closeColumn(){
        /* Se crea la etiqueta que cierra la columna */
        this.reporte += "</th>\n";
    } 
    
    private void nextLine(){
        /* Se crea la etiqueta para un salto de linea */
        this.reporte += "\t<br>\n";
    }
    
    public boolean AbrirArchivo(){
        try {
            /* Se obtiene el archivo a traves de File
              * al realizar la instancia se debe colocar la ruta del archivo
              * en este caso solo se coloca el nombre y la extension debido a que
              * se encuentra en la misma carpeta del proyecto */
            File path = new File(nombre+".html");
            /* Se abrira el archivo */
            Desktop.getDesktop().open(path);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
}
