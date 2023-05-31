import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SaldoInsuficienteException {

        Scanner keyboard = new Scanner(System.in);

        Cuenta cuenta = null;

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("Qué opción del menú quieres?");
            System.out.println("1. Crear cuenta vacía.");
            System.out.println("2. Crear cuenta con saldo inicial.");
            System.out.println("3. Ingreso de dinero.");
            System.out.println("4. Sacar dinero.");
            System.out.println("5. Ver saldo.");
            System.out.println("6. Salir.");

            opcion = keyboard.nextInt();

            switch(opcion) {
                case 1:
                    cuenta = new Cuenta(0);
                    break;
                case 2:
                    System.out.println("Introduce el saldo inicial de la cuenta: ");
                    Float saldoInicial = keyboard.nextFloat();
                    cuenta = new Cuenta(saldoInicial);
                    break;
                case 3:
                    System.out.println("Introduce la cantidad de dinero que quieres ingresar: ");
                    Float dineroIngresar = keyboard.nextFloat();
                    cuenta.ingresar(dineroIngresar);
                    break;
                case 4:
                    System.out.println("Introduce la cantidad de dinero que quieres sacar: ");
                    Float dineroSacar = keyboard.nextFloat();
                    cuenta.extraer(dineroSacar);
                    break;
                case 5:
                    System.out.println(cuenta.getSaldo());
                    break;
                case 6:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Valor introducido del menú equivocado. Vuelve a probarlo.");
            }
        }
    }
}