/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer01 {

    /**
     * @param args the command line arguments
     */
    
    /**
     * Llamamos el método menu.
     */
    public static void main(String[] args) {
        menu();
    }

    /**
     * Creamos un método llamado menú donde con un buble Switch hacemos que
     * podamos elegir que diferentes métodos queramos ejecutar en el programa y
     * en caso de añadir un valor invalido que nos lo vuelva a pedir.
     */
    public static void menu() {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean rehacerOpcion = true;

        while (rehacerOpcion == true) {
            System.out.println("-----------Menú------------");
            System.out.println("1....Método A");
            System.out.println("2....Método B");
            System.out.println("3....Método C");
            System.out.println("4....Método D");
            System.out.println("0....Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    metodoA();
                    break;
                case 2:
                    metodoB();
                    break;
                case 3:
                    metodoC();
                    break;
                case 4:
                    metodoD();
                    break;
                case 0:
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
     *
     * @param teclado
     * @return
     */
    /**
     * Se crea el método añadirNombres, en este se genera una tabla hashset,
     * luego con el bucle while hacemos que nos salga el siguiente mensaje y nos
     * pida los nombres por teclado, en el caso de colocar la palabra fin se
     * saldrá del bucle. Se añade en la tabla hashset los nombre generados por
     * teclado y que nos muestre los nombres añadidos.
     */
    public static HashSet<String> añadirNombres(Scanner teclado) {

        HashSet<String> nombresPersonas = new HashSet<>();

        while (true) {
            System.out.println("Indique el nombre de la persona o ponga la palabra " + "fin " + "para salir: ");
            String nombreLista = teclado.nextLine();

            if (nombreLista.equalsIgnoreCase("fin")) {
                break;
            }

            nombresPersonas.add(nombreLista);
        }

        return nombresPersonas;
    }

    /**
     *
     * @return
     */
    
    /**
     * Creamos el método A, en este se crea una tabla hashset añadiendo el
     * método anterior para que se ejecute. Luego hacemos que se borre la
     * pantalla, y hacemos que nos muestre el listado de nombres añadidos que se
     * guardó en la tabla hashset llamada nombresPersona. Luego se nos mostrará
     * los nombres añadidos.
     */
    
    public static HashSet<String> metodoA() {

        Scanner teclado = new Scanner(System.in);

        HashSet<String> nombresPersonas = añadirNombres(teclado);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.flush();

        System.out.println("Las personas que se han creado y se encuentran en la lista son: ");
        for (String nombreLista : nombresPersonas) {
            System.out.println(nombreLista);
        }
        return nombresPersonas;
    }

    /**
     * Creamos el método B, en este se crea una tabla hashset añadiendo el
     * método A para que se ejecute dos veces con las dos tablas hashset.
     * Haremos que se limpie la pantalla, luego con retainAll haremos que los
     * nombres que estén duplicados en ambas tablas que nos salga al ejecutar el
     * for que buscará esos nombres.
     *
     */
    public static void metodoB() {

        HashSet<String> nombresPersonas = metodoA();
        HashSet<String> nombresPersonas2 = metodoA();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.flush();

        nombresPersonas.retainAll(nombresPersonas2);
        System.out.println("Los siguientes nombres aparecen en ambos conjuntos:");
        for (String nombreLista : nombresPersonas) {
            System.out.println(nombreLista);
        }

    }

    /**
     * Creamos el método C, en este se crea una tabla hashset añadiendo el
     * método A para que se ejecute dos veces con las dos tablas hashset.
     * Haremos que se limpie la pantalla, luego con el for buscamos los nombres
     * que se han añadido por teclado. Ahora con el if haremos que si los
     * nombres que están en la lista no coinciden que se añada en la primera
     * tabla hashset, sino que borre esos nombres de ambas tablas hashset. Por
     * último, haremos que nos muestre los nombres no repetidos a través de un
     * mensaje.
     *
     */
    public static void metodoC() {

        HashSet<String> nombresPersonas = metodoA();
        HashSet<String> nombresPersonas2 = metodoA();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.flush();

        System.out.println("Los siguientes nombres aparecen sin repetir en los conjuntos:");
        for (String nombreLista : nombresPersonas2) {
            if (!nombresPersonas.contains(nombreLista)) {
                nombresPersonas.add(nombreLista);
            } else {
                nombresPersonas.remove(nombreLista);
            }

        }
        System.out.println(nombresPersonas);
    }

    /**
     * Creamos el método D, en este se crea una tabla hashset añadiendo el
     * método A para que se ejecute dos veces con las dos tablas hashset.
     * Añadimos y unificamos los nombres de ambas tablas hashset, luego con el
     * TreeSet lo ordenamos alfabeticamente. Luego con el for mostraremos en
     * un mensaje todo lo que contenga la lista hashset.
     */
    public static void metodoD() {

        HashSet<String> nombresPersonas = metodoA();
        HashSet<String> nombresPersonas2 = metodoA();

        nombresPersonas.addAll(nombresPersonas2);

        TreeSet<String> ordenarAlfabeto = new TreeSet<String>(nombresPersonas);

        System.out.println("Los siguientes nombres aparecen en ambos conjuntos:");
        for (String nombreLista : ordenarAlfabeto) {
            System.out.println(nombreLista);
        }

    }

}
