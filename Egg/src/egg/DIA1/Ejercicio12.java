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
public class Ejercicio12 {

    //EJERCICIO 12
//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//segundo, sino informe que no lo son.
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese los dos numeros para identificar si son multiplos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        
        if (num1 % num2 ==0){
            System.out.println("El numero es multiplo");
        }
            else
            System.out.println("El numero NO es multiplo");
        }
}
