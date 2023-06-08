package _60_Herencia.Ejercicio0002;

public class Adulto extends Atraccion {
    private double alturaMinima; //Altura mínima para poder acceder a la atracción.

    public Adulto(String nombre, String zona, boolean tieneAccesoMR, double alturaMinima) {
        super(nombre, zona, tieneAccesoMR);
        this.alturaMinima = alturaMinima;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public void imprimirAtraccion(){
        super.imprimirAtraccion();
        System.out.println(alturaMinima);
    }
}
