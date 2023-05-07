/*
Ejercicio void
Crea un método void 
        que reciba un objeto tipo persona como parámetro y
        utilice el get para mostrar sus atributos. 
Llama ese método desde el main.

 */
package ejercicio_teorico;

import static ejercicio_teorico.newpackage.Objeto_void.mostrarPersona;
import ejercicio_teorico.persona.Persona;

//========================================================================
public class Ejercicio_teorico {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Caaaaarl");       //aca le asigno el nombre y esto lo hace reutilizable al codigo
        mostrarPersona(persona1);     //uso el metodo mostrar persona
    }
    
}
