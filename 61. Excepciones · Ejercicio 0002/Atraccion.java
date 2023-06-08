package _61_Excepciones.Ejercicio0002;

public class Atraccion {
    private String nombre;
    private String zona; //zona del parque de atracciones a la que pertenece la atracción
    private boolean tieneAccesoMR; //indica si la atracción tiene un acceso especial para personas con movilidad reducida

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

    //TODO
    public void tieneAccesoMR() throws ExcepcionAtraccion {
        if(!tieneAccesoMR){
            throw new ExcepcionAtraccion("0");
        } else {
            throw new ExcepcionAtraccion("default");
        }
    }
}
