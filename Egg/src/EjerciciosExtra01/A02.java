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
public class A02 {

//2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("El nombre es: "+nombre);
        
    }
    
}
