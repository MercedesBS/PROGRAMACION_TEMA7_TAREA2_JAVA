/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER11;

import java.util.HashSet;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Jorge");
        set1.add("Juan");
        set1.add("Pepe");
        set1.add("Pablo");
        set1.add("Manuel");
        set1.add("Maria");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jorge");
        set2.add("Maria");
        set2.add("Manuel");
        set2.add("Lucia");
        set2.add("Diego");

        HashSet<String> uniones = new HashSet<>(set1);
        uniones.addAll(set2);
        System.out.println("Unión: " + uniones);

        HashSet<String> diferencias = new HashSet<>(set1);
        diferencias.removeAll(set2);
        System.out.println("Diferencia: " + diferencias);

        HashSet<String> intersecciones = new HashSet<>(set1);
        intersecciones.retainAll(set2);
        System.out.println("Intersección: " + intersecciones);
    }
}
