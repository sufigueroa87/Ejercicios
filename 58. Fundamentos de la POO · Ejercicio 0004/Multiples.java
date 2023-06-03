public class Multiples {

    public static void main(String[] args) {

        Multiples m = new Multiples();

        System.out.println("-> Cuenta de múltiples de 2: " + m.cuentaMultiples(2) + ".");

        System.out.println("-> Cuenta de múltiples de 3: " + m.cuentaMultiples(3) + ".");

    }

    public int cuentaMultiples(int valor){
        int count = 0;

        for (int i = 2; i < 100; i++){
            if (i%valor == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }
}
