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
public class A07 {

//7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca la frase que desee");             
        String frase = leer.nextLine();
        String resultado = "eureka";
        if (frase.equals(resultado)){
            System.out.println("correcto");
    }else{
            System.out.println("incorrecto");} 
    
   }
}