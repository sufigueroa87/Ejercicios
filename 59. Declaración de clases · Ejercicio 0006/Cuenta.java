package _59_Declaracion_De_Clases.Ejercicio0006;

import java.util.Scanner;

public class Cuenta {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Cuenta c = new Cuenta("suns", 1000);
        c.programa();
    }

    //atributos
    private String titular;
    private double cantidad;

    //constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    //getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //método toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }


    public void programa(){
        int opcion = -1;
        while(opcion != 0) {
            mostrarMenu();
            opcion = elegirOpcion();
            ejecutarOpcion(opcion);
        }
    }

    public void mostrarMenu(){
        System.out.println("Qué quieres hacer?");
        System.out.println("1. Ingresar dinero en la cuenta.");
        System.out.println("2. Retirar dinero de la cuenta.");
        System.out.println("0. Salir");
    }

    public int elegirOpcion(){
        int opcion = -1;
        boolean opcionEquivocada = true;
        String regex = "[0-9]+";
        while (opcionEquivocada) {
            System.out.println("Introduce la opción: ");
            String opcionIntroString = keyboard.nextLine();
            if(opcionIntroString.matches(regex)){
                opcion = Integer.parseInt(opcionIntroString);
                opcionEquivocada = false;
            } else {
                System.out.println("El valor introducido no es un integer.");
            }
        }
        return opcion;
    }

    public void ejecutarOpcion(int opcion){

        switch(opcion){
            case 1:
                ingresar(cantidadIntroducida());
                break;
            case 2:
                retirar(cantidadIntroducida());
                break;
            case 0:
                System.out.println("Hasta pronto.");
                System.exit(0);
            default:
                System.out.println("La opción introducida no forma parte del menú.");
        }
    }

    public double cantidadIntroducida(){
        double cantidadIntro = 0.0;
        boolean doubleEquivocado = true;
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        while (doubleEquivocado) {
            System.out.println("Introduce la cantidad: ");
            String cantidadIntroString = keyboard.nextLine();
            System.out.println("Antes del if: " + cantidadIntroString);
            if(cantidadIntroString.matches(regex)){
                cantidadIntro = Double.parseDouble(cantidadIntroString);
                doubleEquivocado = false;
            } else {
                System.out.println("El valor introducido no es un double.");
            }
        }
        return cantidadIntro;
    }

    //métodos especiales
    //método ingresar(double cantidad)
    public void ingresar(double cantidad){
        System.out.println("Cantidad inicial: " + getCantidad());
        if(cantidad > 0){
            setCantidad(getCantidad() + cantidad);
        }
        System.out.println("Cantidad final: " + getCantidad());
    }

    //método retirar(double cantidad)
    public void retirar(double cantidad){
        System.out.println("Cantidad inicial: " + getCantidad());
        double resultado = getCantidad() - cantidad;
        if (resultado < 0) {
            setCantidad(0);
        } else {
            setCantidad(resultado);
        }
        System.out.println("Cantidad inicial: " + getCantidad());
    }
}
