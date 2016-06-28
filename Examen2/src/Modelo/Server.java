/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.HiloServer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Server implements Runnable {


    private final int puerto = 2027;
    private final int noConexiones = 20;
   
    private ArrayList<Socket> usuarios = new ArrayList<Socket>();
       
   
    public void escuchar(){
        try {
            ServerSocket servidor = new ServerSocket(puerto,noConexiones);
            while(true){
                System.out.println("Escuchando....");
                Socket cliente = servidor.accept();
                usuarios.add(cliente);
                Runnable  run =  new HiloServer(cliente,usuarios);
                Thread hilo = new Thread(run);
                hilo.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    

    @Override
    public void run() {
        this.escuchar();
    }
}


