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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el valor de su boleana true o false");
        boolean num = leer.nextBoolean();
        
        System.out.println("Introduzca el valor con decimal que desee");
        double var= leer.nextDouble();
        
        System.out.println("introduzca numero de un digito");
        String input= leer.next();
        char var2 = input.charAt(0);
        
        System.out.println("Los valores introducidos son: " + num + ", " + var + ", " + var2);
        
    }
    
}
