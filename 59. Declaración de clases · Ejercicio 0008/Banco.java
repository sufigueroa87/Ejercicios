package _59_Declaracion_De_Clases.Ejercicio0008;

import java.util.Scanner;

public class Banco {

    Scanner keyboard = new Scanner(System.in);

    //atributos
    private String numeroCuenta;
    private String nombreCliente;
    private double deposito;
    private double saldo;

    //constructor
    public Banco() {
    }

    public Banco(String numeroCuenta, String nombreCliente, double deposito) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.deposito = deposito;
    }

    //getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getSaldo() {
        return saldo;
    }


    //setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //programa
    public void programa() {
        int opcion = -1;
        while (opcion != 0){
            mostrarOpciones();

            try{
                opcion = preguntarOpcion();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

            try{
                ejecutarMenu(opcion);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //opciones menú
    public void mostrarOpciones(){
        System.out.println("Qué quieres hacer?");
        System.out.println("1. Crear cuenta.");
        System.out.println("2. Ver saldo.");
        System.out.println("3. Ingresar dinero.");
        System.out.println("4. Sacar dinero.");
        System.out.println("5. Mostrar todos los datos del cliente.");
        System.out.println("0. Salir.");
    }

    //pedir opción menú
    public int preguntarOpcion() throws Exception {
        String regex = "[0-9]+";
        boolean opcionIntEquivocada = true;
        int opcion = -1;
        while(opcionIntEquivocada){
            System.out.println("Qué opción quieres del menú?");
            String opcionString = keyboard.nextLine();
            if(!opcionString.matches(regex)){
                throw new Exception("La opción introducida no es un integer.");
            }
            opcion = Integer.parseInt(opcionString);
            opcionIntEquivocada = false;
        }
        return opcion;
    }

    //ejecutar menú
    public void ejecutarMenu(int opcion){
        Banco b = null;
        switch(opcion){
            case 1:
                obtenerNumeroCuenta();
                preguntarNombreCliente();
                preguntarDeposito();
                b = new Banco(numeroCuenta, nombreCliente, deposito);
                break;
            case 2:
                mostrarSaldo();
                break;
            case 3:
                try{
                    ingresarDinero();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                try{
                    reintegroDinero();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                System.out.println(toString());
                break;
            case 0:
                System.out.println("Gracias, hasta pronto.");
                System.exit(0);
                break;
            default:
                System.out.println("La opción no se encuentra en el menú.");
        }
    }

    //métodos
    //mostrar todos los datos del cliente
    @Override
    public String toString() {
        return "Banco{" +
                "numeroCuenta=" + numeroCuenta +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", deposito=" + deposito +
                ", saldo=" + saldo +
                '}';
    }

    //ingresar dinero
    public void ingresarDinero() throws Exception {
        mostrarSaldo();
        double cantidad = obtenerCantidadDinero();
        if(cantidad < 0){
            System.out.println("La cantidad introducida es negativa.");
        } else {
            this.saldo = this.saldo + cantidad;
            mostrarSaldo();
        }
    }

    //reintegro dinero
    public void reintegroDinero() throws Exception {
        mostrarSaldo();
        double cantidad = obtenerCantidadDinero();
        if(cantidad < 0){
            System.out.println("La cantidad introducida es negativa.");
        } else {
            this.saldo = this.saldo - cantidad;
            mostrarSaldo();
        }
    }

    //obtener cantidad dinero
    public double obtenerCantidadDinero() throws Exception {
        double cantidad = 0.0;
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        boolean doubleEquivocado = true;
        while(doubleEquivocado){
            System.out.println("Introduce la cantidad de dinero: ");
            String dineroIntroducido = keyboard.nextLine();
            if(!dineroIntroducido.matches(regex)){
                throw new Exception("La cantidad introducida no es un double.");
            }
            doubleEquivocado = false;
            cantidad = Double.parseDouble(dineroIntroducido);
        }
        return cantidad;
    }

    //mostrar el saldo
    public void mostrarSaldo(){
        System.out.println("El saldo actual es: " + this.saldo);
    }

    //métodos para obetener los datos para crear una cuenta del banco
    //método obtener número cuenta
    public String obtenerNumeroCuenta(){
        this.numeroCuenta = "ES";
        for (int i = 0; i < 22; i++){
            int valor = calcularRandom(9, 0);
            this.numeroCuenta = this.numeroCuenta + valor + "";
        }
        return this.numeroCuenta;
    }

    //random
    public int calcularRandom(int max, int min){
        //Math.floor(Math.random() * (MAX - MIN + 1)) + MIN;
        int resultado = (int)(Math.floor(Math.random() * (max - min + 1))) + min;
        return resultado;
    }

    //método nombre cliente
    public String preguntarNombreCliente(){
        String nombre = "";
        String regexLetras = "[a-zA-Z]+";
        boolean abcEquivocado = true;
        while(abcEquivocado){
            System.out.println("Introduce el nombre del cliente:");
            nombre = keyboard.nextLine();
            if(!nombre.matches(regexLetras)) {
                System.out.println("El nombre contiene carácteres no alfabéticos.");
            } else {
                this.nombreCliente = nombre;
                abcEquivocado = false;
            }
        }
        return nombre;
    }

    //método deposito
    public double preguntarDeposito(){
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        boolean doubleEquivocado = true;
        while(doubleEquivocado){
            System.out.println("Introduce el depósito.");
            String depositoString = keyboard.nextLine();
            if(!depositoString.matches(regex)){
                System.out.println("El depósito introducido no es un double.");
            } else {
                this.deposito = Double.parseDouble(depositoString);
                this.saldo = this.saldo + Double.parseDouble(depositoString);
                doubleEquivocado = false;
            }
        }
        return this.deposito;
    }
}
