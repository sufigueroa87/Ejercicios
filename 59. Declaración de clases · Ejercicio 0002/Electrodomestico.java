public class Electrodomestico {

    private static final int PRECIO_BASE_DEFECTO = 100;
    private static final String COLOR_DEFECTO = "blanco";
    private static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
    private static final int PESO_DEFECTO = 5;
    private static final char[] CONSUMOS_ENERGETICOS = {'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] PRECIO_CONSUMOS_ENERGETICOS = {100, 80, 60, 50, 30, 10};
    private static final int[] PRECIO_TAMANO = {10, 50, 80, 100};
    private static final String[] COLORES = {"blanco", "negro", "rojo", "azul", "gris"};
    public static final String E_CONSUMO_ENERGETICO_EQUIVOCADO = "E: consumo energético equivocado.";
    private int precioBase = PRECIO_BASE_DEFECTO;
    private String color;
    private char consumoEnergetico;
    private int peso = PESO_DEFECTO;

    //CONSTRUCTORES
    public Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        if(comprobarConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        };
        if(comprobarColor(color)){
            this.color = color.toLowerCase();
        } else {
            this.color = COLOR_DEFECTO;
        };
        this.precioBase = precioBase;
        this.peso = peso;
    }


    //MÉTODOS GETTERS Y SETTERS
    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //MÉTODOS
    public boolean comprobarConsumoEnergetico(char consumoEnergetico){
        boolean found = false;
        for(int i = 0; i < CONSUMOS_ENERGETICOS.length && found == false ; i++){
            if (consumoEnergetico == CONSUMOS_ENERGETICOS[i]){
                return found = true;
            }
        }
        return found;
    }

    public boolean comprobarColor(String color){
        boolean found = false;
        for(int i = 0; i < COLORES.length && found == false; i++){
            if (color.equalsIgnoreCase(COLORES[i])){
                return found = true;
            }
        }
        return found;
    }

    public int precioFinal(){
        int sumPrecioTotal = 0;

        switch(consumoEnergetico){
            case 'A':
                sumPrecioTotal = precioBase + PRECIO_CONSUMOS_ENERGETICOS[0];
                break;
            case 'B':
                sumPrecioTotal = precioBase + PRECIO_CONSUMOS_ENERGETICOS[1];
                break;
            case 'C':
                sumPrecioTotal = precioBase + PRECIO_CONSUMOS_ENERGETICOS[2];
                break;
            case 'D':
                sumPrecioTotal = precioBase + PRECIO_CONSUMOS_ENERGETICOS[3];
                break;
            case 'E':
                sumPrecioTotal = precioBase + PRECIO_CONSUMOS_ENERGETICOS[4];
                break;
            case 'F':
                sumPrecioTotal = precioBase + PRECIO_CONSUMOS_ENERGETICOS[5];
                break;
            default:
                System.out.println(E_CONSUMO_ENERGETICO_EQUIVOCADO);
        }

        if(0 <= peso && peso < 20){
            sumPrecioTotal = sumPrecioTotal + PRECIO_TAMANO[0];
        } else if (20 <= peso && peso < 50){
            sumPrecioTotal = sumPrecioTotal + PRECIO_TAMANO[1];
        } else if (50 <= peso && peso < 80){
            sumPrecioTotal = sumPrecioTotal + PRECIO_TAMANO[2];
        } else {
            sumPrecioTotal = sumPrecioTotal + PRECIO_TAMANO[3];
        }

        return sumPrecioTotal;
    }
}
