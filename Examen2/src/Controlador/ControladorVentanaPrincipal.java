/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaAddUser;
import Modelo.ArrayUser;
/**
 *
 * @author Erick
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private VentanaAddUser ventanaA;
    private ArrayUser array;
    public ControladorVentanaPrincipal(){
        array = new ArrayUser();
        ventanaA = new VentanaA(array);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear Usuario")) {
            
           
        }
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            System.exit(0);
        }
        if (e.getActionCommand().equalsIgnoreCase("Chat Privado")) {
                    
        }
        if (e.getActionCommand().equalsIgnoreCase("Chat Grupal")) {
          
        }
        if (e.getActionCommand().equalsIgnoreCase("Chat Difusión")) {
                      
        }
    }
}
