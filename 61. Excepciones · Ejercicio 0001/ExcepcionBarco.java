package _61_Excepciones.Ejercicio0001;

public class ExcepcionBarco extends Exception {

    private String codigoExcepcion;

    public ExcepcionBarco(String codigoExcepcion) {
        this.codigoExcepcion = codigoExcepcion;
    }

    public String getMessage() {
        switch (codigoExcepcion) {
            case "0":
                return "El barco no está matriculado.";
            default:
                return "El barco está matriculado.";
        }
    }
}
