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
public class A13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de elementos");
        int limite = leer.nextInt();
        String[][] matriz = new String[limite][limite];

        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                matriz[i][j] = "*";
            }
        }
        for (int i = 1; i < limite - 1; i++) {
            for (int j = 1; j < limite - 1; j++) {
                matriz[i][j] = " ";
            }
        }

        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *