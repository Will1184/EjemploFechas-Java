package ejemplofecha;
import  java.util.Scanner;
public class EjemploFecha {
    public static void main(String[] args) {
        Scanner fText=new Scanner(System.in);
        System.out.println("Ingrese Dia, Mes y año");
        int dia;
        int mes;
        int anio;
        dia= fText.nextInt();
        mes= fText.nextInt();
        anio= fText.nextInt();
        Fecha f1=new Fecha(dia,mes,anio);

        System.out.println("Ingrese Dia, Mes y año");
        dia= fText.nextInt();
        mes= fText.nextInt();
        anio= fText.nextInt();
        Fecha f2=new Fecha(dia,mes,anio);
        System.out.println("La fecha 1 es "+f1.toString());
        System.out.println("La fecha 2 es "+f2.toString());
    }
}
