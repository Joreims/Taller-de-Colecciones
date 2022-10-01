/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abiga
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<String> lis_nombres = new ArrayList<>();
        
        lis_nombres.add("Walter");
        lis_nombres.add("Paul");
        lis_nombres.add("Manuel");
        lis_nombres.add("Jose");
        
        System.out.println("Tamaño: "+ lis_nombres.size());
        System.out.println("Dato Posicion 0: "+ lis_nombres.get(0));
        lis_nombres.remove(1);
         System.out.println("Tamaño: "+ lis_nombres.size());
    }
    
}

  