/**
 * Clase que tiene los pedidos de los clientes con marca de auto, modelo y color de
 * preferencia con su respectiva razón
 * @author Santiago CG
 * @version 1.0
 */
public class Auto{
    //Atributos
    private static int Frio;
    private static int Calido;
    String marca;
    String modelo;

    /**
     * Aquí se escoge el auto dependiendo de la marca y dek modelo
     * @param marca marca del auto
     * @param modelo modelo del auto
     */
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     * Si el cliente no tiene ninguna preferencia de color se imprime la razón
     */
    public void color(){
        System.out.println("Un auto de marca"+" "+marca+" "+"y modelo"+" "+modelo);
        System.out.println("No tengo un color de preferencia");
    }
    /**
     * Si el cliente prefiero los colores cálidos (rojo, naranja, amarillo, etc.) se imprime
     * la razón
     * @param Calido
     * @return
     */
    public int color(int Calido){
        System.out.println("Un auto de marca"+" "+marca+" "+"y modelo"+" "+modelo);
        System.out.println("Quiero que volteen a ver el auto");
        return 0;
    }
    /**
     * Si el cliente prefiere los colores fríos (azul, verde, morado, etc.) se imprime
     * la razón
     * @param Frio 
     * @return
     */
    public double color(double Frio){
        System.out.println("Un auto de marca"+" "+marca+" "+"y modelo"+" "+modelo);
        System.out.println("Prefiero no llamar la atención");
        return 0;
        
    }
    /**
     * Es la creación de los objetos que son las marcas y modelos que los clientes piden
     * así como la razón de los colores escogidos
     * @param args
     */
    public static void main(String []args){
        Auto auto1 = new Auto("Nissan","370Z");
        auto1.color();

        Auto auto2 = new Auto("Mercesdes Benz", "AMG-GT Coupé");
        auto2.color(Calido);

        Auto auto3 = new Auto("Toyota", "Supra");
        auto3.color(Frio);

        Auto auto4 = new Auto("KIA", "Stinger");
        auto4.color();

        Auto auto5 = new Auto("Mazda", "MX-5");
        auto5.color(Calido);

        Auto auto6 = new Auto("Subaru", "WRX");
        auto6.color(Calido);

        Auto auto7 = new Auto("Porsche", "911 Carrera");
        auto7.color();

        Auto auto8 = new Auto("Ford", "Mustang");
        auto8.color(Frio);
    }

}