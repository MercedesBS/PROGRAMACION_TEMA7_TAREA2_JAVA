/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, String> capitalPaises= new HashMap<>();
        capitalPaises.put("España", "Madrid");
        capitalPaises.put("Portugal", "Lisboa");
        capitalPaises.put("Francia", "París");
        
        Scanner teclado = new Scanner(System.in);

        while(true){
            System.out.println("Escribe el noombre de un país y te diré su capital: ( O escriba salir para terminar el programa): ");
            String pais = teclado.nextLine().trim();
            
            if (pais.equalsIgnoreCase("Salir")) {
            break;
            }
            
            String capitalPais = capitalPaises.get(pais);
            if (capitalPais != null){
                System.out.println("La capital de " + pais + " es " + capitalPais);
            }
            else {
                System.out.println("No conozco la respuesta ¿Cuál es la capital de " + pais + " ?: ");
                capitalPais = teclado.nextLine().trim();
                capitalPaises.put(pais, capitalPais);
                System.out.println("Gracias por enseñarme nuevas capitales.");
            }
        }  
    } 
}
