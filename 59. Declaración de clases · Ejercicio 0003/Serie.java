public class Serie {

    private static final int NUM_TEMPORADAS_DEFECTO = 3;
    private static final boolean ENTREGADO_DEFECTO = false;
    private String titulo = "";
    private int numTemporadas = NUM_TEMPORADAS_DEFECTO;
    private boolean entregado = ENTREGADO_DEFECTO;
    private String genero = "";
    private String creador = "";

    //CONSTRUCTORES
    //Constructor por defecto
    public Serie() {
    }

    //Constructor con el título del creador. La resta por defecto.
    public Serie(String creador) {
        this.creador = creador;
    }

    //Constructor con todos los atributos, excepto entregado.
    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //Sobreescribir los métodos toString
    @Override
    public String toString() {
        return super.toString();
    }
}
