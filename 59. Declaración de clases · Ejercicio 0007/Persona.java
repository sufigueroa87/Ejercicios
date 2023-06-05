package _59_Declaracion_De_Clases.Ejercicio0007;

public class Persona {

    public static final char SEXO_DEFECTO = 'H';
    public static final int IMC_DEBAJO_PESO_IDEAL = -1;
    public static final int IMC_RESULTADO_PESO_IDEAL = 0;
    public static final int IMC_SOBREPESO = 1;

    //atributos
    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private char sexo = SEXO_DEFECTO;
    private double peso = 0;
    private double altura = 0;

    //constructor por defecto
    public Persona() {
        this.DNI = generaDNI();
    }

    //constructor
    public Persona(String nombre, int edad, char sexo) throws Exception {
        setNombre(nombre);
        this.edad = edad;
        comprovarSexo(sexo);
        this.DNI = generaDNI();
        System.out.println("Constructor DNI: " + this.DNI);
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprovarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //método calcularIMC()
    public int calcularIMC(){
        int resultado = -2;
        if (altura != 0 && peso != 0) {
            //pesoKg / altura²m
            double imc = this.peso / Math.pow(this.altura, 2);
            resultado = IMC_DEBAJO_PESO_IDEAL;
            if (imc < 20){
                System.out.println("La persona está por debajo del peso ideal.");
            } else if (imc >= 20 && imc <= 25) {
                resultado = IMC_RESULTADO_PESO_IDEAL;
                System.out.println("La persona está en el peso ideal.");
            } else {
                resultado = IMC_SOBREPESO;
                System.out.println("La persona está por encima del peso ideal (tiene sobrepeso).");
            }
        } else {
            System.out.println("No se puede calcular el IMC porque faltan datos.");
        }
        return resultado;
    }

    //método esMayorDeEdad()
    public boolean esMayorDeEdad(){
        boolean mayorEdad = true;
        if (this.edad < 18){
            mayorEdad = false;
            System.out.println("Menor de edad.");
        } else {
            System.out.println("Mayor de edad.");
        }
        return mayorEdad;
    }

    //comprovarSexo(char sexo)
    public void comprovarSexo(char sexo){
        String data = (sexo + "").toUpperCase();
        String regex = "H|M";
        if(!data.matches(regex)){
            setSexo(SEXO_DEFECTO);
        } else {
            this.sexo = Character.toUpperCase(sexo);
        }
    }

    //toString()
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    //generaDNI()
    public String generaDNI(){
        int dniNumeros = numeroAleatorio8Cifras();
        int letraDNInumero = dniNumeros % 23;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraDNI = letrasDNI[letraDNInumero];
        String dniGenerado = (dniNumeros + "") + (letraDNI + "");
        return dniGenerado;
    }

    //genera número aleatorio de 8 cifras
    public int numeroAleatorio8Cifras(){
        String stringDniNumeros = "";
        for(int i = 0; i < 8; i++){
            String valor = (int)calcularRandom(9, 0) + "";
            stringDniNumeros = stringDniNumeros + valor;
        }
        int dniNumeros = Integer.parseInt(stringDniNumeros);
        return dniNumeros;
    }

    //calcularRandom(int max, int min)
    public double calcularRandom(int max, int min){
        //Math.floor(Math.random() * (MAX - MIN + 1)) + MIN;
        double resultado = Math.floor(Math.random() * (max - min + 1)) + min;
        return resultado;
    }

    //validaciones
    //validacionNombre
    public void validacionNombre(String nombre) throws Exception {
        String regex = "[a-zA-Z]+";
        if (!nombre.matches(regex)){
            throw new Exception("Valor del nombre equivocado.");
        }
    }

    //validacionEdad
    public int validacionEdad(String edadString) throws Exception {
        String regex = "[0-9]+";
        if (!edadString.matches(regex)){
            throw new Exception("Valor de la edad no es un integer.");
        }
        return Integer.parseInt(edadString);
    }

    //validacionPeso
    public double validacionPeso(String pesoString) throws Exception {
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        if(!pesoString.matches(regex)){
            throw new Exception("Valor del peso no es un double.");
        }
        return Double.parseDouble(pesoString);
    }

    //validacionAltura
    public double validacionAltura(String alturaString) throws Exception {
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        if(!alturaString.matches(regex)){
            throw new Exception("Valor del peso no es un double.");
        }
        return Double.parseDouble(alturaString);
    }
}

