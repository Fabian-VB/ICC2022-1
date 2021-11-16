/** 
 * Esta clase contiene el nombre del vendedor y si en el transcurso del día logró concretar
 * una venta, así cómo si hubo algpún problema con el cliente
 * @author Santiago CG
 * @version 1.0
*/
public class Vendedor {
    //Atributos
    String nombre;
    String venta;

    /**
     * Son los datos necesarios del vendedor
     * @param nombre Nombre del vendedor
     * @param venta Si logró concretar ventas durante el día
     */
    public Vendedor(String nombre, String venta){
        this.nombre = nombre;
        this.venta = venta;
    }
    /**
     * Como no hubo quejas durante el día se imprime "Sin quejas por el momento"
     */
    public void quejas(){
        System.out.println(nombre+","+" "+venta+" "+"hubo venta hoy");
        System.out.println("Sin quejas por el momento");
    }
    /**
     * Creación de los vendedores, así como sí hay ventas y quejas
     * @param args
     */
    public static void main(String []args){
        Vendedor vendedor1 = new Vendedor("Martha", "Sí");
        vendedor1.quejas();

        Vendedor vendedor2 = new Vendedor("José Luis", "No");
        vendedor2.quejas();
    }
}
