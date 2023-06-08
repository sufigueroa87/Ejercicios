package _61_Excepciones.Ejercicio0002;

public class Main {

    public static void main(String[] args) {
        Atraccion a1 = new Atraccion("Caida libre", "Sud", true);
        try {
            a1.tieneAccesoMR();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        Atraccion a2 = new Atraccion("Hola", "Norte", false);
        try{
            a2.tieneAccesoMR();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
