package _60_Interfaces.Ejercicio0001;

public abstract class Barco implements Matricula {

    //atributos
    private String nombre;
    private float eslora;
    private int cabinas;
    private String matricula;

    //constructor
    public Barco(String nombre, float eslora, int cabinas) {
        this.nombre = nombre;
        this.eslora = eslora;
        this.cabinas = cabinas;
        matricular();
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
                "nombre = " + this.nombre +
                ", eslora = " + this.eslora +
                ", cabinas = " + this.cabinas +
                ", matrícula = " + this.matricula;
    }

    //método matricular()
    @Override
    public String matricular() {
        System.out.println("Introduce la matrícula del barco: ");
        this.matricula = DATOS.nextLine();
        return this.matricula;
    }
}
