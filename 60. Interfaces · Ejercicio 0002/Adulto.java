package _60_Interfaces.Ejercicio0002;

public class Adulto extends Atraccion implements Intensidad {
    private double alturaMinima; //Altura mínima para poder acceder a la atracción.
    private boolean intensidad;

    public Adulto(String nombre, String zona, boolean tieneAccesoMR, double alturaMinima) {
        super(nombre, zona, tieneAccesoMR);
        this.alturaMinima = alturaMinima;
        esFuerte();
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public boolean isIntensidad() {
        return intensidad;
    }

    public void setIntensidad(boolean intensidad) {
        this.intensidad = intensidad;
    }

    public void imprimirAtraccion(){
        super.imprimirAtraccion();
        System.out.println("Altura mínima: " + alturaMinima);
        System.out.println("Intensidad: " + intensidad);
    }

    @Override
    public void esFuerte() {
        System.out.println("Introduce un 1 si intensidad fuerte o");
        System.out.println("un 0 si intensidad suave.");
        int intensidadInt = DATOS.nextInt();
        if (intensidadInt == 0){
            this.intensidad = false;
        } else {
            this.intensidad = true;
        }
    }
}
