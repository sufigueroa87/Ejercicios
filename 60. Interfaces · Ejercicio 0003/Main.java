package _60_Interfaces.Ejercicio0003;

public class Main {

    public static void main(String[] args) {
        Fruta f = new Fruta("Pera", "Frutería", 2.3, "Verano");

        f.imprimirProducto();

        System.out.println("Aplicamos el descuento: ");
        f.aplicarDescuento(0.5);

        f.imprimirProducto();
    }
}
