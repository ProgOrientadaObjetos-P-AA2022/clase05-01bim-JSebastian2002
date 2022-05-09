/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
/**
 *
 * @author SALA I
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        //1.crear una persona de barrio el Valle de la ciudad de Loja
        //2.crear una persona derl bariio central de la ciudad de Cuenca
        //3.crear una persona del bariio centenario de la ciudad de Guayaquil
       
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("el Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
        
        Persona persona1 = new Persona("Alvaro Lozano", "110459587212", barrio1);
        Persona persona2 = new Persona("Diego Peñarreta", "110249487431", barrio2);
        Persona persona3 = new Persona("Jose Cueva", "110250598371", barrio3);
        
        
        System.out.println("------------------------------------------");
        System.out.printf("El nombre de la persona: \n%s El barrio de "
                + "la persona es: \n%s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.printf("El nombre de la persona: %s El barrio de la persona es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.printf("El nombre de la persona: %s El barrio de la persona es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
    }
    
}
