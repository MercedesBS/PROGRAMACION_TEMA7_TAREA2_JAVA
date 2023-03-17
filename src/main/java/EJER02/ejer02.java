/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer02 {

    /**
     * @param args the command line arguments
     */
    
    /**
     * En este programa lo primero que haremos en el main es usar el Scanner y el arraylist, este 
     * arraylist será tipo integer y se llamará numerosAnadidos. Primero haremos que nos muestre
     * un mensaje por teclado y luego en el bucle for haremos que nos pida por teclado 10 números,
     * luego se añadirá los numeros insertados en el arraylist. Crearemos una colección donde se 
     * ordenen los números que hemos insertado y con un for-each mostraremos todos los números 
     * añadidos ordenados.
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numerosAnadidos=new ArrayList<Integer>();
        
        System.out.println("Indique los números que requiera: ");
        for(int i = 0; i < 10; i++) {
            int num = teclado.nextInt();
            numerosAnadidos.add(num);
        }
        
        Collections.sort(numerosAnadidos);
        System.out.println("Los números añadidos han sido ordenados, este saldrá así: ");
        for (int num : numerosAnadidos) {
            System.out.println(num); 
        }
    }
    
}
