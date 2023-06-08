package _61_Excepciones.Ejercicio0001;

public class Main {

    public static void main(String[] args) throws ExcepcionBarco {

        /*Barco b = new Barco("oaisjdB", "Cocacola", 5, 3);
        System.out.println(b.toString());
        b.comprovarMatricula(b);*/

        Barco b2 = new Barco("", "Hola", 3, 2);
        System.out.println(b2.toString());
        b2.comprovarMatricula(b2);
    }
}
