package _61_Excepciones.Ejercicio0001;

public class Main {

    public static void main(String[] args) throws ExcepcionBarco {

        //PRIMER OBJETO
        Barco b = new Barco("oaisjdB", "Cocacola", 5, 3);
        System.out.println("Matrícula del objeto b: " + b.getMatricula());
        System.out.println(b.toString());
        try {
            b.comprovarMatricula(b);
        }
        catch(ExcepcionBarco e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        //SEGUNDO OBJETO
        Barco b2 = new Barco(null, "Hola", 3, 2);
        System.out.println("Matrícula del objeto b2: " + b2.getMatricula());
        System.out.println(b2.toString());
        try {
            b2.comprovarMatricula(b2);
        }
        catch(ExcepcionBarco e){
            System.out.println(e.getMessage());
        }
    }
}
