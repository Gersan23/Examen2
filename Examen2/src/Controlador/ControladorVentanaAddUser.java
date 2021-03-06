/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaAddUser;
import Modelo.ArrayUser;
import Modelo.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Gersan
 */
public class ControladorVentanaAddUser implements ActionListener {

    private VentanaAddUser ventanaA;
    private ArrayUser array;

    public ControladorVentanaAddUser(VentanaAddUser ventanaA, ArrayUser array) {
        this.ventanaA = ventanaA;
        this.array = array;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Agregar")) {
            agregar();
            System.out.println("Boton Crear");
        }

    }

    public void agregar() {
        User objeto = null;
        String user = ventanaA.getjTUser();
        objeto = new User(user, false, false);

        if (array.getTamano() != 0) {
            if (array.verificarDatos(objeto)) {
                array.setObjeto(objeto);
                JOptionPane.showMessageDialog(null, "Agregado con satisfacción.");
            }
        } else {
            array.setObjeto(objeto);
            JOptionPane.showMessageDialog(null, "Agregado con satisfacción.");
        }
    }
}
