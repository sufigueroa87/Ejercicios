package _60_Herencia.Ejercicio0002;

public abstract class Atraccion {

    //atributos
    private String nombre;
    private String zona;
    private boolean tieneAccesoMR;

    //constructor
    public Atraccion(String nombre, String zona, boolean tieneAccesoMR) {
        this.nombre = nombre;
        this.zona = zona;
        this.tieneAccesoMR = tieneAccesoMR;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getZona() {
        return zona;
    }

    public boolean isTieneAccesoMR() {
        return tieneAccesoMR;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setTieneAccesoMR(boolean tieneAccesoMR) {
        this.tieneAccesoMR = tieneAccesoMR;
    }

    //método toString()
    public void imprimirAtraccion() {
        System.out.println("Atracción:");
        System.out.println(nombre);
        System.out.println(zona);
        System.out.println(tieneAccesoMR);
    }
}
