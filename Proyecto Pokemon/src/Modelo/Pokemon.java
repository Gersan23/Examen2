/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.Icon;

/**
 *
 * @author Erick
 */
public class Pokemon {

private String nombre;
private int ataque;
private String numero;
private Icon imagen;

public Pokemon(String nombre, int ataque, String numero, Icon imagen)
{
    this.nombre=nombre;
    this.ataque=ataque;
    this.numero=numero;
    this.imagen=imagen;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Icon getImagen(){
        return imagen;
    }
    
    public void setImagen(Icon imagen){
        this.imagen = imagen;
    }

}
