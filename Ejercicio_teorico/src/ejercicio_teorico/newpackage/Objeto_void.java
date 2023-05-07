/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_teorico.newpackage;

import ejercicio_teorico.persona.Persona;


public class Objeto_void {
    public static void mostrarPersona(Persona persona){ //uso la clase persona como parametro
        String nombre = persona.getNombre(); //uso el metodo get para traerlo
        System.out.println("El nombre de la persona es: " + nombre);
    }
}
