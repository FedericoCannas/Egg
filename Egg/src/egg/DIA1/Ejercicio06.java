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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    
    //*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
   //alguno de ellos es mayor a 25.
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros a continuacion");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        
        if (num1>25 && num2>25) {
        System.out.println("Ambos numeros son mayores a 25");
        }
        if (num1>25){
            System.out.println(num1+ " Es mayor a 25");
        }
        if (num2>25){
            System.out.println(num2+ " Es mayor a 25");
        }
        if (num1<25){
            System.out.println(num1+ " Es menor a 25");
        }
        if (num2<25){
            System.out.println(num2+ " Es menor a 25"); 
        }
    }
    
}
