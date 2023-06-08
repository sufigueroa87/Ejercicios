public class Asistente extends Empleado {

    //Atributos
    private String region;
    private int personasAtendidas;

    //Constructor por defecto
    public Asistente() {
        super();
    }

    //Constructor con todos los atributos pasados por parámetro
    public Asistente(String nombre, int edad, double salario, String dni, String sexo, String region, int personasAtendidas) {
        super(nombre, edad, salario, dni, sexo);
        this.region = region;
        this.personasAtendidas = personasAtendidas;
    }

    //getters y setters
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPersonasAtendidas() {
        return personasAtendidas;
    }

    public void setPersonasAtendidas(int personasAtendidas) {
        this.personasAtendidas = personasAtendidas;
    }

    //Método toString()
    @Override
    public String toString() {
        return String.format("Empleado Asistente { %s, region= %s, personasAtendidas= %s }", super.toString(), region, personasAtendidas );
    }

    //Método plus()
    @Override
    public void plus() {
        if(super.getEdad()<25 && super.getSexo().equals("Mujer") && region.equals("región 3")) {
            super.plus();
        }
    }
}
