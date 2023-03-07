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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    //EJERCICIO 10
//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 4 numeros entre 1 y 20");
        int opcion1 = leer.nextInt();
        int opcion2 = leer.nextInt();
        int opcion3 = leer.nextInt();
        int opcion4 = leer.nextInt();

        System.out.print(opcion1);
        for (int i = 0; i < opcion1; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print(opcion2);
        for (int i = 0; i < opcion2; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print(opcion3);
        for (int i = 0; i < opcion3; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print(opcion4);
        for (int i = 0; i < opcion4; i++) {
            System.out.print("*");

        }
        System.out.print("\n");
    }

}
