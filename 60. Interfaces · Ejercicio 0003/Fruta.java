package _60_Interfaces.Ejercicio0003;

public class Fruta extends Producto {

    //atributos
    private String temporada;

    //constructor
    public Fruta(String nombre, String seccion, double precio, String temporada) {
        super(nombre, seccion, precio);
        this.temporada = temporada;
    }

    //getters
    public String getTemporada() {
        return temporada;
    }

    //setters
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    //imprimirProducto
    @Override
    public void imprimirProducto() {
        super.imprimirProducto();
        System.out.println("Temporada: " + temporada);
    }
}
