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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
    //pedirá de nuevo hasta que la nota sea correcta.
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el valor de la nota");
        int opcion = leer.nextInt();
        
        while (opcion<0 || opcion>10) {
            System.out.println("Introduzca una nota entre 0 y 10");
            opcion = leer.nextInt();
        }
    }
    
}
