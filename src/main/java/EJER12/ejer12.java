/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> nombres1 = new ArrayList<>();
        nombres1.add("Jorge");
        nombres1.add("Juan");
        nombres1.add("Pepe");
        nombres1.add("Pablo");
        nombres1.add("Manuel");
        nombres1.add("Maria");
        nombres1.add("Jorge");
        nombres1.add("Maria");
        nombres1.add("Manuel");
        nombres1.add("Lucia");
        nombres1.add("Diego");

        List<String> nombresSinRepetir = eliminarRepetidos(nombres1);
        System.out.println("Los nombres no repetidos son: ");
        System.out.println(nombresSinRepetir);
    }

    public static List<String> eliminarRepetidos(List<String> nombres) {

        Set<String> conjuntoNombres = new HashSet<>(nombres);
        List<String> listaSinRepetir = new ArrayList<>(conjuntoNombres);
        return listaSinRepetir;

    }

}
