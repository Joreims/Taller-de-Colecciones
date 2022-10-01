
package arrayslist;

import java.util.*;

public class UsoEmpleados {
    public static void main(String[] args){
        
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.ensureCapacity(11);
        listaEmpleados.add(new Empleado("Ana",25,2500));
        listaEmpleados.add(new Empleado("Pedro",15,2500));
        listaEmpleados.add(new Empleado("Juan",21,2500));
        listaEmpleados.add(new Empleado("Jorge",23,2500));
        listaEmpleados.add(new Empleado("Maria",17,2500));
        listaEmpleados.add(new Empleado("Allan",25,2500));
        listaEmpleados.add(new Empleado("Jose",15,2500));
        listaEmpleados.add(new Empleado("Jairo",21,2500));
        listaEmpleados.add(new Empleado("Joan",23,2500));
        listaEmpleados.add(new Empleado("Mario",17,2500));
        listaEmpleados.add(new Empleado("Mario",17,2500));
        listaEmpleados.add(new Empleado("Mario",17,2500));
        listaEmpleados.add(new Empleado("Mario",17,2500));
        
        /*
        .Set Reemplaza el elemento en la posición especificada en esta lista con el elemento especificado.
        */
        
        //listaEmpleados.set(1, new Empleado("Martin",18,2500));
        /*
        .get Devuelve el elemento en la posición especificada en la lista.
        */
     /*
        System.out.println(listaEmpleados.get(4).datos());
        /*
        .size Devuelve el numero de elementos almacenados en la colleccion
        */
     
        System.out.println(listaEmpleados.size());
        
        for (Empleado e: listaEmpleados){
            System.out.println(e.datos());
        }
        
    }
}

class Empleado{
    public Empleado(String nombre, int edad, double salario){
        this.nombre =nombre;
        this.edad=edad;
        this.salario=salario;
        
    }
    public String datos(){
        return "El empleado se llama "+ nombre + ". Tiene " + edad + "años. " + "Y un salario de " + salario;
    
    }

    
   private String nombre;
    
   private int edad;
    
   private double salario; 
    
    
}
    