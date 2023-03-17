/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase por teclado: ");
        String fraseTeclado = teclado.nextLine();

        String[] palabrasAnadidas = fraseTeclado.split(" ");
        List<String> listaPalabras = new ArrayList<>(Arrays.asList(palabrasAnadidas));
        Set<String> palabrasRepes = new HashSet<>();
        Set<String> palabrasNoRepes = new HashSet<>();

        for (String palabraIntroducida : listaPalabras) {
            if (!palabrasNoRepes.contains(palabraIntroducida)) {
                if (!palabrasRepes.add(palabraIntroducida)) {
                    palabrasNoRepes.remove(palabraIntroducida);
                } else {
                    palabrasNoRepes.add(palabraIntroducida);
                }
            }
        }

        System.out.println("Las palabras repetidas son: ");
        for (String palabraRepe : palabrasRepes) {
            System.out.println(palabraRepe);
        }

        System.out.println("Las palabras no repetidas son: ");
        for (String palabraNoRepe : palabrasNoRepes) {
            System.out.println(palabraNoRepe);
        }
    }

}
