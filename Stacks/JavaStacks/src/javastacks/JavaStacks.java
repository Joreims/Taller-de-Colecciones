/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javastacks;

import java.util.Stack;

/**
 *
 * @author Alessandra
 */
public class JavaStacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* "Primero que entra, último que sale"
        Push: introduce un dato al fondo del arreglo o vector
        Pop: quitar el último dato de la pila
        Peek: para ver el último dato de la pila
        Empty: método que se utiliza para saber si la pila está vacía*/
        //Para crear una pila:
        Stack pila = new Stack();
        //Usar push para introducir datos
        pila.push(10);
        pila.push(17);
        pila.push(20);
        pila.push(23);
        //Imprimir el último elemento de la pila
        System.out.println("El último elemento de la pila es: "+pila.peek());
        //Obtener los valores de la pila y vaciarla usando pop
        while(pila.empty() == false){
            System.out.println(pila.pop());
        }
    }
    
}
