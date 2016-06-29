/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControladorVentanaCreadorEntrenador;
import Modelo.Entrenador;
import Modelo.RegistroEntrenador;
import Modelo.Pokemon;
import Modelo.VectorPokemon;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Gersan
 */
public class VentanaCreadorEntrenador extends javax.swing.JFrame {
    Entrenador entrenador;
    RegistroEntrenador registro;
    VectorPokemon pokemonVect = new VectorPokemon();
    
    /**
     * Creates new form VentanaCreadorEntrenador
     */
    public VentanaCreadorEntrenador(RegistroEntrenador registroEntrenador) {
        initComponents();
        llenarComboBox();
        this.registro=registroEntrenador;
        this.setTitle("Crear Entrenador");
//        jT_Codigo.setEditable(false);
        ControladorVentanaCreadorEntrenador control=new ControladorVentanaCreadorEntrenador(this, registro);
        agregarEscuchador(control);
    }
    
   
    public void limpiar(String usuario, String codigo ){
        jT_Usuario.setText(usuario);
        jT_Codigo.setText(codigo);
    }
    public void agregarEscuchador(ActionListener manejador){
        jB_Borrar.addActionListener(manejador);
        jB_Crear.addActionListener(manejador);
        jB_Limpiar.addActionListener(manejador);
        jB_Modificar.addActionListener(manejador);
    }
    public void llenarComboBox(){//llenar la lista de combobox
        jC_Pokemon1.removeAllItems();
        jC_Pokemon2.removeAllItems();
        jC_Pokemon3.removeAllItems();
        Pokemon pokemon1 = null;
        for(int i = 0; i < pokemonVect.getTamano(); i++){
            pokemon1 = pokemonVect.poke(i);
            jC_Pokemon1.addItem((i+1)+"-"+pokemon1.getNombre());
            jC_Pokemon2.addItem((i+1)+"-"+pokemon1.getNombre());
            jC_Pokemon3.addItem((i+1)+"-"+pokemon1.getNombre());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_Usuario = new javax.swing.JLabel();
        jT_Usuario = new javax.swing.JTextField();
        jL_Codigo = new javax.swing.JLabel();
        jT_Codigo = new javax.swing.JTextField();
        jL_CodigoBuscar = new javax.swing.JLabel();
        jT_CodigoBuscar = new javax.swing.JTextField();
        jL_Pokemon1 = new javax.swing.JLabel();
        jL_Pokemon2 = new javax.swing.JLabel();
        jL_Pokemon3 = new javax.swing.JLabel();
        jC_Pokemon2 = new javax.swing.JComboBox<>();
        jC_Pokemon3 = new javax.swing.JComboBox<>();
        jB_Modificar = new javax.swing.JButton();
        jB_Crear = new javax.swing.JButton();
        jB_Limpiar = new javax.swing.JButton();
        jB_Borrar = new javax.swing.JButton();
        jC_Pokemon1 = new javax.swing.JComboBox<>();
        jB_Buscar = new javax.swing.JButton();

        jL_Usuario.setText("Usuario:");

        jL_Codigo.setText("Código:");

        jL_CodigoBuscar.setText("Código a Buscar:");

        jL_Pokemon1.setText("Pokémon 1");

        jL_Pokemon2.setText("Pokémon 2");

        jL_Pokemon3.setText("Pokémon 3");

        jC_Pokemon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jC_Pokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_Pokemon2ActionPerformed(evt);
            }
        });

        jC_Pokemon3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jB_Modificar.setText("Modifcar");
        jB_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ModificarActionPerformed(evt);
            }
        });

        jB_Crear.setText("Crear");

        jB_Limpiar.setText("Limpiar");

        jB_Borrar.setText("Borrar");

        jC_Pokemon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jB_Buscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jL_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jL_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jB_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jC_Pokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jC_Pokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jT_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jT_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jC_Pokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jB_Buscar)
                                            .addComponent(jL_CodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jT_CodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jB_Modificar)
                                        .addGap(27, 27, 27))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_Pokemon3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jL_Pokemon2)
                                .addGap(164, 164, 164)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Pokemon1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Usuario)
                    .addComponent(jT_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_CodigoBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Codigo)
                    .addComponent(jT_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_CodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Pokemon1)
                    .addComponent(jC_Pokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Pokemon2)
                    .addComponent(jC_Pokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Pokemon3)
                    .addComponent(jC_Pokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Crear)
                    .addComponent(jB_Limpiar)
                    .addComponent(jB_Borrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jC_Pokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_Pokemon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_Pokemon2ActionPerformed

    private void jB_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_ModificarActionPerformed

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
//            java.util.logging.Logger.getLogger(VentanaCreadorEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaCreadorEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaCreadorEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaCreadorEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaCreadorEntrenador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Borrar;
    private javax.swing.JButton jB_Buscar;
    private javax.swing.JButton jB_Crear;
    private javax.swing.JButton jB_Limpiar;
    private javax.swing.JButton jB_Modificar;
    private javax.swing.JComboBox<String> jC_Pokemon1;
    private javax.swing.JComboBox<String> jC_Pokemon2;
    private javax.swing.JComboBox<String> jC_Pokemon3;
    private javax.swing.JLabel jL_Codigo;
    private javax.swing.JLabel jL_CodigoBuscar;
    private javax.swing.JLabel jL_Pokemon1;
    private javax.swing.JLabel jL_Pokemon2;
    private javax.swing.JLabel jL_Pokemon3;
    private javax.swing.JLabel jL_Usuario;
    private javax.swing.JTextField jT_Codigo;
    private javax.swing.JTextField jT_CodigoBuscar;
    private javax.swing.JTextField jT_Usuario;
    // End of variables declaration//GEN-END:variables

    public String getjC_Pokemon1() {
        return (String) jC_Pokemon1.getSelectedItem();
    }

    public String getjC_Pokemon2() {
        return (String) jC_Pokemon2.getSelectedItem();
    }

    public String getjC_Pokemon3() {
        return (String) jC_Pokemon3.getSelectedItem();
    }

    public String getjT_Codigo() {
        return jT_Codigo.getText();
    }

    public String getjT_Usuario() {
        return jT_Usuario.getText();
    }

    public String getjT_CodigoBuscar() {
        return jT_CodigoBuscar.getText();
    }


}
