/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gersan
 */
public class User {
    private String nombre;
    private String pass;
    
    public User(String nombre, String pass){
        setNombre(nombre);
        setPass(pass);
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getPass(){
        return pass;
    }
}
