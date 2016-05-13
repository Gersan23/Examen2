/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaCreadorEntrenador;
import javax.swing.JOptionPane;
/**
 *
 * @author Gersan
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private VentanaCreadorEntrenador ventanaC;
    
    public ControladorVentanaPrincipal() {
        ventanaC = new VentanaCreadorEntrenador();
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear Entrenador")) {
            
           ventanaC.show();
        }
   
    
    }
}
