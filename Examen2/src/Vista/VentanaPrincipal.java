/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorVentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Gersan
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private ControladorVentanaPrincipal cVentanaPrincipal;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {  
        initComponents();
        this.setTitle("Chats E&G");
        this.cVentanaPrincipal= new ControladorVentanaPrincipal();
        this.jMSalir.addActionListener(cVentanaPrincipal);
        this.jMCrearUsuario.addActionListener(cVentanaPrincipal);
        this.jBPrivado.addActionListener(cVentanaPrincipal);
        this.jBGrupal.addActionListener(cVentanaPrincipal);
        this.jBDifusion.addActionListener(cVentanaPrincipal);
        this.jBSDifu.addActionListener(cVentanaPrincipal);
        this.jBSGrupal.addActionListener(cVentanaPrincipal);
        this.jBSPriva.addActionListener(cVentanaPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBPrivado = new javax.swing.JButton();
        jBGrupal = new javax.swing.JButton();
        jBDifusion = new javax.swing.JButton();
        jBSDifu = new javax.swing.JButton();
        jBSGrupal = new javax.swing.JButton();
        jBSPriva = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMFile = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();
        jMUser = new javax.swing.JMenu();
        jMCrearUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CHATS");

        jBPrivado.setText("Chat Privado");

        jBGrupal.setText("Chat Grupal");

        jBDifusion.setText("Chat Difusión");

        jBSDifu.setText("Servidor D");

        jBSGrupal.setText("Servidor G");

        jBSPriva.setText("Servidor P");

        jMFile.setText("File");

        jMSalir.setText("Salir");
        jMFile.add(jMSalir);

        jMenuBar1.add(jMFile);

        jMUser.setText("User");

        jMCrearUsuario.setText("Crear Usuario");
        jMUser.add(jMCrearUsuario);

        jMenuBar1.add(jMUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBPrivado)
                    .addComponent(jBSPriva))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGrupal)
                    .addComponent(jBSGrupal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBSDifu))
                    .addComponent(jBDifusion))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPrivado)
                    .addComponent(jBGrupal)
                    .addComponent(jBDifusion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSDifu)
                    .addComponent(jBSGrupal)
                    .addComponent(jBSPriva))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JOptionPane.showMessageDialog(null,"Instrucciones: cada frame tiene su \nservidor para tener puertos diferentes y no salgan \nen el mismo frame lo que se escribe.\n El chat privado permite 2 conecciones\nEl chat en grupos usted decide el numero\nEl difusión tiene un limite pero es muy grande");
                new VentanaPrincipal().setVisible(true);
                //Server servidor =new Server();
                //servidor.escuchar();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDifusion;
    private javax.swing.JButton jBGrupal;
    private javax.swing.JButton jBPrivado;
    private javax.swing.JButton jBSDifu;
    private javax.swing.JButton jBSGrupal;
    private javax.swing.JButton jBSPriva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMCrearUsuario;
    private javax.swing.JMenu jMFile;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMUser;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
