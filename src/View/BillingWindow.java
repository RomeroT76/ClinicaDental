/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class BillingWindow extends javax.swing.JFrame {

    /**
     * Creates new form Facturacion
     */
    public BillingWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setBackBtListener(ActionListener al) {
        this.backBT.addActionListener(al);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Facturacion = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        CampoCedula = new javax.swing.JTextField();
        Nombres = new javax.swing.JLabel();
        CampoNombres = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        CampoApellidos = new javax.swing.JTextField();
        CampoDireccion = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        Emisor = new javax.swing.JLabel();
        CampoEmisor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backBT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Facturacion.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        Facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tooth-6783172_1280.png"))); // NOI18N
        Facturacion.setText("FACTURACIÓN");
        getContentPane().add(Facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        Cedula.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Cedula.setText("CÉDULA");
        getContentPane().add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 20));

        CampoCedula.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        CampoCedula.setBorder(null);
        getContentPane().add(CampoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 210, 30));

        Nombres.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Nombres.setText("NOMBRES");
        getContentPane().add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 20));

        CampoNombres.setEditable(false);
        CampoNombres.setBackground(new java.awt.Color(255, 255, 255));
        CampoNombres.setBorder(null);
        getContentPane().add(CampoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 30));

        Apellidos.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Apellidos.setText("APELLIDOS");
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 20));

        CampoApellidos.setEditable(false);
        CampoApellidos.setBackground(new java.awt.Color(255, 255, 255));
        CampoApellidos.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        CampoApellidos.setBorder(null);
        getContentPane().add(CampoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 30));

        CampoDireccion.setEditable(false);
        CampoDireccion.setBackground(new java.awt.Color(255, 255, 255));
        CampoDireccion.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        CampoDireccion.setBorder(null);
        getContentPane().add(CampoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 420, 30));

        Direccion.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Direccion.setText("DIRECCIÓN");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 90, 20));

        Telefono.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Telefono.setText("TELÉFONO");
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 80, 20));

        CampoTelefono.setEditable(false);
        CampoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        CampoTelefono.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        CampoTelefono.setBorder(null);
        getContentPane().add(CampoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 420, 30));

        Correo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Correo.setText("CORREO ELECTRÓNICO");
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 20));

        CampoCorreo.setEditable(false);
        CampoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        CampoCorreo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        CampoCorreo.setBorder(null);
        getContentPane().add(CampoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 330, 30));

        Emisor.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Emisor.setText("EMITIDO POR");
        getContentPane().add(Emisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 100, 30));

        CampoEmisor.setEditable(false);
        CampoEmisor.setBackground(new java.awt.Color(255, 255, 255));
        CampoEmisor.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        CampoEmisor.setBorder(null);
        getContentPane().add(CampoEmisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 230, 30));

        jButton1.setBackground(new java.awt.Color(0, 80, 130));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CANCELAR");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 800, 80, 30));

        jButton2.setBackground(new java.awt.Color(0, 80, 130));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ACEPTAR");
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 80, 30));

        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setText("FECHA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jTable1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 670, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setText("DETALLE DE FACTURA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        backBT.setText("ATRAS");
        getContentPane().add(backBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 80, 130));
        jButton4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buscar");
        jButton4.setBorder(null);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 70, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 180, 10));

        Fondo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 840));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BillingWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JTextField CampoApellidos;
    private javax.swing.JTextField CampoCedula;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoEmisor;
    private javax.swing.JTextField CampoNombres;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Emisor;
    private javax.swing.JLabel Facturacion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Nombres;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton backBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
