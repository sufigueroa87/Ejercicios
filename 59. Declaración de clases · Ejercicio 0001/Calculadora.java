import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Calculadora c = new Calculadora();
        int opcion = -1;

        while (opcion != 0){
            opcion = c.pedirOpcion();
            c.ejecutarMenu(opcion);
        }

    }

    //pedirOpcion()
    public int pedirOpcion(){
        int opcion = -1;
        boolean opcionNOElegida = true;
        while (opcionNOElegida){
            mostrarMenu();
            try{
                opcion = keyboard.nextInt();
                opcionNOElegida = false;
            } catch (Exception e) {
                keyboard.next();
                System.out.println("El valor introducido no es un número.");
                System.out.println("Vuelve a intentarlo.");
            }
        }

        return opcion;
    }

    //mostrarMenu()
    public void mostrarMenu(){
        System.out.println("CALCULADORA");
        System.out.println("Menú Principal");
        System.out.println("");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Salir");

        System.out.println("Opción: ");
    }

    //ejecutarMenu()
    public void ejecutarMenu(int opcion) throws IOException {
        switch(opcion) {
            case 1:
                opcionSuma();
                presionarCualquierTeclaContinuar();
                break;
            case 2:
                opcionResta();
                presionarCualquierTeclaContinuar();
                break;
            case 3:
                opcionMultiplicar();
                presionarCualquierTeclaContinuar();
                break;
            case 4:
                presionarCualquierTeclaContinuar();
                opcionDividir();
                break;
            case 0:
                System.out.println("Gracias por usar la calculadora.");
                System.out.println("Hasta pronto.");
                break;
            default:
                System.out.println("La opción introducida no forma parte de las opciones del menú.");
                break;
        }
    }

    //opcionSuma()
    public void opcionSuma(){
        System.out.println("Entra suma.");
        int valorA = introducirValor();
        int valorB = introducirValor();

        System.out.println("La suma de " + valorA + " + " + valorB + " = " + (valorA + valorB));
    }

    //opcionResta()
    public void opcionResta(){
        System.out.println("Entra resta.");
        int valorA = introducirValor();
        int valorB = introducirValor();

        System.out.println("La resta de " + valorA + " - " + valorB + " = " + (valorA - valorB));
    }

    //opcionMultiplicar()
    public void opcionMultiplicar(){
        int valorA = introducirValor();
        int valorB = introducirValor();

        System.out.println("La multiplicación de " + valorA + " * " + valorB + " = " + (valorA * valorB));
    }

    //opcionDividir()
    public void opcionDividir(){
        int valorA = introducirValor();
        int valorB = introducirValor();

        System.out.println("La división de " + valorA + " / " + valorB + " = " + (valorA / valorB));
    }

    //introducirValor()
    public int introducirValor(){
        int valor = 0;
        boolean valorEquivocado = true;
        while (valorEquivocado){
            System.out.println("Introduce el valor.");
            try {
                valor = keyboard.nextInt();
                valorEquivocado = false;
            }
            catch(Exception e) {
                keyboard.next();
                System.out.println("El valor introducido no es un integer.");
            }
        }
        return valor;
    }

    //borrarPantalla()
    public void presionarCualquierTeclaContinuar() throws IOException {
        System.in.read();
    }
}
