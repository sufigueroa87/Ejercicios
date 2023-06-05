package _59_Declaracion_De_Clases.Ejercicio0007;

import java.util.Scanner;

public class Main {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //1r objeto: obtendrá las variables que hemos pedido por teclado.
        Main m = new Main();
        Persona p1 = new Persona();
        m.pideDatosPersona(p1);
        p1.esMayorDeEdad();
        p1.calcularIMC();
        System.out.println(p1.toString());

        System.out.println("");
        System.out.println("");

        //2o objeto: obtendrá todas las variables anteriores menos el peso y la altura.
        Persona p2 = new Persona(p1.getNombre(), p1.getEdad(), p1.getSexo());
        p2.esMayorDeEdad();
        p2.calcularIMC();
        System.out.println(p2.toString());

        System.out.println("");
        System.out.println("");

        //3r objeto: por defecto. Para este último usa los métodos set para dar valores a los atributos.
        Persona p3 = new Persona();
        p3.setNombre("Pau");
        p3.setEdad(12);
        p3.setSexo('k');
        p3.setPeso(78);
        p3.setAltura(1.62);
        p3.esMayorDeEdad();
        p3.calcularIMC();
        System.out.println(p3.toString());
    }

    //pideDatosPersona()
    public void pideDatosPersona(Persona p){
        pedirNombre(p);
        pedirEdad(p);
        pedirSexo(p);
        pedirPesoKg(p);
        pedirAltura(p);
    }

    //obtenerNombre()
    public void pedirNombre(Persona p) {
        String nombre = "";
        boolean letrasEquivocada = true;
        while(letrasEquivocada) {
            System.out.println("Introduce el nombre: ");
            nombre = keyboard.nextLine();
            try {
                p.validacionNombre(nombre);
                p.setNombre(nombre);
                letrasEquivocada = false;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //obtenerEdad()
    public void pedirEdad(Persona p){
        boolean integerEquivocada = true;
        while(integerEquivocada) {
            System.out.println("Introduce la edad: ");
            String edadString = keyboard.nextLine();
            try{
                int edad = p.validacionEdad(edadString);
                p.setEdad(edad);
                integerEquivocada = false;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //obtenerSexo()
    public void pedirSexo(Persona p){
        boolean charEquivocado = true;
        while(charEquivocado) {
            System.out.println("Introduce el sexo de la persona.");
            String sexoString = keyboard.nextLine();
            if (sexoString.length() == 1){
                char sexo = sexoString.charAt(0);
                p.comprovarSexo(sexo);
                charEquivocado = false;
            } else {
                System.out.println("El valor introducido no es un char.");
            }
        }
    }

    //obtenerPeso()
    public void pedirPesoKg(Persona p){
        boolean doubleEquivocado = true;
        while(doubleEquivocado) {
            System.out.println("Introduce el peso en Kg: ");
            String pesoString = keyboard.nextLine();
            try {
                double peso = p.validacionPeso(pesoString);
                p.setPeso(peso);
                doubleEquivocado = false;
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //obtenerAltura()
    public void pedirAltura(Persona p){
        boolean doubleEquivocado = true;
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        while(doubleEquivocado) {
            System.out.println("Introduce la altura en m: ");
            String alturaString = keyboard.nextLine();
            try {
                double altura = p.validacionAltura(alturaString);
                p.setAltura(altura);
                doubleEquivocado = false;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
