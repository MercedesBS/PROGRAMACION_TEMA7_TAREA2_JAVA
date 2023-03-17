/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER05;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer05 {

    /**
     * @param args the command line arguments
     */
    
    //En este main lo que haremos es llamar el menu().
    public static void main(String[] args) {

        menu();

    }

    /**
     * Creamos el Scanner llamado teclado y los demás atributos. Luego con un while
     * lo que haremos es crear un menú donde podremos seleccionar cual queremos usar.
     * Luego con el Switch crearemos los casos que estará definidor por la opción elegida.
     */
    public static void menu() {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean rehacerOpcion = true;

        while (rehacerOpcion == true) {
            System.out.println("-------MENU-------");
            System.out.println("1....Traductor Google");
            System.out.println("2....Salir");
            System.out.println("-------------------");
            System.out.println("Elija una de las opciones...");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    anadirTraduccion();
                    break;
                case 2:
                    System.out.println("Saliendo del programa....");
                    System.exit(0);
                    break;
                default:
                    rehacerOpcion = false;
                    System.out.println("Escoja una que sea válida: ");
                    opcion = teclado.nextInt();
            }
        }
    }

    /**
     * Creamos otro método donde añadimos un hashmap llamado diccionario, después creamos
     * por defecto el diccionario con las palabras en español e inglés. Creamos un Scanner,
     * luego un mensaje y hacemos que nos pida una palabra String por teclado.
     * Ahora creamos una condicional con el if, en el caso de que contenga una de las palabras
     * del diccionario añadidas por teclado nos mostrará un mensaje. Sino nos saldrá un mensaje
     * de que no está en el diccionario esa palabra.
     */
    public static void anadirTraduccion() {

        HashMap<String, String> diccionario = new HashMap<>();
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

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una palabra en español para traducirla: ");
        String palabraEspanol = teclado.nextLine();

        if (diccionario.containsKey(palabraEspanol)) {
            String traduccion = diccionario.get(palabraEspanol);
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("No se encontró una traducción para la palabra ingresada en español en este diccionario.");
        }
    }
}