/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGG.DIA1;

import java.util.Scanner;

/**
 *
 * @author fede2
 */
public class Ejercicio14 {

//EJERCICIO 14
//Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] equipo;
        equipo = new String[6];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el nombre del integrante");
            equipo[i] = leer.nextLine();

        }
        System.out.println("Los integrantes del equipo son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo[i]);
        }

}
}