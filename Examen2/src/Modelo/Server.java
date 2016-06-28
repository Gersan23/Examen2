/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Server {


    private final int puerto = 2027;
    private final int noConexiones = 20;
   
    private ArrayList<Socket> usuarios = new ArrayList<Socket>();
       
   
    public void escuchar(){
        try {
            //Creamos el socket servidor
            ServerSocket servidor = new ServerSocket(puerto,noConexiones);
            //Ciclo infinito para estar escuchando por nuevos clientes
            while(true){
                System.out.println("Escuchando....");
                //Cuando un cliente se conecte guardamos el socket en nuestra lista
                Socket cliente = servidor.accept();
                usuarios.add(cliente);
                //Instanciamos un hilo que estara atendiendo al cliente y lo ponemos a escuchar
                Runnable  run = new HiloServidor(cliente,usuarios);
                Thread hilo = new Thread(run);
                hilo.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        Server servidor= new Server();
        servidor.escuchar();
    }
}


