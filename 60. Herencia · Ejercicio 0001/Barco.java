package _60_Herencia.Ejercicio0001;

public abstract class Barco {

    //atributos
    private String nombre;
    private float eslora;
    private int cabinas;

    //constructor
    public Barco(String nombre, float eslora, int cabinas) {
        this.nombre = nombre;
        this.eslora = eslora;
        this.cabinas = cabinas;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public float getEslora() {
        return eslora;
    }

    public int getCabinas() {
        return cabinas;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public void setCabinas(int cabinas) {
        this.cabinas = cabinas;
    }

    //método toString
    @Override
    public String toString() {
        return "Barco: " +
                "nombre='" + nombre + '\'' +
                ", eslora=" + eslora +
                ", cabinas=" + cabinas ;
    }
}
