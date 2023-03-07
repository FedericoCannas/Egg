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
public class A01 {

    
    //1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        System.out.println("Introduzca los dos valores enteros que desee sumar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resultado = num1+num2;
        System.out.println("El resultado de la suma es: "+resultado);
        
    }
    
}
