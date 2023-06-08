public class Comercial extends Empleado {

    //Atributos
    private double comision;

    //Constructor por defecto
    public Comercial() {
        super();
    }

    //Constructor con todos los atributos pasados por parámetro
    public Comercial(String nombre, int edad, double salario, String dni, String sexo, double comision) {
        super(nombre, edad, salario, dni, sexo);
        this.comision = comision;
    }

    //getters y setters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    //Método toString()
    @Override
    public String toString() {
        return String.format("Empleado Comercial { %s, comision= %s }", super.toString(), comision );
    }

    //Método plus()
    @Override
    public void plus() {
        if(super.getEdad()>30 && comision>500){
            super.plus();
        }
    }
}
