public class ElectrodomesticoTest {

    public static void main(String[] args) {
        ElectrodomesticoTest objetoTest = new ElectrodomesticoTest();
        objetoTest.shouldReturnFalse_whenCallComprobarConsumoEnergeticoWithBadChar();
        objetoTest.shouldReturnTrue_whenCallComprobarConsumoEnergeticoWithGoodChar();
        objetoTest.shouldReturnFalse_whenCallcomprobarColorWithBadColor();
        objetoTest.shouldReturnTrue_whenCallcomprobarColorWithGoodColor();
        objetoTest.shouldCreateObjectWithAtributes_consumoEnergeticoF_badChar();
        objetoTest.shouldCreateObjectWithAtributes_colorBlanco_badColor();
        objetoTest.shouldCreateObjectWithAtributes_colorRojo_mayusculas();
        objetoTest.shouldReturnTrue_PrecioFinalOK();
    }

    public void shouldReturnFalse_whenCallComprobarConsumoEnergeticoWithBadChar() {
        System.out.println("** TEST COMPROBAR CONSUMO ENERGETICO · BAD CHAR **");
        Electrodomestico e1 = new Electrodomestico();
        System.out.println(e1.comprobarConsumoEnergetico('G'));
    }

    public void shouldReturnTrue_whenCallComprobarConsumoEnergeticoWithGoodChar() {
        System.out.println("** TEST COMPROBAR CONSUMO ENERGETICO · GOOD CHAR **");
        Electrodomestico e1 = new Electrodomestico();
        System.out.println(e1.comprobarConsumoEnergetico('B'));
    }

    public void shouldReturnFalse_whenCallcomprobarColorWithBadColor() {
        System.out.println("** TEST COMPROBAR COLOR · BAD COLOR **");
        Electrodomestico e1 = new Electrodomestico();
        System.out.println(e1.comprobarColor("marron"));
        System.out.println(e1.comprobarColor("MARRON"));
    }

    public void shouldReturnTrue_whenCallcomprobarColorWithGoodColor() {
        System.out.println("** TEST COMPROBAR COLOR · GOOD COLOR **");
        Electrodomestico e1 = new Electrodomestico();
        System.out.println(e1.comprobarColor("azul"));
        System.out.println(e1.comprobarColor("AZUL"));
    }

    public void shouldCreateObjectWithAtributes_consumoEnergeticoF_badChar() {
        System.out.println("** TEST COMPROBAR consumoEnergetico F AL INTRODUCIR BAD CHAR **");
        Electrodomestico e1 = new Electrodomestico(200, "azul", 'P', 10);
        if (e1.getConsumoEnergetico() == 'F'){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void shouldCreateObjectWithAtributes_colorBlanco_badColor() {
        System.out.println("** TEST COMPROBAR COLOR blanco AL INTRODUCIR BAD COLOR **");
        Electrodomestico e1 = new Electrodomestico(200, "rosa", 'B', 10);
        if (e1.getColor().equals("blanco")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void shouldCreateObjectWithAtributes_colorRojo_mayusculas() {
        System.out.println("** TEST COMPROBAR COLOR rojo AL INTRODUCIR COLOR ROJO MAYÚSCULAS **");
        Electrodomestico e1 = new Electrodomestico(200, "ROJO", 'B', 10);
        if (e1.getColor().equals("rojo")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void shouldReturnTrue_PrecioFinalOK(){
        System.out.println("** TEST COMPROBAR PRECIO FINAL OK **");
        Electrodomestico e1 = new Electrodomestico(100, "gris", 'A', 10);
        int precioFinal = e1.getPrecioBase() + 100 + 10;
        if (precioFinal == e1.precioFinal()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Electrodomestico e2 = new Electrodomestico(100, "gris", 'B', 23);
        int precioFinal2 = e2.getPrecioBase() + 80 + 50;
        if (precioFinal2 == e2.precioFinal()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Electrodomestico e3 = new Electrodomestico(100, "gris", 'F', 90);
        int precioFinal3 = e3.getPrecioBase() + 10 + 100;
        if (precioFinal3 == e3.precioFinal()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
