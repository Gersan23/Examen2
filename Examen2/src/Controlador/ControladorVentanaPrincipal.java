/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaAddUser;
import Vista.FrameCliente;
import Modelo.ArrayUser;
import Modelo.Server;
import Vista.FramePrivado;
import Modelo.ServerPrivado;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private VentanaAddUser ventanaA;
    private ArrayUser array;
    private FrameCliente chatDifusion;
    private Server server;
    private FramePrivado chatPrivado;
    private ServerPrivado serverP;
    public ControladorVentanaPrincipal(){
        array = new ArrayUser();
        ventanaA = new VentanaAddUser(array);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear Usuario")) {            
           ventanaA.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            System.exit(0);
        }
        if (e.getActionCommand().equalsIgnoreCase("Chat Privado")) {
            chatPrivado = new FramePrivado();
            chatPrivado.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Chat Grupal")) {
          
        }
        if (e.getActionCommand().equalsIgnoreCase("Chat Difusión")) {
            chatDifusion = new FrameCliente();
            chatDifusion.show();             
        }
        if(e.getActionCommand().equalsIgnoreCase("Servidor D")){
            server = new Server();
            Thread servidor = new Thread(server);
            servidor.start();
        }
        if(e.getActionCommand().equalsIgnoreCase("Servidor G")){
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Servidor P")){
            serverP = new ServerPrivado();
            Thread servidorP = new Thread(serverP);
            servidorP.start();
        }
    }
}
