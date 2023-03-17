/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER04;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer04 {

    /**
     * @param args the command line arguments
     */
    
    /**
     * En este programa lo primero que haremos en el main es crear un mapa y añadir
     * el usuario y la clave de cada persona conectando el mapa creado con el método
     * insertar y por último que nos salga todo lo creado.
     */
    public static void main(String[] args) {
        
        ejer04 map = new ejer04();
        map.insertarContrasena("Maria", "Maria_2356");
        map.insertarContrasena("Carlos", "Pitufo24_3546");
        map.insertarContrasena("Manue", "Campanilla");
        map.insertarContrasena("Lucia", "Chochito22");
        map.insertarContrasena("Nerea", "Lacasadelaguitafresca24");
        map.insertarContrasena("Rodman", "WindowsXP64");
        map.mostrarTodo();
        
    }
    
    //Creamos un mapa donde añadiremos unos identificadores que sean String.
    private Map<String, String> IdentificadoresMap;

    public ejer04() {
        //Ahora al crearemos un constructor con lo anteriormente añadido.
        IdentificadoresMap = new HashMap<String, String>();
        
    }
    
    //Creamos un método con dos parámetro, los cuales se guardarán con el put en el mapa.
    public void insertarContrasena(String usuario, String password) {
        IdentificadoresMap.put(usuario, password);
    }
    
    /**
     * Creamos otro método donde mostramos un mensaje, luego con un for-each usamos el entry.Set()
     * y este lo que hará en el siguiente mensaje es mostrar todo lo que contiene los dos parámetros
     * anteriores con entry.getKey() y entry.getValue().
     */
    public void mostrarTodo() {
        System.out.println("Los Usuarios y contraseñas almacenados en la base de datos son: ");
        for (Map.Entry<String, String> entry : IdentificadoresMap.entrySet()) {
            System.out.println("Usuario: " + entry.getKey() + ", Contraseña: " + entry.getValue());
        }
    }  
}
