import java.util.ArrayList;
import java.util.Scanner;

public class MediaAritmetica {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        MediaAritmetica m = new MediaAritmetica();
        ArrayList valores = m.introducirIntegerPositivo();
        m.calcularMediaAritmetica(valores);
    }

    public ArrayList<Integer> introducirIntegerPositivo(){
        int valor = 0;
        boolean valorEquivocado = true;
        ArrayList valores = new ArrayList<>();
        while (valor != -1 && valorEquivocado){
            System.out.println("Introduce el valor: ");
            try {
                valor = keyboard.nextInt();
                if(valor > -1){
                    valores.add(valor);
                }
            }
            catch (Exception e){
                keyboard.next();
                System.out.println("El valor introducido no es un integer. Vuelve a probarlo.");
            }
        }
        System.out.println("Valores introducidos: " + valores);
        return valores;
    }

    public double calcularMediaAritmetica(ArrayList<Integer> valores){
        double media = 0.0;
        double suma = 0;
        for(int i = 0; i < valores.size(); i++){
            suma = suma + valores.get(i);
        }

        media = suma / valores.size();

        System.out.println("La media de los valores es: " + media);

        return media;
    }
}
