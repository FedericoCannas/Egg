/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGG.DIA1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fede2
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    
//EJERCICIO 11
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//e1n punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//vocales acentuadas) se mantienen sin cambios.
//a e i o u
//@ # $ % *
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura “según” para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frese que desee"); 
        String opcion = leer.nextLine();
        String retorno= signos(opcion);
        System.out.println(retorno); 
    }

    public static String signos(String opcion){
String resultado="";
for (int i=0; i<opcion.length();i++) {
char c = opcion.charAt(i);
if (c == 'a'){
  resultado += '@';
}else if (c == 'e'){
  resultado += '#';
}else if (c == 'i'){
  resultado += '$';
}else if (c == 'o'){
  resultado += '%';
}else if (c == 'u'){
  resultado += '*';
}else{
  resultado += c;
}
}
return resultado;
}
}

    