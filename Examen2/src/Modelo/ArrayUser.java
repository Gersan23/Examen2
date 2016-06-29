/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gersan
 */
public class ArrayUser {

    User user;

    private ArrayList<User> array;

    public ArrayUser() {
        array = new ArrayList<User>();

    }

    public void setObjeto(User objeto) {
        array.add(objeto);
    }

    public boolean getExistencia(String nombre) {
        boolean existencia = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombre().equalsIgnoreCase(nombre)) {
                existencia = true;
            }
        }
        return existencia;
    }

    public User getObjeto(String nombre) {
        User objeto = null;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombre().equalsIgnoreCase(nombre)) {
                objeto = array.get(i);
            }
        }
        return objeto;
    }

    public User getObjeto(int i) {
        return array.get(i);
    }

    public void eliminar(String nombre) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombre().equalsIgnoreCase(nombre)) {
                array.remove(i);
            } else {
                JOptionPane.showMessageDialog(null, "Ese codigo no existe dentro de los entrenadores ya creados");
            }
        }
    }

    public int getTamano() {
        return array.size();
    }

    public boolean verificarDatos(User e){
      for (int i = 0; i < array.size(); i++) {
          if(e.getNombre().equalsIgnoreCase(array.get(i).getNombre())){
              JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe.");
              return false;
          }
      }
      return true;
    }
}
