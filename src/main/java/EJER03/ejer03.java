/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer03 {

    /**
     * @param args the command line arguments
     */
    
    /**
     * En este programa lo primero que haremos en el main es usar el random y el arraylist, este 
     * arraylist será tipo integer y se llamará numerosAnadidos. Primero haremos que nos de 20
     * números aleatorio de hasta 100 números de forma aleatoria y que lo guarde en el arraylist.
     * Despues se muestra un mensaje y con un for-each se mostrará los números sin ordenar primeramente.
     * Luego de usar una colección que ordene de menor a mayor los números aleatorio, mostraremos un mensaje
     * y luego con el for-each mostraremos los números que contiene el arraylist de forma ordenada.
     */
    public static void main(String[] args) {

        Random numRandom = new Random();
        ArrayList<Integer> numerosAnadidos = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int num = numRandom.nextInt(100);
            numerosAnadidos.add(num);
        }

        System.out.println("La lista que se genera primero es la siguiente: ");
        for (int num : numerosAnadidos) {
            System.out.println(num);
        }

        Collections.sort(numerosAnadidos);
        System.out.println("La lista ordenada anterior se muestra así: ");
        for (int num : numerosAnadidos) {
            System.out.println(num);
        }
    }
}
