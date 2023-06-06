package _59_Declaracion_De_Clases.Ejercicio0009;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {

    Scanner keyboard = new Scanner(System.in);

    private int numeroOcupantes;
    private int numeroRuedas;
    private LocalDate fechaMatriculacion;
    private String color;
    private String marca;
    private double precio;

    //constructores
    public Vehiculo() {
    }

    public Vehiculo(int numeroOcupantes, int numeroRuedas, LocalDate fechaMatriculacion, String color, String marca, double precio) {
        this.numeroOcupantes = numeroOcupantes;
        this.numeroRuedas = numeroRuedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    //método crear n vehículos y printarlos por pantalla
    public void crearNVehiculos(int cantidadVehiculos){
        ArrayList<Vehiculo> listadoVehiculos = new ArrayList<Vehiculo>();
        for(int i = 0; i < cantidadVehiculos; i++){
            //pedir datos
            System.out.println("INTRODUCE LOS DATOS PARA EL VEHÍCULO " + i + ":");
            pedirNumeroOcupantes();
            pedirNumeroRuedas();
            pedirFechaMatriculacion();
            pedirColor();
            pedirMarca();
            pedirPrecio();
            Vehiculo v = new Vehiculo(this.numeroOcupantes, this.numeroRuedas, this.fechaMatriculacion, this.color, this.marca, this.precio);
            System.out.println("Datos introducidos para el vehículo " + i + ": " + toString());
            listadoVehiculos.add(v);
            System.out.println("");
        }

        System.out.println("");
        System.out.println("LISTADO DE TODOS LOS VEHÍCULOS INTRODUCIDOS: ");
        for(int i = 0; i < cantidadVehiculos; i++){
            System.out.println(listadoVehiculos.get(i));
        }
    }

    //método pedir número ocupantes
    public void pedirNumeroOcupantes(){
        String regex = "[0-9]+";
        boolean integerEquivocado = true;
        while(integerEquivocado){
            System.out.println("Introduce el número de ocupantes del vehículo: ");
            String numeroOcupantesString = keyboard.nextLine();
            if (!numeroOcupantesString.matches(regex)) {
                System.out.println("Valor introducido no es un integer.");
            } else {
                this.numeroOcupantes = Integer.parseInt(numeroOcupantesString);
                integerEquivocado = false;
            }
        }
    }

    //método pedir número de ruedas
    public void pedirNumeroRuedas(){
        String regex = "[0-9]+";
        boolean integerEquivocado = true;
        while(integerEquivocado){
            System.out.println("Introduce el número de ruedas del vehículo: ");
            String numeroRuedasString = keyboard.nextLine();
            if (!numeroRuedasString.matches(regex)) {
                System.out.println("Valor introducido no es un integer.");
            } else {
                this.numeroRuedas = Integer.parseInt(numeroRuedasString);
                integerEquivocado = false;
            }
        }
    }

    //método pedir fecha matriculación
    public void pedirFechaMatriculacion(){
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        boolean fechaEquivocada = true;
        while(fechaEquivocada){
            System.out.println("Introduce la fecha de la matriculación del vehículo:");
            String fechaMatriculacionString = keyboard.nextLine();
            if (!fechaMatriculacionString.matches(regex)){
                System.out.println("Fecha de matriculación errónea.");
            } else {
                this.fechaMatriculacion = LocalDate.parse(fechaMatriculacionString);
                fechaEquivocada = false;
            }
        }
    }

    //método pedir color
    public void pedirColor(){
        System.out.println("Introduce el color del vehículo: ");
        this.color = keyboard.nextLine();
    }

    //método pedir marca
    public void pedirMarca(){
        System.out.println("Introduce la marca del vehículo: ");
        this.marca = keyboard.nextLine();
    }

    //método pedir precio
    public void pedirPrecio(){
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        boolean doubleEquivocado = true;
        while(doubleEquivocado){
            System.out.println("Introduce el precio del vehículo: ");
            String precioString = keyboard.nextLine();
            if (!precioString.matches(regex)) {
                System.out.println("Valor introducido no es un double.");
            } else {
                this.precio = Integer.parseInt(precioString);
                doubleEquivocado = false;
            }
        }
    }

    //mostrar datos del vehículo

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numeroOcupantes=" + numeroOcupantes +
                ", numeroRuedas=" + numeroRuedas +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
