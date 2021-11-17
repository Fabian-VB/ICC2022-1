/*
Clase Cuenta
@author Villa Briseño Fabián y Chávez Granados Santiago
@version 1.0
*/
import java.util.Scanner;

public class Main{
  //Metodo principal para mostrar los datos de una agencia de coches
  public static void main(String[] args){

    //Cadenas de caracteres
    System.out.println("Bienvenido a la agencia SF Motors");


    System.out.println("Por favor introduzca sus datos.");
    /*
      Solicitamos datos al usuario
      @param n Representación del nombre
    */
    String n;
    Scanner entrada1 = new Scanner(System.in);
    System.out.print("Nombre completo: ");
    n = entrada1.nextLine();

    /*
      Solicitamos datos al usuario
      @param e Representación de la edad
    */
    int e;
    Scanner entrada2 = new Scanner(System.in);
    System.out.print("Edad: ");
    e = entrada2.nextInt();

    /*
      Solicitamos datos al usuario
      @param c Representación de la cuenta
    */
    String c;
    Scanner entrada3 = new Scanner(System.in);
    System.out.print("Cuenta bancaria: ");
    c = entrada3.nextLine();

    /*
      Solicitamos datos al usuario
      @param d Representación de la direccion
    */
    String d;
    Scanner entrada4 = new Scanner(System.in);
    System.out.print("Direccion actual: ");
    d = entrada4.nextLine();

    /*
      Solicitamos datos al usuario
      @param t Representación del nombre
    */
    int t;
    Scanner entrada5 = new Scanner(System.in);
    System.out.print("Numero de telefono: ");
    t = entrada5.nextInt();

    System.out.println("Por favor verifica tus datos.");
    //utilizamos la clase para mostrar los datos
    Comprador persona1 = new Comprador(n, e, c, d, t);
    System.out.println("Nombre: " + persona1.getNombre());
    System.out.println("Edad: " + persona1.getEdad());
    System.out.println("Cuenta: " + persona1.getCuenta());
    System.out.println("Direccion: " + persona1.getDireccion());
    System.out.println("Telefono: " + persona1.getTelefono());

    System.out.println("Gracias por realizar su compra");
  }
}
