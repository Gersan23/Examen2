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
import Vista.VentanaPokedex;
import Vista.VentanaBatalla;
import javax.swing.JOptionPane;
/**
 *
 * @author Gersan
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private VentanaCreadorEntrenador ventanaC;
    private VentanaRanking ventanaR;
    private VentanaPokedex ventanaP;
    private VentanaBatalla ventanaB;
    
    public ControladorVentanaPrincipal() {
        ventanaC = new VentanaCreadorEntrenador();
        ventanaR = new VentanaRanking();
        ventanaP = new VentanaPokedex();
        ventanaB = new VentanaBatalla();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear Entrenador")) {
            
           ventanaC.show();
        }
        if(e.getActionCommand().equalsIgnoreCase("Ranking")){
            ventanaR.show();
        }
        if(e.getActionCommand().equalsIgnoreCase("Ver")){
            ventanaP.show();
        }
        if(e.getActionCommand().equalsIgnoreCase("Batalla")){
            ventanaB.show();
        }
   
    
    }
}
