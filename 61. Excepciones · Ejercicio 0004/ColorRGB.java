public class ColorRGB {

    //Atributos
    private int r;
    private int g;
    private int b;

    //Constructor
    public ColorRGB(int r, int g, int b) throws ColorRGBException {
        comprovarRangos(r, g, b);
        asignarColor(r, g, b);
    }

    //Método comprovar rangos
    private void comprovarRangos(int r, int g, int b) throws ColorRGBException {

        String mensajeFinal = "";

        if (r > 255 | r < 0) {
            mensajeFinal = mensajeFinal + "Valor R = " + r + " fuera de rango. ";
        }

        if (g > 255 | g < 0) {
            mensajeFinal = mensajeFinal + "Valor G = " + g + " fuera de rango. ";
        }

        if (b > 255 | b < 0) {
            mensajeFinal = mensajeFinal + "Valor B = " + b + " fuera de rango. ";
        }

        if (!mensajeFinal.isEmpty()){
            throw new ColorRGBException(mensajeFinal);
        }
    }

    //Getters · Obtener
    //obtenerColor()
    public int[] obtenerColor() {
        int[] color = {obtenerColorR(), obtenerColorG(), obtenerColorB()};
        return color;
    }

    //obtenerColorR()
    public int obtenerColorR() {
        return r;
    }

    //obtenerColorG()
    public int obtenerColorG() {
        return g;
    }

    //obtenerColorB()
    public int obtenerColorB() {
        return b;
    }

    //Setters · Asignar
    //asignarColor(int r, int g, int b)
    public void asignarColor(int r, int g, int b){
        asignarColorR(r);
        asignarColorG(g);
        asignarColorB(b);
    }

    //asignarColorR(int r)
    public void asignarColorR(int r) {
        this.r = r;
    }

    //asignarColorG(int g)
    public void asignarColorG(int g) {
        this.g = g;
    }

    //asignarColorB(int b)
    public void asignarColorB(int b) {
            this.b = b;
    }
}