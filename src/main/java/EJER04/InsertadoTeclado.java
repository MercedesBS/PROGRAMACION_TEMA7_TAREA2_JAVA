/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER04;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class InsertadoTeclado {
    /**
     *
     * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean rehacerOpcion = true;

        while (rehacerOpcion == true) {
            System.out.println("-----------Menú------------");
            System.out.println("1....Agregar Usuarios");
            System.out.println("2....Mostrar Usuarios");
            System.out.println("0....Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    insertarContrasena();
                    break;
                case 2:
                    mostrarTodo();
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

    private static Map<String, String> IdentificadoresMap = new HashMap<String, String>();
    static Scanner teclado = new Scanner(System.in);

    public static void insertarContrasena() {
        Map.Entry<String, String> Identificar;
        System.out.println("Inserte 4 usuarios por teclado...");
        for (int i = 0; i < 4; i++) {
            System.out.println("Indique el nombre del usuario: ");
            String usuario = teclado.nextLine();
            System.out.println("Indique la clave necesaria: ");
            String clave = teclado.nextLine();
            ejer04 mapa = new ejer04();
            Identificar = new AbstractMap.SimpleEntry<String, String>(usuario, clave);
            IdentificadoresMap.put(Identificar.getKey(), Identificar.getValue());
        }
    }

    public static void mostrarTodo() {
        System.out.println("Los Usuarios y contraseñas almacenados en la base de datos son: ");
        for (Map.Entry<String, String> Identificador : IdentificadoresMap.entrySet()) {
            System.out.println("Usuario: " + Identificador.getKey() + ", Contraseña: " + Identificador.getValue());
        }
    }
}
