package _60_Interfaces.Ejercicio0003;

public abstract class Producto implements Oferta {

    private String nombre;
    private String seccion; //Sección del supermercado a la que corresponde el producto.
    private double precio;

    public Producto(String nombre, String seccion, double precio) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public double getPrecio() {
        return precio;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString()
    public void imprimirProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sección: " + seccion);
        System.out.println("Precio: " + precio);
    }

    //aplicarDescuento
    @Override
    public void aplicarDescuento(double descuento) {

        this.precio = (double)Math.round((this.precio - descuento)*100.0) / 100;
    }
}
