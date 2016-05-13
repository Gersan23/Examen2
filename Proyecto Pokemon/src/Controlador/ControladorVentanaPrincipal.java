/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaCreadorEntrenador;
import Vista.VentanaRanking;
import javax.swing.JOptionPane;
/**
 *
 * @author Gersan
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private VentanaCreadorEntrenador ventanaC;
    private VentanaRanking ventanaR;
    
    public ControladorVentanaPrincipal() {
        ventanaC = new VentanaCreadorEntrenador();
        ventanaR = new VentanaRanking();
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear Entrenador")) {
            
           ventanaC.show();
        }
        if(e.getActionCommand().equalsIgnoreCase("Ranking")){
            ventanaR.show();
        }
   
    
    }
}
