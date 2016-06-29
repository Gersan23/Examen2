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
    private boolean adm = false;
    private boolean invitados = false;

    public User(String nombre, boolean adm, boolean invitados) {
        setNombre(nombre);
        setAdm(adm);
        setInvitados(invitados);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public boolean getAdm() {
        return adm;
    }

    public void setInvitados(boolean invitados) {
        this.invitados = invitados;
    }

    public boolean getInvitados() {
        return invitados;
    }

}
