/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra01;

import java.util.Scanner;

/**
 *
 * @author fede2
 */
public class A04 {

 //4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca la frase que desee mostrar");             
        float grado = leer.nextFloat();
        float fahren= 32 + (9 * grado / 5);
        System.out.println("Los grados Fahrenheit son: "+fahren);
    }
}
