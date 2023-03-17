/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("edad", "age");
        diccionario.put("aire", "air");
        diccionario.put("animal", "animal");
        diccionario.put("respuesta", "answer");
        diccionario.put("manzana", "apple");
        diccionario.put("arte", "art");
        diccionario.put("pelota", "ball");
        diccionario.put("banco", "bank");
        diccionario.put("sangre", "blood");
        diccionario.put("maiz", "corn");
        diccionario.put("vaca", "cow");
        diccionario.put("escritorio", "desk");
        diccionario.put("disco", "disc");
        diccionario.put("dia", "day");
        diccionario.put("hueso", "bone");
        diccionario.put("vestido", "dress");
        diccionario.put("puerta", "door");
        diccionario.put("oido", "ear");
        diccionario.put("comida", "food");

        List<String> palabraEsp = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabraEsp);
        List<String> palabrasRandom = palabraEsp.subList(0, 5);

        Scanner teclado = new Scanner(System.in);
        int numCorrectas = 0;
        int numIncorrectas = 0;

        for (String palabrasEspanolas : palabrasRandom) {
            String traduccionCorrectas = diccionario.get(palabrasEspanolas);
            System.out.println("Traduce " + palabrasEspanolas + " al inglés: ");
            String traduccionTeclado = teclado.nextLine();

            if (traduccionCorrectas.equals(traduccionTeclado)) {
                System.out.println("Traducción ingresada es correcta.");
                numCorrectas++;
            } else {
                System.out.println("Respuesta ingresada incorrecta. La traducción correcta es: " + traduccionCorrectas);
                numIncorrectas++;
            }
        }

        System.out.println("El número de respuestas correctas son: " + numCorrectas);
        System.out.println("El número de respuestas incorrectas son: " + numIncorrectas);
    }

}
