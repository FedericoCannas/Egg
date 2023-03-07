/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra01;

import javax.swing.JOptionPane;

/**
 *
 * @author fede2
 */
public class A12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String cadena;
        int incorrecto = 0;
        int correcto = 0;

        do {
            cadena = JOptionPane.showInputDialog("Escribe una cadena");

            if (cadena.equals("&&&&&")) {
                JOptionPane.showMessageDialog(null, "La tarea a sido finalizada.");
                break;
            } else if (cadena.length() < 5) {
                JOptionPane.showMessageDialog(null, "La cadena excede los 5 caracteres");
                incorrecto++;
            } else if (!cadena.startsWith("x")) {
                JOptionPane.showMessageDialog(null, "La cadena no inicia correctamente");
                incorrecto++;
            } else if (!cadena.endsWith("o")) {
                JOptionPane.showMessageDialog(null, "La cadena no cierra correctamente");
                incorrecto++;
            } else {
                JOptionPane.showMessageDialog(null, "La cadena se leyó correctamente");
                correcto++;
            }
        } while (!"&&&&&".equals(cadena));

        JOptionPane.showMessageDialog(null, "La cantidad de datos correctos introducidos son: " + correcto);
        JOptionPane.showMessageDialog(null, "La cantidad de datos incorrectos introducidos son: " + incorrecto);

    }
}

//12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().