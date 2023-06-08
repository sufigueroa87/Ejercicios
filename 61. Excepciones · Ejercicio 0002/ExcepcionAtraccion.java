package _61_Excepciones.Ejercicio0002;

public class ExcepcionAtraccion extends Exception {
    private String codigoExcepcion;

    public ExcepcionAtraccion(String codigoExcepcion) {
        this.codigoExcepcion = codigoExcepcion;
    }

    public String getMessage() {
        switch (codigoExcepcion) {
            case "0":
                return "La atracción no tiene acceso para personas con movilidad reducida.";
            default:
                return "La atracción tiene acceso para personas con movilidad reducida.";
        }
    }
}
