package personas;

public class PersonaPrueba {
    public static void main(String[] args) {
        //Creaciomn de un objeto
        //Instanciar
        Persona p1= new Persona();
        Persona p2= new Persona();

        //Llamando a un metodo del objeto creado
       /* System.out.println("Valores por default del objeto persona");
        p1.desplegarNombre();*/

        //Modificar valores
        p1.nombre="Juan";
        p1.apellidoPaterno="Esparza";
        p1.apellidoMaterno="Lara";

        //Volvemos a llamar al metodo
        System.out.println("Nuestros valores del objeto persona");
        p1.desplegarNombre();

        //Se modifica valores
        p2.nombre= "Brandon";
        p2.apellidoMaterno="Gomez";
        p2.apellidoPaterno="Monge";
        p2.desplegarNombre();

    }
}
