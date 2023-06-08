public class Ejecutable {
    public static void main(String[] args) {

        var asistente1 = new Asistente("Susana", 22, 1000.0, "64739281C", "Mujer", "región 3", 2);
        var asistente2 = new Asistente("Carmen", 36, 900.0, "73849275T", "Mujer", "región 2", 5);
        var asistente3 = new Asistente("Marcos", 54, 600.0, "83473840I", "Hombre", "región 3", 3);
        var comercial1 = new Comercial("Cristina", 36, 1300.0, "37483927F", "Mujer", 600.0);
        var comercial2 = new Comercial("Okmaya", 43, 1800.0, "84739583Y", "Hombre", 400.0);
        var comercial3 = new Comercial("Mishima", 19, 1200.0, "74950392H", "Mujer", 500.0);

        //Creación array de empleados
        Empleado[] arrayEmpleados = {asistente1, comercial2, asistente3, comercial1, asistente2, comercial3};


        //Comprovar que los métodos plus() funcionan correctamente
        Ejecutable e1 = new Ejecutable();
        e1.testMetodosPlus(asistente1, comercial1);

        //Número de mujeres de la empresa
        e1.numeroMujeresEmpresa(arrayEmpleados);

        //Cantidad hombres que cobran más de 1000 euros
        e1.numeroHombresCobranMas1000(arrayEmpleados);

        //Cantidad mujeres que son asistentes
        e1.numeroAsistentesMujeres(arrayEmpleados);

        //Mostrar todos los comerciales
        e1.muestraTodosComerciales(arrayEmpleados);

    }

    private void testMetodosPlus(Empleado a1, Empleado c1){
        System.out.println(a1.toString());
        a1.plus();
        System.out.println(a1.toString());

        System.out.println(c1.toString());
        c1.plus();
        System.out.println(c1.toString());
    }

    private void numeroMujeresEmpresa(Empleado[] arrayEmpleados){
        int cantidadMujeres = 0;
        //primera forma de realizar el bucle
        for(int i = 0; i < arrayEmpleados.length; i++){
            if(arrayEmpleados[i].getSexo().equals("Mujer")){
                cantidadMujeres++;
            }
        }
        System.out.println("La cantidad de mujeres de la empresa es: " + cantidadMujeres + ".");

        //otra manera de realizar el bucle
        int cantidadMujeresForEach = 0;

        for(Empleado empleado : arrayEmpleados){
            if(empleado.getSexo().equals("Mujer")){
                cantidadMujeresForEach++;
            }
        }
        System.out.println("La cantidad de mujeres de la empresa es: " + cantidadMujeresForEach + ".");
    }

    private void numeroHombresCobranMas1000(Empleado[] arrayEmpleados){
        int cantidadHombres = 0;
        for(int i = 0; i < arrayEmpleados.length; i++){
            if(arrayEmpleados[i].getSalario()>1000 && arrayEmpleados[i].getSexo().equals("Hombre")){
                cantidadHombres++;
            }
        }
        System.out.println("La cantidad de hombres que cobran más de 1000 euros es " + cantidadHombres + ".");

        //otra manera de hacer el for
        int cantidadHombresForEach = 0;
        for(Empleado empleado : arrayEmpleados){
            if(empleado.getSalario()>1000 && empleado.getSexo().equals("Hombre")){
                cantidadHombresForEach++;
            }
        }
        System.out.println("La cantidad de hombres que cobran más de 1000 euros es " + cantidadHombres + ".");
    }

    private void numeroAsistentesMujeres(Empleado[] arrayEmpleados){
        int cantidadAsistentesMujer = 0;
        for(Empleado empleado : arrayEmpleados){
            if(empleado.getClass().equals(Asistente.class) && empleado.getSexo().equals("Mujer")){
                cantidadAsistentesMujer++;
            }
        }
        System.out.println("La cantidad de mujeres asistentes es " + cantidadAsistentesMujer + ".");

        //otra manera
        cantidadAsistentesMujer = 0;
        for(Empleado empleado : arrayEmpleados){
            if(empleado instanceof Asistente && empleado.getSexo().equals("Mujer")){
                cantidadAsistentesMujer++;
            }
        }
        System.out.println("La cantidad de mujeres asistentes es " + cantidadAsistentesMujer + ".");
    }

    private void muestraTodosComerciales(Empleado[] arrayEmpleados){
        for(Empleado empleado : arrayEmpleados){
            if(empleado instanceof Comercial){
                System.out.println(empleado.toString());
            }
        }
    }
}