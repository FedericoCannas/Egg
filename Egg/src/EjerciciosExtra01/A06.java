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
public class A06 {

    //6. Crear un programa que dado un numero determine si es par o impar.
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca el numero que desee saber si es par o impar");             
        int num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
    }
    }
}