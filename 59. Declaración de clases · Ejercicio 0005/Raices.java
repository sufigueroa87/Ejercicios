public class Raices {

    private final double RESULTADO_RAIZ_UNICA = 0;

    //Atributos
    private double a;
    private double b;
    private double c;

    //Constructores
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Métodos
    public double obtenerRaices() {
        double discriminante = getDiscriminante();
        double resultadoRaiz = -1;
        if (discriminante > 0) {
            resultadoRaiz = Math.sqrt(discriminante);
            System.out.println("Resultado raíz A: " + resultadoRaiz);
            System.out.println("Resultado raíz B: " + (-resultadoRaiz));
            return resultadoRaiz;
        }
        return resultadoRaiz;
    }

    public boolean obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            System.out.println("Resultado de la raíz: " + RESULTADO_RAIZ_UNICA);
            return true;
        }
        return false;
    }

    public double getDiscriminante() {
        return Math.pow(b,2)-(4*a*c);
    }

    public boolean tieneRaices() {
        double determinante = getDiscriminante();
        if (determinante > 0){
            System.out.println("Tiene raíces.");
            return true;
        }
        return false;
    }

    public boolean tieneRaiz() {
        double determinante = getDiscriminante();
        if (determinante == 0) {
            return true;
        }
        return false;
    }

    public void calcular() {
        if (tieneRaices()) {
            double resultadoRaiz = obtenerRaices();
            System.out.println("Primera solución de la ecuación: " + (-b + resultadoRaiz)/(2*a));
            System.out.println("Segunda solución de la ecuación: " + (-b - resultadoRaiz)/(2*a));
        } else if (tieneRaiz()) {
            System.out.println("Única solución de la ecuación: " + (-b/(2*a)));
        } else {
            System.out.println("No existe solución para la ecuación.");
        }
    }
}
