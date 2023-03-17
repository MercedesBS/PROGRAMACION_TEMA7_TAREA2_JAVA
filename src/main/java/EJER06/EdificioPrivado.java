/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class EdificioPrivado { 
    
    //Creamos un list de la clase principal Persona llamado personasAccedido donde se creará también este un arraylist.
    static private List<Persona> personasAccedido = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    
    //Aquí se llamará el método menú().
    public static void main(String[] args) {
        
     menu();
    }

    /**
     * Creamos el Scanner llamado teclado y los demás atributos, también crearemos un objeto llamado personaAcceso. 
     * Luego con un while lo que haremos es crear un menú donde podremos seleccionar cual queremos usar.
     * Luego con el Switch crearemos los casos que estará definidor por la opción elegida.
     */
    public static void menu() {
        
        EdificioPrivado personaAcceso = new EdificioPrivado();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean rehacerOpcion = true;

        while (rehacerOpcion == true) {
            System.out.println("-------MENU-------");
            System.out.println("1....Registrar Acceso Persona");
            System.out.println("2....Mostrar Personas que accedieron");
            System.out.println("3....Salir");
            System.out.println("-------------------");
            System.out.println("Elija una de las opciones...");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    personaAcceso.anadirPersona();
                    break;
                case 2:
                    personaAcceso.mostrarPersonas();
                    break;
                case 3:
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
     * Creamos un método llamado anadirPersona, en este se crea un Scanner y alternamos mensajes
     * y solicitamos por teclado los atributos creados. Luego en ese arraylist añadimos los datos
     * introducidos por teclado y mostrará un mensaje.
     */
    public static void anadirPersona() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el DNI de la persona que solicita entrar: ");
        String dniPersona = teclado.next();
        System.out.println("Introduzca el NOMBRE de la persona que solicita entrar: ");
        String nombrePersona = teclado.next();
        System.out.println("Introduzca los APELLIDOS de la persona que solicita entrar: ");
        String apellidosPersona = teclado.next();
        Persona personaCreada = new Persona(dniPersona, nombrePersona, apellidosPersona);

        personasAccedido.add (personaCreada);
        System.out.println("La persona ha sido registrada correctamente.");
    }

    /**
     * Creamos un método llamado mostrarPersonas, creamos un for-each con el arraylist creado
     * y dentro mostraremos los atributos llamando en el arraylist los datos añadidos.
     */
    public static void mostrarPersonas() {
        for (Persona personaAccedieron : personasAccedido) {
            System.out.println("DNI: " + personaAccedieron.getDni());
            System.out.println("Nombre: " + personaAccedieron.getNombre());
            System.out.println("Apellidos: " + personaAccedieron.getApellidos());
            System.out.println("");
        }
    }
    
}
