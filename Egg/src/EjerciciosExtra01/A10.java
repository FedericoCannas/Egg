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
public class A10 {

    //10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
       
       int suma=0;
              
       Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca un numero limite positivo");             
        int limite = leer.nextInt();
                 
        while (suma < limite){
        System.out.println("Introduzca un numero");             
        int num = leer.nextInt();
        suma += num;
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
}
}
    
