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
public class A09 {
//9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
//diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//la función Substring y equals() de Java.
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca la frase o palabra que desee");             
        String frase = leer.nextLine();
        String letra1 = frase.substring(0,1);
        
        if (letra1.equalsIgnoreCase("A")){
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
        
    }
    
}
