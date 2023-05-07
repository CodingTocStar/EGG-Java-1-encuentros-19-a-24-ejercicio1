package ejercicio_teorico.persona;


public class Persona {
    //atributos
    private String nombre;
    
    //constructores
    public Persona(){
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //GETTER & SETTER
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
