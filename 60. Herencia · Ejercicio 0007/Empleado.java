public class Empleado {

    //Constantes
    public static final int PLUS = 200;

    //Atributos
    private String nombre;
    private int edad;
    private double salario;
    private String dni;
    private String sexo;

    //Constructor por defecto
    public Empleado() {
    }

    //Constructor
    public Empleado(String nombre, int edad, double salario, String dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.dni = dni;
        this.sexo = sexo;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Método toString()
    @Override
    public String toString() {
        return String.format("nombre= %s, edad= %s, salario= %s, dni= %s, sexo= %s", nombre, edad, salario, dni, sexo );

    }

    //Método plus()
    public void plus(){
        salario = salario + PLUS;
    }
}
