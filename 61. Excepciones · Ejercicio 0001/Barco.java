package _61_Excepciones.Ejercicio0001;

public class Barco {

    private String matricula;
    private String nombre;
    private float eslora; //largada del barco
    private int cabinas; //Total de cabines

    public Barco(String matricula, String nombre, float eslora, int cabinas) {
        this.matricula=matricula;
        this.nombre = nombre;
        this.eslora = eslora;
        this.cabinas = cabinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public int getCabinas() {
        return cabinas;
    }

    public void setCabinas(int cabinas) {
        this.cabinas = cabinas;
    }

    public String toString() {
        return "Nombre = " + nombre + "\nEslora = " + eslora + "\nCabinas = " + cabinas;
    }

    public boolean estaMatriculado(){

        if (matricula == null){ //No está matriculado
            return false;
        }else{
            return true;
        }

    }

    //TODO
    /*
    Hay que comprovar si el barco pasado por parámetro está matriculado o no con el método adecuado de la clase.

    En los 2 casos tenemos que lanzar una excepción de tipo ExcepcionBarco con el código petinente para después capturar
    la excepción producida por el barco pasado por parámetro.

    La excepción se enviará hasta el main, donde será capturada. Al ser capturada, se mostrará el mensaje específico.
     */
    public static void comprovarMatricula(Barco barco) throws ExcepcionBarco {

        if (!barco.estaMatriculado()){
            throw new ExcepcionBarco("0");
        } else {
            throw new ExcepcionBarco("default");
        }
    }
}
