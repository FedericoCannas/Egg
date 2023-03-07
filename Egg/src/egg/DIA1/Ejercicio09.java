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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
     
//EJERCICIO 9
//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break. //


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int contador = 20;
        int opcion;
        
        
        do {
                    
        System.out.println("Ingrese el valor que desee");
        opcion = leer.nextInt();
        contador --; 
                
        }while ((opcion != 0) && (contador > 0));   
    }
}    

