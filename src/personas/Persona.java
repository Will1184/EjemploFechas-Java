package personas;

public class Persona {

    //Atributos de una clase
    //No es necesario asignar valores
    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;

    //Metrodos de la clase
    //los usaran los objetos de esta clase
   public void desplegarNombre(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido Paterno: "+apellidoMaterno);
        System.out.println("Apellido Materno: "+apellidoPaterno);
    }


}
