/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Package1;
import Cliente.AgregarC;
import DatosDely.PrecioReg;
import Kioscos.GKioscos;
import OpAdmin.Reporte;
import Reportes.ListaCompras;
import Usuarios.Agregar;
import Usuarios.ListaUsuarios;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author rodri
 */
public class Login extends javax.swing.JFrame {
    
    private String usadmin,pasadmin;
    private ListaUsuarios listaAgregados;
    private AgregarC facturacion;
    private GKioscos NuKiosco;
    private AgregarC ntarjeta;
    private PrecioReg dep;
    private PrecioReg mun;
    private PrecioReg reg;
    private Reporte rep;
    private ListaCompras com;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        jTextField1.setFocusable(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 51, 102));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Ingrese su nombre de usuario");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar Usuario");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USAC-Delivery");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rayo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/joven-trabajador-manual-descargando-cajas-carton-furgoneta-reparto.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 480, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 190, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 190, -1));

        jPasswordField1.setBackground(new java.awt.Color(0, 51, 102));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("12345678");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Registro st = new Registro();
        st.setVisible(true);
        st.RecibirRegistros(listaAgregados,facturacion,NuKiosco,ntarjeta,mun,dep,reg,rep,com);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void RecibirRegistros(ListaUsuarios listaAgregados, AgregarC facturacion, GKioscos NuKioscos, AgregarC ntarjeta, PrecioReg mun, PrecioReg depa, PrecioReg reg, Reporte rep, ListaCompras com){
    this.listaAgregados = listaAgregados;
    this.facturacion = facturacion;
    this.NuKiosco = NuKioscos;
    this.ntarjeta = ntarjeta;
    this.dep = depa;
    this.mun = mun;
    this.reg = reg;
    this.rep = rep;
    this.com = com;
    ComboNom ();
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usadmin = "ipc1_202204496@ipc1delivery.com";
    pasadmin = "202204496";
        Agregar user = listaAgregados.Validacion(jTextField1.getText(), jPasswordField1.getText());
        if(usadmin.equals(jTextField1.getText()) && pasadmin.equals(jPasswordField1.getText())){
        Admin adm = new Admin();
        adm.setVisible(true);
        adm.RecibirRegistros(listaAgregados, facturacion, NuKiosco, ntarjeta,mun,dep,reg,rep,com);
        this.dispose();
        }
        
        else if (user != null){
        JOptionPane.showMessageDialog(null,"Usuario Valido");
        Cliente cl = new Cliente();
        cl.setVisible(true);
        cl.RecibirRegistros(listaAgregados, facturacion,NuKiosco,ntarjeta,mun,dep,reg,rep,com);
        this.dispose();
        } else {
        JOptionPane.showMessageDialog(null,"Usuario No Valido");
        }
        
        /* datos(usuario,password);
        if(usuario.equals(jTextField1.getText()) && password.equals(jPasswordField1.getText())){
            Registro st = new Registro();
            st.setVisible(true);
            this.dispose();
        }else if(jTextField1.getText().equals("") && jPasswordField1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios, llene los campos");
            jTextField1.setFocusable(true);
        }else if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario esta vacio, ingreselo porfavor");
            jTextField1.setFocusable(true);
        }else if(jPasswordField1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Contraseña esta vacio, ingresela porfavor");
            jPasswordField1.setFocusable(true);
        }else if(jTextField1.getText().compareTo(usuario)!=0 && jPasswordField1.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos. Ingrese nuevamente.");
            jTextField1.setFocusable(true);
        }
        else if(jTextField1.getText().compareTo(usuario)!=0){
            JOptionPane.showMessageDialog(this,"Usuario no válido. Ingrese nuevamente.");
            jTextField1.setFocusable(true);
        }else if(jPasswordField1.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Contraseña no válida. Ingrese nuevamente.");
            jPasswordField1.setFocusable(true); 
        }*/

        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void ComboNom (){
        
        int ctar = listaAgregados.NUsuarios();
        Agregar datos;
        for (int i = 0; i < ctar; i++) {
            datos = listaAgregados.Obtener(i);
            System.out.println(datos.getNom() + " Datos");
            
        }
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        // TODO add your handling code here:
        jTextField1.setText("");
        jPasswordField1.setText("********");
    }//GEN-LAST:event_jTextField1MousePressed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        jPasswordField1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void RecibirRegistros(AgregarC Tarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
