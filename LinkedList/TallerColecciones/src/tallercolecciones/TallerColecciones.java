/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercolecciones;

import java.util.LinkedList;

/**
 *
 * @author Jorge
 */
public class TallerColecciones {

    public static void main(String args[]) {

        LinkedList lista = new LinkedList();
        //Agregar elementos a la lista enlazada al finalx
        lista.add("Jorge Garcia");
        lista.add("Pedro Gonzales");
        lista.add("Daniel Carvajal");
        //Agregar elementos a la lista enlazada al final
        lista.addLast("Rodrigo Alvarado");
        //Agregar elementos a la lista enlazada al inicio
        lista.addFirst("Carlos Tevez");
        //Saber el tamaño de la lista enlazada
        System.out.println("El tamaño de la lista es " + lista.size());
        // Eliminar cualquier valor de la lista enlazada por posición
        lista.remove(1);
        //Imprimir la lista enlazada
        System.out.println(lista);
    }

}
        //Codigo no utilizado
        //Imprimir el último valor ingresado de la lista enlazada
        //System.out.println(lista.getLast());
        // Imprimir el primer valor ingresado de la lista enlazada
        //System.out.println(lista.getFirst());
