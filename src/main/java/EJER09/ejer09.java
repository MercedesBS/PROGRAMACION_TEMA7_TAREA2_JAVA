/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author MERCEDES MARÍA BELTRÁN SUÁREZ, 1ºDAW, PROGRAMACIÓN
 */
public class ejer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("La");
        listaPalabras.add("casa");
        listaPalabras.add("es");
        listaPalabras.add("amarilla");
        listaPalabras.add("clara");
        
        mostrarTodo(listaPalabras);
        
        eliminarElementos(listaPalabras, 2);
        
        mostrarTodo(listaPalabras);
        
        Set<Integer> hashNumeros = new HashSet<>();
        hashNumeros.add(0);
        hashNumeros.add(1);
        hashNumeros.add(2);
        hashNumeros.add(3);
        hashNumeros.add(4);
        
        mostrarTodo(hashNumeros);
        
        eliminarElementos(hashNumeros, 2);
        
        mostrarTodo(hashNumeros);
    }
    
    public static <T> void mostrarTodo(Collection<T> colecciones) {
        
        Iterator<T> iteradorTotal = colecciones.iterator();
        while (iteradorTotal.hasNext()) {
            T elemento1 = iteradorTotal.next();
            System.out.println(elemento1);
        }    
    }
    
    public static <T> void eliminarElementos(Collection<T> colecciones, int num) {
        
        Iterator<T> iteradorTotal = colecciones.iterator();
        int i = 0;
        while (iteradorTotal.hasNext()) {
            iteradorTotal.next();
            if (i == num) {
                iteradorTotal.remove();
                break;
            }
            i++;
        }
        
    }
    
}
