/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroeje01.DeteccionDeErrores01;

import javax.swing.JOptionPane;

/**
 *
 * @author fede2
 */
public class pruebasYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String cadena = JOptionPane.showInputDialog("Escribe una cadena");
        JOptionPane.showMessageDialog(null, "Esta es tu cadena: " + cadena);

        int entero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un valor"));
        JOptionPane.showMessageDialog(null, "Este es tu valor: " + entero);

        float flotante = Float.parseFloat(JOptionPane.showInputDialog("Escribe un valor Flotante"));
        JOptionPane.showMessageDialog(null, "Este es tu valor Flotante: " + flotante);

        double doble = Double.parseDouble(JOptionPane.showInputDialog("Escribe un valor doble"));
        JOptionPane.showMessageDialog(null, "Este es tu valor Flotante: " + doble);

    }

}
