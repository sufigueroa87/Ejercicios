## Introducción a la programación orientada a objetos. Clases.

### 58. Fundamentos de la programación orientada a objetos.

- [58\. Fundamentos de la POO · Ejercicio 0001]() IOC
  - Relacionar las preguntas siguientes, relativas al proceso de descomposición en objetos de un partido de futbol de primera división, con las respuestas correctas:
    - Cuántos objetos jugador hay?
    - Puede variar el nombre de objetos jugador?
    - Tiene sentido que haya objetos árbitro?
    - Tiene sentido que el número de camiseta sea un atributo de jugador?
    - Y si dos jugadores se pueden cambiar la camiseta entre ellos?
    - Tiene sentido que un objeto árbitro tenga una operación recibirTarjeta?

- [58\. Fundamentos de la POO · Ejercicio 0002]() IOC
  - Descompón en objetos el juego del Pacman. Usa nombres descriptivos para los objetos.

- [58\. Fundamentos de la POO · Ejercicio 0003]() IOC
  - Descompón el juego de los barcos.
  - En el juego de los barcos pueden participar 2 jugadores.
  - Cada jugador tiene 2 tableros, que solo él puede ver (el contrincante no).
  - Cada tablero es una cuadrícula en 2 dimensiones.
  - Las filas se identifican con un nombre y las columnas con una letra, de manera que en total en cada tablero hay un número de casillas igual a filas * columnas y cada casilla se puede identificar claramente con una coordenada (por ejemplo A-3, F-4, ...).
  - Las dimensiones de los tableros de los dos jugadores son idénticas.
  - Antes de empezar la partida, cada jugador ubica dentro de uno de sus tableros:
    - Un portaaviones, que ocupa 4 casillas.
    - Dos destructores, que ocupan 3 casillas.
    - Tres fragatas, que ocupan 2 casillas.
    - Cuatro submarinos, que ocupan 1 casilla.
  - La única restricción es que no se pueden ubicar barcos en diagonal (solo horizontal y verticalmente).
  - Por turnos, cada jugador dice la coordenada asociada a una casilla. El contrincante mira su tablero y responde "agua" si en esta casilla no hay ningún barco, o "tocado" si hay una parte del barco, o "tocado y hundido" si es la última casilla para que un barco esté tocado por todas las casillas.
  - Gana quien logra hundir todos los barcos del contrincante.
  - Enumera todos los objetos que componen una partida en curso, suponiendo que los diferentes jugadores ya han hubicado los barcos en los tableros respectivos, de acuerdo con la metodología de orientación a objetos.
  - Indicar algún atributo de los objetos identificados.

- [58\. Fundamentos de la POO · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/58.%20Fundamentos%20de%20la%20POO%20%C2%B7%20Ejercicio%200004) INS Esteve Terradas i Illa
  - Algoritmo que visualice la cuenta de números que son múltiples de 2 o de 3 que hay entre 1 y 100.

- [58\. Fundamentos de la POO · Ejercicio 0005](https://github.com/sufigueroa87/Ejercicios/tree/main/58.%20Fundamentos%20de%20la%20POO%20%C2%B7%20Ejercicio%200005) INS Esteve Terradas i Illa
  - Dada una secuencia de números leídos por teclado, que acabe con un -1: por ejemplo:
    - 5,3,0,2,4,4,0,0,2,3,6,0,......,-1;
  - Realiza el algoritmo que calcule la media aritmética. Supongamos que el usuario no insertará números negativos.

- [58\. Fundamentos de la POO · Ejercicio 0006]() INS Esteve Terradas i Illa
  - Algoritmo que lea números enteros hasta teclear 0, que nos muestre:
    - Máximo.
    - Mínimo.
    - Media de todos ellos.

- [58\. Fundamentos de la POO · Ejercicio 0007]() INS Esteve Terradas i Illa
  - Teniendo en cuenta que la llave es "eureka", escribir un algoritmo que nos pida una llave.
  - Solo tenemos 3 intentos para acertar.
  - Si fallamos los 3 intentos nos mostrará un mensaje indicándonos que hemos gastado los 3 intentos.
  - Si acertamos la llave, saldremos directamente del programa.

- [58\. Fundamentos de la POO · Ejercicio 0008]() INS Esteve Terradas i Illa
  - Leer 3 números que denoten una fecha (dia, mes, año).
  - Comprobar que es una fecha válida.
  - Si no es una fecha válida, escribir un mensaje de error.
  - Si es una fecha válida, escribir la fecha cambiando el número del mes por su nombre.
  - Ejemplo: 1 2 2006 -> Se tendrá que imprimir "1 de Febrero de 2006".
  - El año tiene que ser mayor a 0.
  
### 59. Declaración de clases.

- [59\. Declaración de clases · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200001) INS Esteve Terradas i Illa
  - Queremos hacer un programa que nos muestre un menú por pantalla.
  - En el caso 1:
    - Pedirá 2 números.
    - Mostrará la suma por pantalla y se esperará a que se aprete alguna tecla.
    - Cuando se haya apretado cualquier tecla, volverá al menú.
  - En el caso 2:
    - Pedirá 2 números.
    - Mostrará el resto por pantalla y se esperará a que se aprete alguna tecla.
    - Cuando se haya apretado cualquier tecla, volverá al menú.
  - En el caso 3:
    - Pedirá 2 números.
    - Mostrará el producto por pantalla y esperará a que se aprete alguna tecla.
    - Cuando se haya apretado cualquier tecla, volverá al menú.
  - En el caso 4:
    - Pedirá 2 números. Si el segundo número es 0, printará un mensaje de error. En caso contrario, mostrará la división por pantalla y esperará a que se aprete alguna tecla.
    - Cuando se haya apretado cualquier tecla, volverá al menú.
  - En el caso 0:
    - El programa finaliza.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200001.png">
</p>

- [59\. Declaración de clases · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200002) INS Esteve Terradas i Illa
  - Crea una clase llamada Electrodomestico, con las siguientes características:
    - Sus atributos son precio base, color, consumo energético (con las letras entre la A y la F) y peso. Indica que se podrán heredar.
    - Por defecto, el color será blanco, el consumo energético será F, el precio base es de 100 euros y el peso de 5Kg. Usa constantes para esto.
    - Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o minúsculas.
  - Los constructores a implementar son:
    - Un constructor por defecto
    - Un constructor con el precio y el peso. La resta por defecto.
    - Un constructor con todos los atributos.
  - Los métodos que se implementarán serán:
    - Métodos getters de todos los atributos.
    - comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, si no es correcta utiliza la letra por defecto. Se invocará en crear el objeto y no será visible.
    - comprobarColor(String color): comprueba que el color es correcto, si no lo es utiliza el color por defecto. Se invocará en crear el objeto y no será visible.
    - precioFinal(): según el consumo energético, aumentará su precio, y según su medida, también. 

<p align="center">
  <img src=https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200002.jpg>
</p>

- [59\. Declaración de clases · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200003) INS Esteve Terradas i Illa
  - Crea una clase llamada Serie con las siguientes características:
    - Sus atributos son título, número de temporadas, entregado, género y creador.
    - Por defecto, el nombre de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo de atributo.
  - Los constructores que se implementarán serán:
    - Un constructor por defecto.
    - Un constructor con el título del creador. La resta por defecto.
    - Un constructor con todos los atributos, excepto entregado.
  - Los métodos que se implementarán serán:
    - Métodos get de todos los atributos, excepto entregado.
    - Métodos set de todos los atributos, excepto entregado.
    - Sobreescribir los métodos toString. 

- [59\. Declaración de clases · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200004) INS Esteve Terradas i Illa
  - Crea una clase Libro que contenga los atributos siguientes :
    - ISBN
    - Título
    - Autor
    - Nombre de páginas
  - Crea sus métodos get y set que corresponden a cada atributo.
  - Crea el método toString() para mostrar la información relativa al libro con el formato:
    - "El libro con ISBN ___ creado por el autor ___ tiene ___ páginas."
  - En el fichero main, crear 2 objetos Libro (con los valores que se quieran) y mostrarlos por pantalla.
  - Finalmente, indicar qué libro de los dos creados tiene más páginas.

- [59\. Declaración de clases · Ejercicio 0005](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200005) INS Esteve Terradas i Illa
  - Realizaremos una clase llamada Raices, donde representaremos los valores de una ecuación de segundo grado.
  - Tendremos los 3 coeficientes como atributos, llamados a, b y c.
  - Necesitamos insertar estos 3 valores para construir el objeto.
  - Las operaciones que se podrán realizar serán las siguientes:
    - obtenerRaices(): imprime las 2 posibles soluciones.
    - obetenrRaiz(): imprime una única raíz, que será cuando solo tenga una solución posible.
    - getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la fórmula b²-4*a*c.
    - tieneRaices(): devuelve un boolean indicando si tiene dos soluciones. Para que esto suceda, el discriminante tiene que ser mayor a 0.
    - tieneRaiz(): devuelve un boolean indicando si tiene una única solución. Para que esto suceda, el discriminante tiene que ser igual a 0.
    - calcular(): muestra por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
  - Fórmula de la ecuación de segundo grado: (-b±√((b^2)-(4*a*c)))/(2*a).
  - Solo cambia el signo delante de -b.

- [59\. Declaración de clases · Ejercicio 0006](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200006) INS Esteve Terradas i Illa
  - Crea una clase llamada Cuenta que tendrá los atributos siguientes:
    - titular
    - cantidad (puede tener decimales).
  - El titular será obligatorio.
  - La cantidad será opcional.
  - Crea 2 constructores que cumplan esto.
  - Crea los métodos:
    - get
    - set
    - toString
  - Tendrá 2 métodos especiales:
    - ingresar(double cantidad):
      - Se ingresa una cantidad a la cuenta. Si la cantidad introducida es negativa, no se hará nada.
    - retirar(double cantidad):
      - Se retira una cantidad a la cuenta. Si restando la cantidad actual a la que nos pasan es negativo, la cantidad de la cuenta pasará a ser 0.
  - Si se da el caso que hay que comprovar que el valor introducido por el usuario sea de un tipo de dato concreto, usar regex.

- [59\. Declaración de clases · Ejercicio 0007](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200007) INS Esteve Terradas i Illa
  - Haz una clase llamada Persona que siga las condiciones siguientes:
    - Sus atributos son:
      - nombre
      - edad
      - DNI
      - sexo(H hombre, M mujer)
      - peso
      - altura
    - Por defecto, todos los atributos menos el DNI serán valores por defecto según el tipo:
      - 0 números
      - cadena vacía para String
      - etc.
    - Sexo será hombre por defecto, usando una constante para ello.
    - Se implantarán diversos constructores:
      - Un constructor por defecto.
      - Un constructor con:
        - nombre
        - edad
        - sexo
        - la resta por defecto.
    - Los métodos que se implantarán son:
      - Métodos set y get de cada parámetro, excepto DNI.
      - calcularIMC():
        - Calcular si la persona está en su peso ideal (peso en kg/(altura² en m).
        - Si esta fórmula devuelve un valor menor que 20, la función devuelve -1.
        - Si esta fórmula devuelve un número entre 20 y 25 (incluídos), significa que está en el peso ideal y la función devolverá 0.
        - Si esta fórmula devuelve un número mayor a 25, significa que tiene sobrepeso, y la función devuelve 1.
        - Te recomiendo que uses constantes para estos valores.
      - esMayorDeEdad():
        - Indica si es mayor de edad, devuelve un boolean.
      - comprovarSexo(char sexo):
        - Comprueva que el sexo introducido es correcto.
        - Si el sexo no es correcto, será H.
        - No será visible en el exterior.
      - toString():
        - Devuelve toda la información del objeto.
      - generaDNI():
        - Genera un número aleatorio de 8 cifras, que genera la letra correspondiente.
        - Este método será invocado cuando se construya el objeto.
        - Puedes dividir el método para que sea más sencillo.
        - No será visible en el exterior.
  - Crea la clase ejecutable que haga lo siguiente:
    - Pida por teclado el:
      - nombre
      - edad
      - sexo
      - peso
      - altura
    - Crea 3 objetos de la clase anterior:
      - 1r objeto: obtendrá las variables que hemos pedido por teclado.
      - 2o objeto: obtendrá todas las variables anteriores menos el peso y la altura.
      - 3r objeto: por defecto. Para este último usa los métodos set para dar valores a los atributos.
    - Para cada objeto, comprovar con un mensaje:
      - Si está en su peso ideal.
      - Si tiene sobrepeso.
      - Si está por debajo de su peso ideal.
	- Indicar para cada objeto si es mayor de edad.
	- Mostrar la información de cada objeto.

- [59\. Declaración de clases · Ejercicio 0008](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200008) INS Esteve Terradas i Illa
  - Crea una clase llamada Banco que contemple los datos:
    - numeroCuenta
    - nombreCliente
    - depósito
    - saldo
  - Desarrolla los métodos necesarios para:
    - Mostrar todos los datos del cliente.
    - Mostrar el saldo.
    - Hacer ingresos que aumenten el saldo de la cuenta. Haz también que se muestre el saldo resultante.
    - Hacer reintegramentos (sacar dinero) que hagan disminuir el saldo. Haz también que se muestre el saldo resultante.

- [59\. Declaración de clases · Ejercicio 0009](https://github.com/sufigueroa87/Ejercicios/tree/main/59.%20Declaraci%C3%B3n%20de%20clases%20%C2%B7%20Ejercicio%200009) INS Esteve Terradas i Illa
  - Se quiere implementar el control de un Ferry. Para ello, crearemos una clase Vehiculo que contemple aspectos comunes a todos los vehiculos como:
    - numeroOcupantes
    - numeroRuedas
    - fechaMatriculacion
    - medioDesplazamiento
    - etc.
  - Haz un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.

* * *

## Utilización avanzada de clases.

### 60. Creación de aplicaciones escalables. Encapsulación. Polimorfismo. Herencia. Interfaces.

- [60\. Herencia · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200001) IOC
  - Tenemos la siguiente clase Velero.
  - El retorno del método toString son los valores separados por comas de todos los atributos del objeto de tipo velero que llama al método.
  - Tenemos que implementar la superclase abstracta Barco de la que hereda la clase Velero.
```Java
	public class Velero extends Barco {
		
		int velas; //Total de velas

		public Velero(String nombre, float eslora, int cabinas, int velas) {
		    super(nombre, eslora, cabinas);
		    this.velas = velas;
		}   

		public int getVelas() {
		    return velas;
		}

		public void setVelas(int velas) {
		    this.velas = velas;
		}    

		public String toString() {
		    return super.toString()+ ", Velas=" + velas;
		}
		
	}
```

- [60\. Herencia · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200002) IOC
  - Tenemos la siguiente clase Adulto.
  - Esta clase está definida por:
    - Su nombre.
    - La zona del parque de atracciones donde seencuentra.
    - Si tiene acceso para personas con movilidad reducida o no.
    - La altura mínima que se tiene que tener para acceder.
  - El método de la clase imprimirAtraccion() imprime los valores de todos los atributos, uno en cada línea, del objeto de tipo Adulto que llama al método.
  - El parámetro tieneAccesoMR, es un boleano que indica si la atracción tiene acceso para personas con movilidad reducida o no.
  - Hay que implementar la superclase abtracta Atraccion de la que hereda la clase Adulto. Pensad que también tienen que estar implementados los métodos accesores (setters y getters) de todos sus atributos.
```Java
	public class Adulto extends Atraccion {
		private double alturaMinima; //Altura mínima para poder acceder a la atracción.
		
		public Adulto(String nombre, String zona, boolean tieneAccesoMR, double alturaMinima) {
			super(nombre, zona, tieneAccesoMR);
			this.alturaMinima = alturaMinima;
		}
		
		public double getAlturaMinima() {
			return alturaMinima;
		}
		
		public void setAlturaMinima(double alturaMinima) {
			this.alturaMinima = alturaMinima;
		}
	
		public void imprimirAtraccion(){
			super.imprimirAtraccion();
			System.out.println(alturaMinima);
		}
	}
```

- [60\. Herencia · Ejercicio 0003]() INS Esteve Terradas i Illa
  - A partir de la clase Vehiculo (el código se muestra a continuación), y mediante la herencia, crear nuevas clases que puedan diferenciar si el objeto es un coche, una moto, un camión, una bici, una lancha.
  - Inserta en cada clase algún atributo específico para diferenciar una clase de otra.
  - Por ejemplo, para el coche insertar un booleano que determine si es de 3 o 5 puertas.
  - Por ejemplo, para el camión la altura (indiferente para el resto de vehículos).
  - etc.
  - Haz un programa que construya 1 objeto de cada una de las subclases de Vehiculo que has creado.

```Java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {

    Scanner keyboard = new Scanner(System.in);

    private int numeroOcupantes;
    private int numeroRuedas;
    private LocalDate fechaMatriculacion;
    private String color;
    private String marca;
    private double precio;

    //constructores
    public Vehiculo() {
    }

    public Vehiculo(int numeroOcupantes, int numeroRuedas, LocalDate fechaMatriculacion, String color, String marca, double precio) {
        this.numeroOcupantes = numeroOcupantes;
        this.numeroRuedas = numeroRuedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    //método crear n vehículos y printarlos por pantalla
    public void crearNVehiculos(int cantidadVehiculos){
        ArrayList<Vehiculo> listadoVehiculos = new ArrayList<Vehiculo>();
        for(int i = 0; i < cantidadVehiculos; i++){
            //pedir datos
            System.out.println("INTRODUCE LOS DATOS PARA EL VEHÍCULO " + i + ":");
            pedirNumeroOcupantes();
            pedirNumeroRuedas();
            pedirFechaMatriculacion();
            pedirColor();
            pedirMarca();
            pedirPrecio();
            Vehiculo v = new Vehiculo(this.numeroOcupantes, this.numeroRuedas, this.fechaMatriculacion, this.color, this.marca, this.precio);
            System.out.println("Datos introducidos para el vehículo " + i + ": " + toString());
            listadoVehiculos.add(v);
            System.out.println("");
        }

        System.out.println("");
        System.out.println("LISTADO DE TODOS LOS VEHÍCULOS INTRODUCIDOS: ");
        for(int i = 0; i < cantidadVehiculos; i++){
            System.out.println(listadoVehiculos.get(i));
        }
    }

    //método pedir número ocupantes
    public void pedirNumeroOcupantes(){
        String regex = "[0-9]+";
        boolean integerEquivocado = true;
        while(integerEquivocado){
            System.out.println("Introduce el número de ocupantes del vehículo: ");
            String numeroOcupantesString = keyboard.nextLine();
            if (!numeroOcupantesString.matches(regex)) {
                System.out.println("Valor introducido no es un integer.");
            } else {
                this.numeroOcupantes = Integer.parseInt(numeroOcupantesString);
                integerEquivocado = false;
            }
        }
    }

    //método pedir número de ruedas
    public void pedirNumeroRuedas(){
        String regex = "[0-9]+";
        boolean integerEquivocado = true;
        while(integerEquivocado){
            System.out.println("Introduce el número de ruedas del vehículo: ");
            String numeroRuedasString = keyboard.nextLine();
            if (!numeroRuedasString.matches(regex)) {
                System.out.println("Valor introducido no es un integer.");
            } else {
                this.numeroRuedas = Integer.parseInt(numeroRuedasString);
                integerEquivocado = false;
            }
        }
    }

    //método pedir fecha matriculación
    public void pedirFechaMatriculacion(){
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        boolean fechaEquivocada = true;
        while(fechaEquivocada){
            System.out.println("Introduce la fecha de la matriculación del vehículo:");
            String fechaMatriculacionString = keyboard.nextLine();
            if (!fechaMatriculacionString.matches(regex)){
                System.out.println("Fecha de matriculación errónea.");
            } else {
                this.fechaMatriculacion = LocalDate.parse(fechaMatriculacionString);
                fechaEquivocada = false;
            }
        }
    }

    //método pedir color
    public void pedirColor(){
        System.out.println("Introduce el color del vehículo: ");
        this.color = keyboard.nextLine();
    }

    //método pedir marca
    public void pedirMarca(){
        System.out.println("Introduce la marca del vehículo: ");
        this.marca = keyboard.nextLine();
    }

    //método pedir precio
    public void pedirPrecio(){
        String regex = "[0-9]{1,13}(\\.[0-9]*)?";
        boolean doubleEquivocado = true;
        while(doubleEquivocado){
            System.out.println("Introduce el precio del vehículo: ");
            String precioString = keyboard.nextLine();
            if (!precioString.matches(regex)) {
                System.out.println("Valor introducido no es un double.");
            } else {
                this.precio = Integer.parseInt(precioString);
                doubleEquivocado = false;
            }
        }
    }

    //mostrar datos del vehículo

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numeroOcupantes=" + numeroOcupantes +
                ", numeroRuedas=" + numeroRuedas +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
```

- [60\. Herencia · Ejercicio 0004]() INS Esteve Terradas i Illa
  - Una inmobiliaria vende 2 tipos de inmuebles:
    - Pisos
    - Locales
  - Para cualquier tipo de inmueble, se conoce:
    - La dirección
    - El número de metros cuadrados
  - Para los pisos se tendrá que conocer el piso concreto en el que se encuentra la vivienda.
  - Para los locales, se importará el número de ventanas que tenga.
  - Cualquier de estos inmuebles puede ser nuevo o de segunda mano.
  - El precio de cada inmueble se calcula a partir de un precio base y de una serie de características:
    - Si tiene menos de 15 años, el precio se rebajará un 1%.
    - Si tiene más de 15 años, el precio se rebajarà un 2%.
  - En el caso de los pisos, si es un tercero o más, su precio se incrementará en un 3%.
  - Para los locales:
    - Si tienen más de 50 metros cuadrados, su precio se incrementará un 1%.
    - Si tienen 1 o ningún ventanal, su precio se reduce en un 2%.
    - Si tienen más de 4 ventanas, su precio aumentará un 2%.

- [60\. Herencia · Ejercicio 0005]() INS Esteve Terradas i Illa
  - Un centro cultural se dedica al alquiler de 2 tipos de materiales:
    - Discos
    - Libros
  - Para los 2 materiales guarda información general:
    - Código identificativo
    - Título
    - Autor
  - En el caso de los libros, almacenan también su número de páginas.
  - Para los discos, almacenan el nombre de la discográfica.

- [60\. Herencia · Ejercicio 0006]() INS Esteve Terradas i Illa
  - Se trata de crear una librería de clases que represente:
    - Figuras geométricas tridimensionales (cubo y cilindro) y su respectiva gerarquía de clases.
    - Figuras geométricas bidimensionales (rectángulo y círculo) y su respectiva gerarquía de clases.
    - De las figuras bidimensional se quiere calcular:
      - El área y el perímetro.
    - De las figuras tridimensionales, se quiere calcular:
      - El área y el volumen.
  - Para modelar este problema necesitas saber:
    - Cubo: lado
    - Cilindro: radio y altura
    - Rectángulo: ancho y altura
    - Círculo: radio

- [60\. Herencia · Ejercicio 0007](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200007) INS Esteve Terradas i Illa
  - Nos piden hacer un programa que gestione empleados.
  - Los empleados se definen por tener:
    - Nombre
    - Edad
    - Salario
    - Dni
    - Sexo
  - También tendremos una constante llamada PLUS, que tendrá un valor de 200 euros.
  - Tenemos 2 tipos de trabajadores: asistente y comercial.
    - El comercial, además de los atributos anteriores, tiene uno más llamado comisión (double).
    - El asistente, además de los atributos de empleado, tiene la región (String) y el número de personas atendidas (int).
  - Crea sus constructores, getters y setters y toString (piensa en aprovechar la herencia).
  - Las clases tendrán un método llamado plus, que según cada clase tendrá una implementación distinta. Este plus aumenta básicamente el salario del empleado.
  - El comercial, si tiene más de 30 años y cobra una comisión de más de 500 euros, se le aplicará el plus.
  - El asistente, si tiene menos de 25 años, si es mujer y si reparte en la "región 3", recibirá un plus.
  - Crea una clase ejecutable donde crearás un array de empleados. Crea distintos tipos de empleados en el array. Imprime por pantalla el siguiente informe:
    - a) Número de mujeres en la empresa.
    - b) Número de hombres que cobran más de 1000 euros.
    - c) Número de asistentes que son mujeres.
    - d) Muestra todos los comerciales.

- [60\. Herencia · Ejercicio 0008]() INS Esteve Terradas i Illa
  - Partiendo de la clase electrodoméstico que se muestra a continuación, sabemos que una lavadora es un electrodoméstico, por tanto, crearemos una subclase llamada Lavadora con las siguientes características:
  - Su atributo es carga, además de los heredados. Por defecto, la carga es de 5Kg. Usa una constante para esto.
  - Los constructores que se implementarán serán:
    - Un constructor por defecto.
    - Un constructor con el precio y el peso. El resto por defecto.
    - Un constructor con la carga y otros atributos heredados. Recuerda que tienes que llamar al constructor de la clase padre.
  - Los métodos que se implementarán serán:
    - Método get de carga.
    - precioFinal(): si tiene una carga más grande de 40Kg, aumentará su precio 50 euros, si no es así no incrementará el precio. Haz una llamada al método padre y añade el código necesario. Recuerda que las condiciones de la clase Electrodomestico también afectarán al precio.
  - **a) CREACIÓN DE LA SUBCLASE Televisor:**
  - Un televisor, es un Electrodoméstico, por tanto, crearemos una subclase llamada Televisor con las siguientes características:
  - Sus atributos son: resolución(en pulgadas), sintonizador TDT(boolean), además de los atributos heredados. Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
  - Los constructores que se implementarán serán:
    - Un constructor por defecto.
    - Un constructor con el precio y el peso. El resto por defecto.
    - Un constructor con resolución, sintonizador TDT y la resta de atributos heredados. Recuerda que tienes que llamar al constructor de la clase padre.
  - Los métodos que se implementarán serán:
    - Método get de resolución y sintonizador TDT.
    - precioFinal(): si tiene una resolución más grande de 40 pulgadas, se incrementará el precio en un 30% y si tiene un sintonizador TDT incorporado, aumentará 50 euros. Recuerda que las condiciones de la clase Electrodoméstico también afectan al precio.
  - **b) CREACIÓN DE LA CLASE Ejecutable:**
  - Ahora crea una clase Ejecutable que haga lo siguiente:
    - Crea un array de Electrodomésticos de 10 posiciones.
    - Asigna a cada posición un objeto de las clases anteriores con los valores que quieras.
    - Ahora, recorre este array y ejecuta el método precioFinal().
    - Tendrás que mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, de todas las lavadoras por otra y la suma de los electrodomésticos (puedes crear objetos Electrodoméstico, pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda usar el operador instanceOf. Por ejemplo, si tenemos un electrodoméstico con un precio final de 300, una lavadora de 200 y una televisión de 500, el resultado final será de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.

- [60\. Herencia · Ejercicio 0009]() INS Esteve Terradas i Illa
  - Nos piden que gestionemos un conjunto de productos.
  - Los productos tienen los atributos siguientes:
    - Nombre
    - Precio
    - Código: Formado por una letra y un número.
  - Tenemos 2 tipos de productos:
    - Segunda mano: tiene un atributo llamado antigüedad. Representa los años que tiene el producto.
    - Nuevo: tiene un atributo llamado tipo. Este atributo puede tener los valores: mueble, jardinería, ropa o electrodoméstico.
  - Crea los constructores, getters, setters y toString.
  - Tendremos una función llamada calcularPrecio que recibe un número indicando la cantidad de productos.
  - El precio de cualquier producto se calcula multiplicándolo por la cantidad de productos, pero si el producto es de seunga mano, el precio del producto va en función de la antigüedad:
    - En la clase Nuevo, este método solo calcula el precio final que consiste en multiplicar la cantidad por el precio.
    - En la clase SegundaMano, además, el precio del producto se reducirá según los años:
      - Si tiene menos de 1 año, se reducirá en un 20% el precio final.
      - Si tiene entre 2 y 5 años, se reducirá en un 30% el precio final.
      - Si tiene más de 5 años, se reducirá a la mitad del precio final.
  - Crearemos una clase principal, que tendrá un array de productos. Inseriremos productos de los diferentes tipos y mostraremos:
    - a) La información del producto más caro.
    - b) La información del producto más antiguo.
    - c) Todos los productos nuevos que sean muebles y que tengan un precio superior a 200 euros.
   
- [60\. Herencia · Ejercicio 0010](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200010) IOC
  - Crea una jerarquía implementando la subclase Fruta.
  - La subclase Fruta hereda de la superclase Producto.
  - La clase Fruta tiene un atributo propio llamado temporada de tipo String, que incica en qué temporada se comercializa esta fruta:
    - Verano
    - Otoño
    - Invierno
    - Primavera
  - Esta jerarquía de clases tiene que implementar el método constructor para inicializar todos los atributos con los valores pasados por parámetro y todos los métodos accesores (getters y setters) de sus atributos.
  - El método imprimirProducto() tiene que imprimir el valor de todos los atributos de la clase Fruta.
  - Tenemos que tener presente el concepto de reutilización de código en Java.

```Java
	public abstract class Producto {

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
	}
```

- [60\. Interfaces · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Interfaces%20%C2%B7%20Ejercicio%200001) IOC
  - Tenemos la siguiente interfaz Matricula.
  - Implementarla en la clase Barco, teniendo en cuenta que el método matricular() tiene que pedir al usuario que introduzca la matrícula del barco que devolverá el método.
  - Obtener la superclase abstracta Barco y la subclase Velero [aquí](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200001).
```Java
	public interface Matricula {
		public String matricular();
	}
```

- [60\. Interfaces · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Interfaces%20%C2%B7%20Ejercicio%200002) IOC
  - Tenemos la siguiente interfaz Intensidad.
  - Implementarla en la clase de la jerarquía formada por la superclase Atraccion , que contiene subclases como la clase Adulto.
  - El método esFuerte() se tiene que pedir al usuario si la atracción es de intensidad fuerte o no.
  - Si el valor introducido es 1, se le asignará verdadero a un nuevo atributo boolean con nombre fuerte.
  - Si el valor introducido es 0, se le asignará el valor falso.
  - No tenéis que controlar si el usuario introduce un valor diferente de 1 o 0, supondremos que siempre se introduce 1 o 0.
  - Para decidir en qué clase hay que implementar la interfaz, en la clase Atraccion o en la clase Adulto, tenéis que tener en cuenta que la intensidad solo es de las atracciones para adultos.
  - Obtener la superclase abstracta Atraccion y la subclase Adulto [aquí](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200002).

```Java
	public interface Intensidad {
		public void esFuerte();
	}
```

- [60\. Interfaces · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Interfaces%20%C2%B7%20Ejercicio%200003) IOC
  - Implementa la interfaz Oferta en la clase Producto, teniendo en cuenta que el método aplicarDescuento(double descuento) tiene que modificar el precio del producto que llama al método, aplicándole el descuento pasado por parámetro.
  - Puedes obtener la clase Producto [aquí](https://github.com/sufigueroa87/Ejercicios/tree/main/60.%20Herencia%20%C2%B7%20Ejercicio%200010).
  
```Java
	public interface Oferta {
    	public void aplicarDescuento(double descuento);
	}
```

* * *

## Clases fundamentales. 

### 61. Clases fundamentales. Exceptions. Colecciones. List. Iterator. Comparable. Comparator.

- [61\. Excepciones · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/61.%20Excepciones%20%C2%B7%20Ejercicio%200001) IOC
  - En el método comprovarMatricula(Barco barco), tenemos que comprovar si el barco pasado por parámetro está matriculado o no con el método adecuado de esta clase.
  - En los 2 casos tenemos que lanzar una excepción de tipo ExcepcionBarco con el código pertinente para después capturar la excepción producida por el barco pasado por parámetro.
  - La excepción se enviará hasta el main, donde será capturada. Al ser capturada, se mostrará el mensaje específico.
  
```Java
	public class ExcepcionBarco extends Exception {
		private String codigoExcepcion;

		public ExcepcionBarco(String codigoExcepcion) {

		    this.codigoExcepcion = codigoExcepcion;

		}

		public String getMessage() {

		    switch (codigoExcepcion) {
		        case "0":
		            return "El barco no está matriculado";
		        default:
		            return "El barco está matriculado";
		    }
		}
	}
```
```Java
	public class Barco {

		private String matricula;
		private String nombre;
		private float eslora; //largada del barco
		private int cabinas; //Total de cabines

		public Barco(String matricula, String nombre, float eslora, int cabinas) {
		    this.matricula=matricula;
		    this.nombre = nombre;
		    this.eslora = eslora;
		    this.cabinas = cabinas;
		}

		public String getNombre() {
		    return nombre;
		}

		public void setNombre(String nombre) {
		    this.nombre = nombre;
		}

		public float getEslora() {
		    return eslora;
		}

		public void setEslora(float eslora) {
		    this.eslora = eslora;
		}

		public int getCabinas() {
		    return cabinas;
		}

		public void setCabinas(int cabinas) {
		    this.cabinas = cabinas;
		}

		public String toString() {
		    return "Nombre=" + nombre + "\nEslora=" + eslora + "\nCabinas=" + cabinas;
		}

		public boolean estaMatriculado(){

		    if (matricula == null){ //No está matriculado
		        return false;
		    }else{
		        return true;
		    }

		}

		//TODO
		public static void comprovarMatricula(Barco barco) throws ExcepcionBarco {

		}
	}
```

- [61\. Excepciones · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/61.%20Excepciones%20%C2%B7%20Ejercicio%200002) IOC
  - En el método tieneAccesoMR() hay que comprovar si la atracción que llama a este método tiene acceso para personas con movilidad reducida o no.
  - En los dos casos tenemos que lanzar una excepción de tipo ExcepcionAtraccion con lo pertinente para después capturar la excepción producida.
  - La excepción se enviará hasta el main, donde será capturada. Al ser capturada, se mostrará el mensaje específico.
```Java
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
```
```Java
	public class Atraccion{
	   
		private String nombre;
		private String zona; //zona del parque de atracciones a la que pertenece la atracción
		private boolean tieneAccesoMR; //indica si la atracción tiene un acceso especial para personas con movilidad reducida

		public Atraccion(String nombre, String zona, boolean tieneAccesoMR) {
		    this.nombre = nombre;
		    this.zona = zona;
		    this.tieneAccesoMR = tieneAccesoMR;
		}

		public String getNombre() {
		    return nombre;
		}

		public void setNombre(String nombre) {
		    this.nombre = nombre;
		}

		public float getZona() {
		    return zona;
		}

		public void setZona(String zona) {
		    this.zona = zona;
		}
		
		public boolean isTieneAccesoMR(){
		   return tieneAccesoMR;   
		}
		
		public void setTieneAccesoMR(boolean tieneAccesoMR) {
			this.tieneAccesoMR = tieneAccesoMR;
		}
		
		//TODO
		public void tieneAccesoMR() throws ExcepcionAtraccion {
			
		} 
	}
```

- [61\. Excepciones · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/61.%20Excepciones%20%C2%B7%20Ejercicio%200003) INS Esteve Terradas i Illa
  - Se pretende desarrollar una aplicación que simule el funcionamiento de un cajero automático.
  - Crea una clase que se llame cuenta que gestione las operaciones sobre la cuenta.
  - Además de los constructores y campos que se necesiten, la clase contará con los siguientes métodos:
    - void ingresar(float c) : para añadir dinero.
    - void extraer(float c) : para sacar dinero.
    - float getSaldo : devuelve el saldo actual.
    
  - Por otro lado, existirá una clase con un método main encargada de la captura y presentación de datos y la gestión de la cuenta.
  - Al iniciar la aplicación se mostrará el siguiente menú:
    - 1. Crear cuenta vacía.
    - 2. Crear cuenta con saldo inicial.
    - 3. Ingreso de dinero.
    - 4. Sacar dinero.
    - 5. Ver saldo.
    - 6. Salir.
    
  - Por último, haz las modificaciones necesarias para añadir un mecanismo de excepciones para tratar la situación de saldo insuficiente.
  - Si se quiere sacar más dinero que el saldo disponible, lanzaremos una excepción personalizada SaldoInsuficienteException. Se tendrá que capturar en el main.

- [61\. Excepciones · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/61.%20Excepciones%20%C2%B7%20Ejercicio%200004) INS Esteve Terradas i Illa
  - Implementaremos las clases necesarias para guardar un píxel.
  - La información a guardar será la posición en la pantalla y su color en formato RGB.
  - La descripción RGB de un color hace referencia a la composición del color en términos de la intensidad de los colores primarios con el que se forma.
  - El rojo (Red), verde (Green), azul(Blue).
  - Para indicar con qué proporción se mezclan, cada color primario está representado con un número comprendido entre el 0 (no interviene en la mezcla) y el 255 (interviene con la máxima intensidad).
  - Haremos una clase con el nombre ColorRGB.

  - Para evitar un posible error en el momento de introducir valores RGB crearemos una excepción ColorRGBException.
  - El mensaje de la excepción tiene que decir de forma clara qué valores son válidos. Por ejemplo, si se intenta crear un objeto ColorRGB con los valores (500, 10, -50) el mensaje deberá de ser: Valor R = 350 fuera de rango. Valor B = -50 fuera de rango.
  - Una vez tengas implementada la clase ColorRGB y ColorRGBException será necesario implementar la clase Pixel.

  - En cualquiera de los métodos anteriores cuando se lance la excepción ColorRGB no se tratará, solo se propagará.
   
<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/61.%20Excepciones%20%C2%B7%20Ejercicio%200004.png">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/61.%20Excepciones%20%C2%B7%20Ejercicio%200004%20%C2%B7%20b.png">
</p>

- [61\. Excepciones · Ejercicio 0005]()
  
- [61\. Colecciones · List · Ejercicio 0001]() IOC
  - Dada la clase Barco, completar el código de la clase Puerto según las indicaciones de los comentarios "TODO".

```Java
	public class Barco {

		private String matricula;
		private String nombre;
		private float eslora;
		private int cabinas;

		public Barco(String matricula, String nombre, float eslora, int cabinas) {
		    this.matricula=matricula;
		    this.nombre = nombre;
		    this.eslora = eslora;
		    this.cabinas = cabinas;
		}

		public String getMatricula() {
		    return matricula;
		}

		public void setMatricula(String matricula) {
		    this.matricula = matricula;
		}

		public String getNombre() {
		    return nombre;
		}

		public void setNombre(String nombre) {
		    this.nombre = nombre;
		}

		public float getEslora() {
		    return eslora;
		}

		public void setEslora(float eslora) {
		    this.eslora = eslora;
		}

		public int getCabinas() {
		    return cabinas;
		}

		public void setCabinas(int cabinas) {
		    this.cabinas = cabinas;
		}

		public String toString() {
		    return "Nom=" + nombre + "\nEslora=" + eslora + "\nCabines=" + cabinas;
		}

		public boolean estaMatriculado(){

		    if (matricula == null){ //No está matriculado
		        return false;
		    }else{
		        return true;
		    }
		}
	}

```
```Java
	public class Puerto {

		private String nombre;

		/*TODO
		Tenemos que crear un atributo llamado puerto que sea un List que implementaremos mediante un ArrayList
		para guardar barcos.
		*/


		public Puerto(String nom) {
		    this.nombre = nom;
		}

		public void anadirBarco(Barco barco){
		    /*TODO
		      Tenemos que añadir al final del atributo creado el barco pasado por parámetro.*/
		}

		public void eliminarBarco(Barco barco){
		    /*TODO
		     Tenemos que eliminar el barco pasado por parámetro si este está en el puerto.*/
		}

		public void mostrarMatricula(){
		    /*TODO
		     Tenemos que imprimir por pantalla la matrícula de los barcos que hay en el puerto con una eslora de más de
		     20m.
		    */
		}
	}
```

- [61\. Colecciones · List · Ejercicio 0002]() IOC
  - Dada la clase Atraccion, completar el código de la clase ParqueAtracciones según las indicaciones TODO.

```Java
	public class Atraccion {

		//atributos
		private String nombre;
		private String zona;
		private boolean tieneAccesoMR;

		//constructor
		public Atraccion(String nombre, String zona, boolean tieneAccesoMR) {
		    this.nombre = nombre;
		    this.zona = zona;
		    this.tieneAccesoMR = tieneAccesoMR;
		}

		//getters
		public String getNombre() {
		    return nombre;
		}

		public String getZona() {
		    return zona;
		}

		public boolean isTieneAccesoMR() {
		    return tieneAccesoMR;
		}

		//setters
		public void setNombre(String nombre) {
		    this.nombre = nombre;
		}

		public void setZona(String zona) {
		    this.zona = zona;
		}

		public void setTieneAccesoMR(boolean tieneAccesoMR) {
		    this.tieneAccesoMR = tieneAccesoMR;
		}

	}
```

```Java
	public class ParqueAtracciones {

		private String nombre;
		private String direccion;
		/*
		TODO
		Tenemos que crear un atributo llamado parqueAtracciones que sea un List que tenemos que implementar mediante
		un ArrayList para guardar las atracciones del parque de atracciones.
		 */

		public ParqueAtracciones(String nombre, String direccion) {
		    this.nombre = nombre;
		    this.direccion = direccion;
		}

		public void anadirAtraccion(Atraccion atraccion){
		    /*
		    TODO
		    Tenemos que añadir al final del atributo creado la atracción pasada por parámetro.
		     */
		}

		public void eliminarAtraccion(Atraccion atraccion){
		    /*
		    TODO
		    Tenemos que eliminar la atracción pasada por parámetro si esta se encuentra en el parque de atracciones.
		     */
		}

		public void modificarNombreAtraccion(Atraccion atraccion, String nombre){
		    /*
		    TODO
		    Tenemos que modificar el nombre de la atracción pasada como primer parámetro por el nombre
		    pasado como segundo parámetro, si esta se encuentra en el parque de atracciones.
		     */
		}
	}
```

- [61\. Colecciones · List · Ejercicio 0003]() IOC
  - 

* * *

## Interfaces gráficas de usuario. Flujos y ficheros.

### 62. Interfaces gráficas de usuario. Swing.

- [62\. Swing · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/62.%20Swing%20%C2%B7%20Ejercicio%200001)
  - Completa el código de la clase FormAccesoMR según los comentarios "TODO".

```Java
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class FormAccesoMR implements ActionListener {

		private final int ANCHO = 400;
		private final int ALTURA = 200;

		private JFrame ventana;
		private JLabel pregunta;
		private JButton si;
		private JButton no;
		private boolean respuesta;

		public FormAccesoMR(){
		    /*
		    TODO
		    Tenemos que crear una ventana como la que se muestra en la imagen, teniendo en cuenta:
		    ·) El atributo etiqueta y los botones tienen que estar incrustados en la ventana directamente.
		    ·) La etiqueta tiene que mostrar la pregunta "La atracción tiene acceso de movilidad reducida?"
		    ·) El nombre del botón Sí tiene que ser "Sí" y el del botón No tiene que ser "No".
		    ·) El nombre de la ventana tiene que ser "Acceso de movilidad reducida" y sus medidas la de los atributos
		    constantes ANCHO y ALTO.
		    ·) Tenemos que respetar el formato de la ventana de la imagen.
		     */
		}

		public void anadirListenerBotones(){
		    /*
		    TODO
		    Tenemos que añadir el listener a los botones.
		     */
		}

		public void actionPerformed(ActionEvent evento) {
		    /*
		    TODO
		    Cuando apretamos el botón "Sí" asignaremos al atributo respuesta verdadero, en caso contrario, falso.
		     */
		}
	}
```

![62. Swing · Ejercicio 0001](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/62.%20Swing%20%C2%B7%20Ejercicio%200001.jpg)

- [62\. Swing · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/62.%20Swing%20%C2%B7%20Ejercicio%200002) IOC
  - Dada la clase Barco, completa el código de la clase FormMatricula según las indicaciones de los comentarios "TODO".

```Java
	public class Barco {

		private String matricula;
		private String nombre;
		private float eslora;
		private int cabinas;

		public Barco(String matricula, String nombre, float eslora, int cabinas) {
		    this.matricula=matricula;
		    this.nombre = nombre;
		    this.eslora = eslora;
		    this.cabinas = cabinas;
		}

		public String getMatricula() {
		    return matricula;
		}

		public void setMatricula(String matricula) {
		    this.matricula = matricula;
		}

		public String getNombre() {
		    return nombre;
		}

		public void setNombre(String nombre) {
		    this.nombre = nombre;
		}

		public float getEslora() {
		    return eslora;
		}

		public void setEslora(float eslora) {
		    this.eslora = eslora;
		}

		public int getCabinas() {
		    return cabinas;
		}

		public void setCabinas(int cabinas) {
		    this.cabinas = cabinas;
		}

		public String toString() {
		    return "Nom=" + nombre + "\nEslora=" + eslora + "\nCabines=" + cabinas;
		}

	}
```

```Java
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;

	public class FormMatricula implements ActionListener {

		private final int ANCHO = 250;
		private final int ALTO = 200;
		private JFrame ventana;
		private JLabel lMatricula;
		private JTextField tMatricula;
		private JButton matricular;
		public FormMatricula(){
		    /*
		    Tenemos que crear una ventana teniendo en cuenta:
		    ·) EL atributo etiqueta, campo de texto y botón tienen que estar incrustados en la ventana directamente.
		    ·) El nombre del botón tiene que ser "Matricular".
		    ·) El nombre de la ventana tiene que ser "Matriculación barco" y sus medidas la de los atributos
		    constantes ALTO y ANCHO.
		    ·) El campo de texto cuando abrimos la ventana mostrará "7º-PM-1-01-11" que será una matrícula de ejemplo.
		     */
		}

		public void añadirListenerBotones(){
		    /*
		    TODO
		    Tenemos que añadir el listener al botón.
		     */
		}

		public void actionPerformed(ActionEvent evento) {
		    Barco nuevoBarco = new Barco(null, "Barco", 13.5F, 4);
		    /*
		    TODO
		    Cuando apretemos el botón matricular del formulario, tenemos que asignar al atributo matrícula
		    del nuevo barco el valor introducido por el usuario mediante el formulario.
		     */
		}

	}
```

- [62\. Swing · Ejercicio 0003]()

![62. Swing · Ejercicio 0003](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/62.%20Swing%20%C2%B7%20Ejercicio%200003.jpg)

- [62\. Swing · Ejercicio 0004]()

- [62\. Swing · Ejercicio 0005]()

- [62\. Swing · Ejercicio 0006]()

- [62\. Swing · Ejercicio 0007]()

- [62\. Swing · Ejercicio 0008]()

- [62\. Swing · Ejercicio 0009]() 

- [62\. Swing · Ejercicio 0010]()

### 63. Flujos y ficheros.

- [63\.]()

* * *

## OOP. Introducción a la persistencia en BD

### 64\. Introducción al diagrama estático UML

- [64\.]() 

### 65\. Aplicaciones con BD no orientadas a objetos

- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0001]() IOC
  - Objetivos:
    - Establecer la conexión con la base de datos.
    - Mostrar los nombres de las atracciones de una zona determinada de un parque de atracciones con acceso para personas con movilidad reducida.
    - La tabla de atracciones de la base de datos ParqueAtracciones tiene la siguiente definición:
```SQL
	CREATE TABLE atracciones(
		nombre VARCHAR(20) NOT NULL,
		zona VARCHAR(20) NOT NULL,
		tieneAcceso SMALLINT NOT NULL,
		PRIMARY KEY (nombre)
		);
```
  - Para conseguir los objetivos pedidos, completar el código de la clase ParqueAtracciones según lo que indican los comentarios "TODO".
```Java

```
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0002]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0003]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0004]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0005]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0006]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0007]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0008]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0009]()
- [65\. Persistencia · Netbeans 17 + JDBC + Java 11JDK + Apache Derby 10.11.1.1 · Ejercicio 0010]()

### 66\. Aplicaciones con BD orientadas a objetos

- [66\.]() 

* * *

## Desarrollo del programario

### 67\. Desarrollo del programario

- [67\.]() 

### 68\. Instalación y uso de entornos de desarrollo

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200001) IOC
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo de un seguro.
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos cliente", inicialmente activada.
    - "Datos seguro", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Año nacimiento" : Se introducirá el año en que nació el futuro asegurado.
    - "Fumador/a habitual" : Se seleccionará sí o no.
    - "Profesión de riesgo" : Se seleccionará uno de los 3 valores posibles:
      - Riesgo bajo
      - Riesgo moderado
      - Riesgo alto
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto o combo que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - Se tiene que cumplir que el asegurado tenga como mínimo 18 años y como máximo 70.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos cliente") y se habilita la sección "Datos seguro": esta incluye:
      - Cuadro de texto "Cantidad a asegurar"
      - Combo "Tipo": Tendrá 3 posibles valores:
        - Muerte o invalidez
        - Muerte o invalidez por accidente
        - Muerte o invalidez o enfermedad grave
      - Button "Restablecer" 
      - Button "Calcular"
      - El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Tipos" esté informado con un valor válido (identificado en un párrafo anterior).
    - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
      - El campo "Tipos" gana focus.
      - El cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Se comprueba que la cantidad a asegurar tenga un mínimo de 50000 euros:</ins>
    - Si no se cumple esta condición o no se ha informado del dato, el campo "Cantidad a asegurar":
      - Gana focus.
      - Se muestra el error correspondiente en el recuadro de las alertas.
  - <ins>Si los datos son correctos,</ins> se calculan los datos de salida (el método para calcular las cuotas de seguro de vida son inventados):
    - Primero se tiene en cuenta la edad del asegurado:
      - Si tiene entre 18 y 40 años -> factor del 0,9
      - Si tiene entre 41 y 55 años -> factor del 1
      - Si tiene más de 55 años -> factor del 1,1
    - Seguidamente se tendrá en cuenta si el asegurado es fumador/a habitual:
      - Sí -> factor del 1,1
      - No -> factor del 0,9
    - En tercer lugar se valorará si tiene una profesión de riesgo o no:
      - Riesgo bajo -> factor del 0,95
      - Riesgo moderado -> factor del 1,05
      - Riesgo alto -> factor del 1,5
    - Por último, se tendrá en cuenta el tipo de seguro que se desea:
      - Muerte o invalidez -> factor del 1
      - Muerte o invalidez por accidente -> factor del 1,5
      - Muerte o invalidez o enfermedad grave -> factor del 1,1
    - Para calcular el valor de los pagos usaremos la fórmula:
      - anualidad = (Cantidad * Factor edad * Factor fumador * Factor profesión * Factor tipo seguro)/((70-Edad)*10)
      - semestralidad = (anualidad/2)*1,5
      - mensualidad = (anualidad/12)*1,10
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.


- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002) IOC
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de una mensualidad de una hipoteca.
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos Vivienda", inicialmente activada.
    - "Datos Hipoteca", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Precio vivienda" : el precio sin impuestos del piso / casa / etc.
    - "Ahorros aportados" : se escribirá la cantidad que ya tienen ahorrada los compradores.
    - "Tipo residencia" : se seleccionará uno de los 2 valores posibles : vivienda habitual o segunda residencia.
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - Los ahorros aportados tienen que ser del 20% del precio del habitáculo como mínimo.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos Vivienda") y se habilita la sección "Datos Hipoteca": esta incluye:
      - Combo "Descuento"
      - Los campos de texto "Edad Cliente"
      - "Años Hipoteca"
      - "Euríbor actual"
      - Botón "Restablecer"
      - Botón "CALCULAR"
      - El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
  - <ins>En el combo "Descuento" habrá 4 valores posibles:</ins>
    - funcionario
    - menor de 35 años
    - colectivos especiales
    - ninguno
    - Solo se podrá seleccionar un valor de "Descuento".
  - <ins>Seguidamente, el usuario selecciona el combo "Descuento", si puede recibir alguna, e introduce los datos requeridos al resto de campos:</ins>
    - Edad del cliente
    - De cuantos años quiere la hipoteca
    - A cuánto está el euríbor actualmente
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Descuento" esté informado con un valor válido (identificado en un párrafo anterior).
    - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
      - El campo "Descuento" gana focus.
      - El cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Se comprueba que los años de hipoteca:</ins>
    - Si es vivienda habitual el máximo será de 30 años.
    - Si es segunda residencia, el máximo serán 25 años.
    - La edad del cliente sumada a los años de hipoteca tiene que ser igual o inferior a 75 años.
    - En caso que no se hayan completado estas condiciones o no se haya informado del dato, el campo "Años hipoteca" gana focus y en el cuadro de texto largo del final se muestra el error correspondiente.
    - Se comprueba que el euríbor sea un valor válido.
  - <ins>Se calculan los datos de salida:</ins>
    - Funcionario: -1%
    - Menores de 35 años: -0,5%
    - Colectivos especiales: -0,75%
    - Ninguno: no se modifica el interés (-0%)
  - <ins>Seguidamente, se tendrán en cuenta los precios de las diferentes hipotecas (los descuentos se restarán a estos intereses):</ins>
    - Fijo sin bonificar -> interés del 2,95%
    - Fijo bonificada -> interés del 2,55%
    - Variable sin bonificar -> interés del 1,24% + euríbor
    - Variable bonificada -> interés del 0,6% + euríbor
  - <ins>Para calcular el valor de cada mensualidad, usaremos la fórmula:</ins>
    - a=(1-(1 + (interés/12))^(-años*12)) / (interés/12)
    - mensualidad = (precio vivienda - ahorros) / a
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002.jpg"/>
</p>

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200003) IOC
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de vídeo bajo demanda de una compañía.
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos Contrato", inicialmente activada.
    - "Bonificaciones", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Paquete contratado" : Se seleccionará uno de los 4 valores posibles:
      - Básico
      - Básico + Series y Pelis
      - Básico + Deportes
      - Completo
    - "Duración contrato" : Se introducirá el nombre de meses iniciales que durará el contrato (un tipo de permanencia).
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - El número de meses de contratación tiene que ser un número entero superior o igual a 1.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Datos Contrato") y se habilita "Productos adicionales contratados" y los buttons "Restablecer" y "CALCULAR". El resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
  - <ins>En el combo "Productos adicionales contratados" habrá 4 valores posibles:</ins>
    - Internet
    - Internet + Mobile
    - Mobile
    - Ninguno
  - <ins>Seguidamente, el usuario selecciona el combo "Productos adicionales contratados" otros productos que tenga contratados.
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Productos adicionales contratados" esté informado con un valor válido (identificado en un párrafo anterior).
    - En caso que no se haya seleccionado nada en el combo o el dato sea incorrecto:
      - Los cálculos no se realizarán.
      - El cuadro de texto que contiene el dato incorrecto gana focus.
      - El cuadro de texto largo del final muestra el error correspondiente.
  - <ins>Si los datos de entrada son correctos, se calcularán los datos de salida:</ins>
    - "Importe base":
      - Primeramente se calculará el precio base, dependiendo del paquete contratado y de la duración del contrato:
        - básico: 35
        - básico + series + pelis: 45
        - básico + deportes: 55
        - completo: 60
      - A continuación se aplicará el siguiente factor, en función de la duración del contrato:
        - entre 1 y 11 meses (incluidos): 1,1
        - entre 12 y 23 meses (incluidos): 1
        - 24 o más meses: 0,9
      - Por lo tanto, el "Importe base" será el valor según el paquete contratado multiplicado por el valor según la duración del contrato. Por ejemplo, un básico + deportes para 24 meses: 55*0,9=49,50 euros.
    - "Descuento":
      - Se calculará en función de los "Productos adicionales contratados":
        - Si tiene contratado internet -> 5%
        - Si tiene contratado internet + mobile -> 10%
        - Si tiene contratado mobile -> 5%
        - Si no tiene nada contratado -> 0%
      - El descuento será el porcentage correspondiente a los "productos adicionales contratados" aplicado al "importe base". Por ejemplo, el caso anterior supongamos que tenemos contratado también internet i el mobile: el descuento será 49,50 * 5% = 2,48euros (los dos euros se redondean a 2 decimales).
    - "Importe total":
      - Corresponderá al valor del precio base menos el descuento.
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200003.jpg"/>
</p>

- [68\. Interfaz gráfica · WindowBuilder Pro · Componentes SWT · Eclipse · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200004) IOC
  - En Eclipse, crea una aplicación de escritorio independiente en Java con la interfaz gráfica que simule el cálculo del precio de un seguro de coche para un concesionario (solo seguros a todo riesgo).
  - <ins>La pantalla está dividida en 3 bloques o partes:</ins>
    - Superior "Datos Vehículo", inicialmente activada.
    - "Bonificaciones", inicialmente desactivada.
    - Inferior "Alertas", que contendrá un campo de tipo texto, que servirá para notificar por pantalla los errores que se produzcan en las validaciones de los campos de entrada. El contenido de este campo tiene que irse actualizando o borrando dependiendo de si queremos o no informar de algún error en aquel momento.
  - <ins>Se introducirán los datos:</ins>
    - "Caballos" : Se introducirá el número de caballos que tiene el coche. 
    - "Combustible" : Se seleccionará uno de los 4 valores posibles:
      - Gasolina
      - Diesel
      - Híbrido
      - Eléctrico
  - <ins>Cuando se pulsa el botón "Aceptar":</ins>
    - <ins>Si hay algún error en los datos:</ins>
      - Se selecciona todo el cuadro de texto que contiene este dato.
      - Se hace que gane focus.
      - Se muestra el error en el cuadro de texto largo del final.
      - No se realiza ninguna acción más.
      - Todos los datos son obligatorios.
      - El número de caballos tiene que ser superior a 60.
    - <ins>En caso contrario, cuando la validación sea correcta</ins>, se deshabilitan todos los campos y botones de la parte superior (sección / bloque "Parámetros") y se habilitan las cajas "Antigüedad carnet" y "Último comunicado de accidente", así como los buttons "Restablecer" y "Calcular". Eñ resto de cajas de este bloque no son editables, servirán para mostrar los resultados de los cálculos.
      - Después, el usuario introduce en la caja "Antigüedad carnet" el bloque correspondiente a los años que hace que tiene el carnet de conducir.
      - Luego, el usuario introduce en la caja "Último comunicado de accidente" los años que lleva sin presentar ningún comunicado de accidente:
        - Es necesario que sea un número entero igual o superior a 0.
  - <ins>Cuando se pulsa el botón "CALCULAR":</ins>
    - Se comprueba que el valor del campo "Antigüidad del carnet" y "Último comunicado de accidente" estén informados con un valores válidos (identificado en los dos párrafos anteriores):
      - En caso que el formato o los valores de los números introducidos en las cajas sean incorrectos:
        - Los cálculos no se realizarán.
        - El cuadro de texto que contiene el dato incorrecto gana focus.
        - En el cuadro final de texto largo se mostrará también el error correspondiente.
  - <ins>Si los datos introducidos son correctos, se calculan los datos de salida:</ins>
    - "Precio base":
      - Primeramente se calculará el precio base, dependiendo de los caballos del coche y el tipo de combustible según los siguientes valores:
        - menos de 90 caballos: 450
        - entre 90 y 99 caballos: 510
        - entre 100 y 109 caballos: 540
        - entre 110 y 119 caballos: 560
        - entre 120 y 135 caballos: 580
        - más de 135 caballos: 600
        - Gasolina: 1
        - Diesel: 1,2
        - Híbrido: 0,9
        - Eléctrico: 0,8
      - El importe resultante será el valor según los caballos multiplicado por el valor según el combustible. Por ejemplo, un coche de 110 caballos y diesel: 560*1,2=672.
    - "Bonificaciones":
      - Se calculará en función a los "Años de carnet" y a los "Años desde el último comunicado de accidente", según los siguientes valores:
        - Si el carnet tiene hasta 1 año de antigüedad: 1,2
        - Si tiene entre 2 y 9 años: 1
        - Si tiene entre 10 y 19 años: 0,9
        - Si tiene más de 20 años de antigüedad: 0,8
        - Si hace menos de un año del último comunicado -> +3,5%
        - Si hace entre 1 y 2 años: 0%
        - Si hace entre 3 y 4 años: -5%
        - Si hace 5 o más años: -15,5%
      - Al precio base se le aplicará la bonificación de los años de carnet y, sobre el valor obtenido, la de los años desde el último comunicado de accidente y se mostrará el importe resultante. Por ejemplo, continuando con el caso anterior, con 19 años de antigüedad de carnet y 5 años sin ningún accidente (la precisión es de 2 decimales porque se trabaja con euros):
        - 672*0,9 = 604,80
        - 604,80 - 15,5% de 604,80 = 511,06
        - La bonificación sería 672 - 511,06 = 160,94euros
    - "Precio total":
      - Corresponderá al valor del precio base menos las bonificaciones.
      - Lo calcularemos de la manera siguiente:
        - Para el importe anual, usaremos el precio que hemos calculado (precio base - bonificaciones) y le restaremos un 2%.
        - Para el importe trimestral, usaremos el precio que hemos calculado (precio base - bonificaciones) y lo dividiremos entre 4.
        - Para el importe mensual, usaremos el precio que hemos calculado (precio base - bonificaciones) y lo dividiremos entre 12 y le sumaremos el 2%.
  - <ins>Si el usuario pulsa el botón "Restablecer", se podrá:</ins>
    - Volver a iniciar la configuración de los parámetros del cálculo.
    - Habilitar campos y botones de la parte superior posibilitando la opción de reintroducir valores en la parte superior.
    - Se inhabilitará y se borrará el contenido de los campos y botones de la parte de en medio.

<p align="center">
  <img src="https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/Im%C3%A1genes/68.%20Interfaz%20gr%C3%A1fica%20%C2%B7%20WindowBuilder%20Pro%20%C2%B7%20Componentes%20SWT%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200004.jpg"/>
</p>

- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0001
  - Utiliza el entorno de desarrollo Eclipse para trabajar con una aplicación cliente-servidor, haciendo uso de un servlet.
  - Apache Tomcat es un servidor web que admite programario Java, por ejemplo, admite la ejecución de servlets.
  - Usaremos el servidor de aplicaciones Apache Tomcat para realizar una aplicación servlet que:
    - Llame a un servlet a través de un formulario HTML, que permite introducir el menú a elegir de una cena de cumpleaños y los comensales que asistirán.
    - El servlet captura los datos introducidor en el formulario, que viajan por el servidor.
    - El mismo servlet se encarga de devolver una respuesta HTML, que consiste en una tabla con los datos introducidos por el usuario.
    - Esto permite al usuario validar que los datos que ha introducido son correctos, antes de pasar a otras gestiones, cosa que confirma la comunicación entre el cliente y el servidor.
    - A tener en cuenta:
      - 1. Tiene que estar instalado y configurado el servidor Tomcat: Primero descargamos el tomcat:
        - Ir a la página tomcat.apache.org y descargar la última versión de Tomcat (tar.gz). Descomprimir el archivo descargado.
      - 2. Configurar Eclipse para que trabaje con la instalación de Tomcat: Abrimos Eclipse:
        - Vamos a la pestaña de Servers.
        - Clicamos en: "No servers are available. Click this link to create a new server..."
        - Select the server type: Buscamos el servidor Tomcat que nos hemos descargado anteriormente y lo seleccionamos.
      	- Server's host name: localhost
      	- Server name: El nombre del servidor que nos hemos descargado, al seleccionarlo anteriormente se rellena automáticamente.
      	- Clicamos en: Next.
      	- Name: El nombre del servidor que nos hemos descargado. Por ejemplo "Apache Tomcat v10.1"
      	- Tomcat installation directory: En Browse buscamos donde tenemos el servidor que nos hemos descargado anteriormente.
      	- Finish.
      - 3. Para poner en marcha el servidor, botón derecho encima del servidor en la pestaña Servers -> Start.
      - 4. Crear una aplicación que trabaje con el servlet:
        - File -> New -> Dynamic Web Project
        - Project name: Nombre del proyecto.
        - Target runtime: Debería salir el servidor que hemos instalado anteriormente.
        - Dynamic web module version: Elegimos la versión 5.0.
        - Next.
        - Next.
        - MUY IMPORTANTE: La opción "Generate web.xml deployment descriptor" tiene que estar elegida.
        - Al finalizar, se habrá creado el nuevo proyecto para poder usar el servlet.
      - 5. Dentro del directorio src -> main -> webapp -> WEB-INF: Debería haberse creado el archivo web.xml.
      - 6. Ahora crearemos la página HTML:
        - Botón derecho encima del proyecto -> New -> New HTML File: Le damos el nombre de FormularioEntrada.html
      - 7. Creación del servlet:
        - Botón derecho encima del proyecto -> New -> Servlet
        - Class name: Necesitamos poner el nombre de la clase que implementa el servlet.
        - Java package: Necesitamos poner el nombre del paquete que contendrá la clase que implementa el servlet.
      - 8. Edición del fichero XML.
    - Datos importantes:
      - servlet-class: indica el nombre del Servlet (incluyendo el paquete donde se encuentra)
      - url-pattern: dirección web sobre la cual se mapeará. Tiene que coincidir con la indicada en el formulario .html (línea <form method="post" action= "./ServletFormulariEntrada">).
      - welcome-file-list: Lista de los "ficheros de bienvenida" (welcome-file). Estos ficheros son los que se ejecutan cuando solo se pone el nombre del sitio web, pero no el del fichero que queremos ejecutar. 
      - Mirar las bibliotecas (Libraries):
        - Botón derecho encima del proyecto -> Properties -> Java Build Path -> Libraries.
        - Tienen que ser:
          - JRE System Library[JavaSE-17]
          - EAR Libraries
          - Server Runtime[Apache Tomcat v10.1](o de la versión de Tomcat)
          - Web App Libraries
    - Ejecución del servlet:
      - Botón derecho encima del archivo html -> Run As -> 1 Run on Server -> Seleccionar el servidor 
        
- [68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/68.%20Servlet%20Apache%20Tomcat%20%C2%B7%20Eclipse%20%C2%B7%20Ejercicio%200002) IOC
  - Utiliza el entorno de desarrollo Eclipse para trabajar con una aplicación cliente-servidor, haciendo uso de un servlet.
  - Usaremos el servidor de aplicaciones Apache Tomcat para realizar una aplicación servlet que:
    - Llame a un servlet a través de un formulario HTML, que permite introducir los datos personales de una persona.
    - El servlet captura los datos introducidor en el formulario, que viajan por el servidor.
    - El mismo servlet se encarga de devolver una respuesta HTML, que consiste en una tabla con los datos introducidos por el usuario.
    - Esto permite al usuario validar que los datos que ha introducido son correctos, antes de pasar a otras gestiones, cosa que confirma la comunicación entre el cliente y el servidor.

- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0003
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0004
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0005
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0006
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0007
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0008
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0009
- 68\. Servlet Apache Tomcat · Eclipse · Ejercicio 0010

* * *

## Optimización del programario

### 69\. Diseño y realización de pruebas de programario

- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200001) IOC
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **precioConDescuento**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0001;

	public class Ej_69_Pruebas_Programario_Ejercicio0001 {
		
		private static final int DESCUENTO_5 = 5;
		private static final int DESCUENTO_10 = 10;
		
		public static float precioConDescuento(float precio) throws PrecioException {
	  		float resultado;

	  		if(precio <0) throw new PrecioException();

	  		resultado = calcularDescuento(precio, DESCUENTO_10); // descontamos el 10% al precio
	  		
	  		if(precio >= 5000 && precio <= 10000){ // entre 500 y 1000, los dos incluídos
	  		
	  			resultado = calcularDescuento(resultado, DESCUENTO_5);
	  		
	  			System.out.println("resultado: " + resultado);
	  		} else if (precio > 10000) { // por encima de 10000
	  			
	  			resultado = calcularDescuento(resultado, DESCUENTO_10);
	  			System.out.println("resultado: " + resultado);

	  		}
	  		return resultado;
	  	}

	private static float calcularDescuento(float precio, float descuento) {
		float resultado;
		resultado = precio - precio * descuento / 100;
		return resultado;
	}
}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0001;

	public class PrecioException extends Exception {
	  	public PrecioException() {
	  	super("Preu negatiu");
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200002) IOC
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **operacionsEsfera**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0002;
	
	public class Ej_69_Pruebas_Programario_Ejercicio0002 {
	
		public static double operacionsEsfera (double radi, String operacio){
			double resultat=0;
			
			if(radi <0) {
				resultat = -1;
			} else if(operacio.equals("perimetre")){
				resultat= 2 * Math.PI * radi;
			} else if(operacio.equals("superficie")){
				resultat= 4 * Math.PI * Math.pow(radi, 2);
			} else if (operacio.equals("volum")){
				resultat= 4.0 / 3 * Math.PI * Math.pow(radi, 3);
			} 
			return resultat;
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0003]() IOC
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **saluda**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0003;

	public class Ej_69_Pruebas_Programario_Ejercicio0003 {
	
		public static String saluda(int hora) throws SaludaException { //el método saluda devuelve una salutación en función de la hora del día
			if(hora < 0 || hora > 23) throw new SaludaException(); //si el método recibe un valor incorrecto, se lanza la excepción definida en la clase SaludaException
			else if (hora < 6 || hora >= 20) return "Bona nit";
			else if (hora < 14) return "Bon dia";
			else return "Bona tarda";
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0003;
	public class SaludaException extends Exception {
		public SaludaException() {
			super("Hora inexistent");
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0004]() IOC
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **determinaDuresaMohs**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0004;

	public class Ej_69_Pruebas_Programario_Ejercicio0004 {

		public static String determinaDuresaMohs(int duresa) throws DuresaIncorrecteException{ //devuelve el equivalente en texto (mineral) al valor de la dureza introducida
			if(duresa>0 && duresa<=10) {
				if (duresa==10) return "Diamant";
				else if (duresa>7) return "Topazi";
				else if (duresa>4) return "Apatita";
				else if (duresa>2) return "Calcita";
				else return "Talc";
			}
			else throw new DuresaIncorrecteException("Valor duresa " + duresa + " incorrecte."); 
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0004;

	@SuppressWarnings("serial")
	public class DuresaIncorrecteException extends Exception {
		public DuresaIncorrecteException(String missatge) {
			super(missatge);
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0005]() IOC
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **determinaPermisos**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0005;
	
	public class Ej_69_Pruebas_Programario_Ejercicio0005 {
	
		public static String determinaPermisos(int permis) throws PermisIncorrecteException{
			if(permis>=0 && permis<=9) {
				if (permis==9) return "Total";
				else if (permis>6) return "Alt";
				else if (permis>3) return "Moderat";
				else if (permis>0) return "Baix";
				else return "Sense permisos";
			} else throw new PermisIncorrecteException("Permis " + permis + " incorrecte.");
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0005;
		@SuppressWarnings("serial")
		public class PermisIncorrecteException extends Exception {
		
		public PermisIncorrecteException(String missatge) {
			super(missatge);
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0006](https://github.com/sufigueroa87/Ejercicios/blob/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200006/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200006.pdf) IOC
  - Realiza el diseño de los casos de prueba para comprovar el funcionamiento correcto del método **determinaCategoriaSaffirSimpson**, teniendo en cuenta únicamente el valor del parámetro de entrada del método.
  - Hay que seguir los pasos:
    - 1. Identificar las condiciones, restricciones o contenidos de las entradas y salidas.
    - 2. Identificar, a partir de las condiciones, las clases de equivalencia de las entradas y salidas.
    - 3. Diseñar los casos de prueba a partir de las clases de equivalencia seleccionadas anteriormente. Hay que tener en cuenta:
      - Como mínimo tiene que haber un representante de cada clase de equivalencia.
      - Se tienen que cubrir los valores límite, valor intermedio (si existe; en el caso de intervalos sin línite trivial puede elegirse cualquier valor; si el resultado tiene que ser un entero y el valor intermedio sale decimales, podemos redondear) i los errores típicos.
      - Se tiene que recorrer almenos 1 vez cada camino independiente. Por tanto, necesitaremos:
        - Realizar el diagrama de flujo.
        - Calcular la complejidad ciclomática.
        - Escribir los caminos independientes.
        - Asegurarnos que los casos de prueba cubren todos los caminos; si detectamos que algún caso se queda sin cubrir, necesitaremos añadir más casos.
```Java
	package ej_69_Pruebas_Programario_Ejercicio0006;
	public class Ej_69_Pruebas_Programario_Ejercicio0006 {
		public static String determinaCategoriaSaffirSimpson(int velocitat) throws VelocitatIncorrectaException{
			if(velocitat>118 && velocitat<=400) {
				if (velocitat>250) return "Cat. 5";
				else if (velocitat>209) return "Cat. 4";
				else if (velocitat>177) return "Cat. 3";
				else if (velocitat>153) return "Cat. 2";
				else return "Cat. 1";
			} else throw new VelocitatIncorrectaException("Velocitat del vent " + velocitat + " incorrecta.");
		}
	}
```
```Java
	package ej_69_Pruebas_Programario_Ejercicio0006;
		@SuppressWarnings("serial")
		public class VelocitatIncorrectaException extends Exception {
			public VelocitatIncorrectaException(String missatge) {
			super(missatge);
		}
	}
```
- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0007](https://github.com/sufigueroa87/Ejercicios/tree/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200007)
  - A partir del siguiente diagrama de flujo, calcula la complejidad ciclomática y define el conjunto básico de caminos.
![69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0007](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200007/Ej_69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200007.png)

- [69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0008](https://github.com/sufigueroa87/Ejercicios/tree/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200008)
  - A partir del siguiente diagrama de flujo, calcula la complejidad ciclomática y define el conjunto básico de caminos.  
![69\. Pruebas de programario · Diseño de las clases de equivalencia · Ejercicio 0008](https://raw.githubusercontent.com/sufigueroa87/Ejercicios/main/69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200008/Ej_69.%20Pruebas%20de%20programario%20%C2%B7%20Dise%C3%B1o%20de%20las%20clases%20de%20equivalencia%20%C2%B7%20Ejercicio%200008.png)

- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0001
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0002
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0003
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0004
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0005
- 69\. Pruebas de programario · JUnit5 · Eclipse · Ejercicio 0006

### 70\. Herramientas para el control y documentación del programario / Control de versiones

- [70\. Refacción · Ejercicio 0001](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200001)
  - Reescribe la clase EAC3 para mejorar su método preuAmbDescompte, aplicando técnicas de refacción.
  - El método recibe un precio y devuelve el resultado de aplicarle distintos descuentos.
  - Concretamente:
    - a) Si el precio es negativo, lanza una excepción del tipo PreuException y acaba la ejecución.
    - b) Siempre aplica un 10% de descuento.
    - c) Si el precio está entre 5000 y 10000, los dos incluídos, aplica un 5% al resultado de haber aplicado el descuento indicado en el punto b.
    - d) Si el precio es superior a 10000, aplica un 10% al resultado de habet aplicado el descuento indicado en el punto b.
  ```Java
  	package ej_70_Refaccion_Ejercicio0001;
	
	public class Ej_70_Refaccion_Ejercicio0001 {
		public static float preuAmbDescompte(float preu) throws PreuException{
			float resultat;

			if(preu <0) throw new PreuException();
			
			resultat = preu - preu * 10 / 100; // descomptem el 10% al preu
			
			if(preu >= 5000 && preu <= 10000){ // entre 500 i 1000, tots dos inclosos
			
				resultat = preu - preu * 10 / 100; // descomptem el 10% al preu
				resultat = resultat - resultat * 5 / 100; // descomptem el 5% al resultat
			
			} else if (preu > 10000) { // per sobre de 10000
				resultat = preu - preu * 10 / 100; // descomptem el 10% al preu
				resultat = resultat - resultat * 10 / 100; // descomptem el 10% al descompte
			}
			return resultat;
		}
	}
  ```
  ```Java
	package refaccion_0001;

	public class PreuException extends Exception{
		public PreuException() {
		super("Preu negatiu");
		}
	}
  ```
- [70\. Refacción · Ejercicio 0002](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200002)
  - Reescribe el método souAmbEstadis para mejorarlo aplicando técnicas de refacción.
  - El método recibe una antigüedad y devuelve el resultado de aplicarle distintos aumentos de sueldo. Concretamente:
    - a) Si la antigüedad es inferior a 9 años, devuelve -1 y se acaba la ejecución.
    - b) Siempre aplica un 1% de aumento de sueldo.
    - c) Si la antigüedad es entre 15 y 20 años, se aplica un nuevo aumento de sueldo del 2% al resultado de haber aplicado el aumento indicado en el punto b.
    - d) Si la antigüedad es entre 21 y 26 años, se aplica un nuevo aumento de sueldo del 5% al resultado de haber aplicado el aumento indicado en el punto b.
    - e) Si la antigüedad es superior a 26 años, aplica un 8% al resultado de haber aplicado el aumento indicado en el punto b.
```Java
	package ej_70_Refaccion_Ejercicio0002;
	
	public class Ej_70_Refaccion_Ejercicio0002 {
		public static double souAmbEstadis (int antiguitat){
			double sou=0;
			double souBase=1400;

		if (antiguitat<9) {
			return -1;
		} if (antiguitat >=9 && antiguitat <=14) {
			sou=souBase+souBase*1/100;
		} if (antiguitat >=15 && antiguitat <=20) {
			sou=souBase+souBase*1/100;
			sou=sou+sou*2/100;
		} if (antiguitat >=21 && antiguitat <=26) {
			sou=souBase+souBase*1/100;
			sou=sou+sou*5/100;
		} else if (antiguitat>26) {
			sou=souBase+souBase*1/100;
			sou=sou+sou*8/100;
		}
			return sou;
		}
	}
```
- [70\. Refacción · Ejercicio 0003](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200003)
  - Reescribe la clase siguiente para mejorar el método resumIva de la clase ExRefaccio aplicando las refacciones que consideres.
  - El método calcula el IVA soportad, el IVA repercutido y el resultado de IVA a partir de los importes de compras y ventas.
```Java
	package ej_70_Refaccion_Ejercicio0003;
	public class Ej_70_Refaccion_Ejercicio0003{
		public static void resumIva (float importCompres, float importVendes) {
			System.out.printf("IVA suportat: %.2f\n", importCompres*0.21f);
			System.out.printf("IVA repercutit: %.2f\n", importVendes*0.21f);
			System.out.printf("Resultat IVA: %.2f\n",
			(importVendes* 0.21f - importCompres*0.21f));
		}
	}
```
- [70\. Refacción · Ejercicio 0004](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200004)
  - Reescribe la clase siguiente para mejorar el método calculaImportFactura de la clase Lloguer.
  - Este método se encarga de calcular el importe total de la factura con IVA incluido.
  - También imprime información relativa al número de productos y servicios.
```Java
	package ej_70_Refaccion_Ejercicio0004;

	public class Ej_70_Refaccion_Ejercicio0004 {
		// Área per definir variables globals
		
		/* 
		
		 * Aquest mètode s'encarrega de calcular l'import total de la factura amb IVA inclòs
		 * També imprimeix informació relativa al nombre de productes i serveis
		 * @param nroMinutsTarifa1
		 * @param nroMinutsTarifa2
		 * @param nroMinutsTarifa3
		 * @return importTotal
		 */
		public static Double calculaImportFactura(int nroMinutsTarifa1, int nroMinutsTarifa2, 
	int nroMinutsTarifa3) {
			Double importTarifa1 = 0.00;
			Double importTarifa2 = 0.00;
			Double importTarifa3 = 0.00;
			Double importTotal = 0.00;
			Double importTotalIVA = 0.00;
			
			importTarifa1 = nroMinutsTarifa1 * 0.03;
			System.out.println("El númreo de minuts de tarifa 1 és :"+nroMinutsTarifa1);
			System.out.println("El preu total per a tarifa 1 (sense IVA) és :"+importTarifa1+"€");
			
			importTarifa2 = nroMinutsTarifa2 * 0.06;
			System.out.println("El númreo de minuts de tarifa 2 és :"+nroMinutsTarifa2);
			System.out.println("El preu total per a tarifa 2 (sense IVA) és :"+importTarifa2+"€");
			
			importTarifa3 = nroMinutsTarifa3 * 0.10;
			System.out.println("El númreo de minuts de tarifa 3 és :"+nroMinutsTarifa3);
			System.out.println("El preu total per a tarifa 3 (sense IVA) és :"+importTarifa3+"€");
			
			importTotal = nroMinutsTarifa1 * 0.03 + nroMinutsTarifa1 * 0.06 + nroMinutsTarifa1 * 0.10;
			System.out.println("El preu total (sense IVA) és :"+importTotal+"€");
			importTotalIVA = importTotal + importTotal/100*21;
			System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
			return importTotalIVA;
		}
		
		// ...... altres mètodes de la classe
		
	} // fi de la classe
```
- [70\. Refacción · Ejercicio 0005](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200005)
  - Reescribe la clase siguiente para mejorar el método calculaImportLloguer de la clase Lloguer.
  - Este método se encarga de calcular el importe total del alquiler con IVA incluido.
  - También imprime información relativa a la cantidad de productos de cada tipo y el subtotal individual sin IVA.
```Java
	package ej_70_Refaccion_Ejercicio0005;
	public class Ej_70_Refaccion_Ejercicio0005 {
		public static Double calculaImportLloguer(int nroProductesTipus1, int
		nroProductesTipus2, int nroProductesTipus3) {
			Double importTipus1 = 0.00;
			Double importTipus2 = 0.00;
			Double importTipus3 = 0.00;
			Double importTotal = 0.00;
			importTipus1 = nroProductesTipus1 * 2.00;
			System.out.println ("El númreo de productes de tipus 1 és :"+nroProductesTipus1);
			System.out.println ("El preu total per a productes de tipus 1 (sense IVA) és :"+importTipus1+"€");
			importTipus1 = importTipus1 + importTipus1/100*21;
			importTipus2 = nroProductesTipus2 * 2.50;
			System.out.println ("El númreo de productes de tipus 2 és :"+nroProductesTipus2);
			System.out.println ("El preu total per a productes de tipus 2 (sense IVA) és :"+importTipus2+"€");
			importTipus2 = importTipus2 + importTipus2/100*21;
			importTipus3 = nroProductesTipus3 * 3.00;
			System.out.println ("El númreo de productes de tipus 3 és :"+nroProductesTipus3);
			System.out.println ("El preu total per a productes de tipus 3 (sense IVA) és :"+importTipus3+"€");
			importTipus3 = importTipus3 + importTipus3/100*21;
			importTotal = importTipus1+importTipus2+importTipus3;
			return importTotal;
		}
	// ...... altres mètodes de la classe
	} // fi de la classe
```
- [70\. Refacción · Ejercicio 0006](https://github.com/sufigueroa87/Ejercicios/tree/main/70.%20Refacci%C3%B3n%20%C2%B7%20Ejercicio%200006)
  - Reescribe el método calculaImportFactura para mejorarlo usando técnicas de refacción.
```Java
	package ej_70_Refaccion_Ejercicio0006;

	public class Ej_70_Refaccion_Ejercicio0006 {
		
		public static Double calculaImportFactura(int article1, int article2, int article3) {
			Double importTarifa1 = 0.00;
			Double importTarifa2 = 0.00;
			Double importTarifa3 = 0.00;
			Double importTotal = 0.00;
			Double importTotalIVA = 0.00;
			
			importTarifa1 = article1 * 3.50;
			importTarifa1Iva = importTarifa1 * 1,21;
			System.out.println("S'han comprat "+article1+" unitats de l'article1");
			System.out.println("El preu total de l'article1 (sense IVA) és :"+importTarifa1+"€");
			System.out.println("El preu total de l'article1 (amb IVA) és :"+importTarifa1Iva+"€");
			
			importTarifa2 = article2 * 7.75;
			importTarifa2Iva = importTarifa2 * 1,21;
			System.out.println("S'han comprat "+article2+" unitats de l'article2");
			System.out.println("El preu total de l'article2 (sense IVA) és :"+importTarifa2+"€");
			System.out.println("El preu total de l'article2 (amb IVA) és :"+importTarifa2Iva+"€");
			
			importTarifa3 = article3 * 10.25;
			importTarifa3Iva = importTarifa3 * 1,21;
			System.out.println("S'han comprat "+article3+" unitats de l'article3");
			System.out.println("El preu total de l'article3 (sense IVA) és :"+importTarifa3+"€");
			System.out.println("El preu total de l'article3 (amb IVA) és :"+importTarifa3Iva+"€");
			
			importTotal = article1 * 3.50 + article2 * 7.75 + article3 * 10.25;
			System.out.println("El preu total (sense IVA) és :"+importTotal+"€");
			importTotalIVA = importTotal + importTotal/100*21;
			System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
			return importTotalIVA;
		}
	} 
```
- [70\. Refacción · Ejercicio 0007]()
  - Reescribe el método Salario para mejorarlo usando técnicas de refacción.
  - El método recibe como parámetro la antigüedad de un trabajador y realiza los cálculos que se indican en el mismo método, para saber su salario con bonificaciones.
  
```Java
	package ej_70_Refaccion_Ejercicio0007;

	public class Ej_70_Refaccion_Ejercicio0007 {
		
		public static float Salario (int antiguedad) {
			
			float salario = 0;
			
			if (antiguedad < 10) {
				salario = 1200 + 1200*1/100;
			} 
			else if (antiguedad >= 10 && antiguedad < 20) {
				salario = 1200 + 1200*1/100;
				salario = salario + salario*3/100;
			}
			else {
				salario = 1200 + 1200*1/100;
				salario = salario + salario*5/100;
			}
			
			return salario;
		}
	} 
```
- [70\. Refacción · Ejercicio 0008]()
  - Reescribe el método longitudCircumferencia(double radi1, double radi2) para mejorarlo usando técnicas de refacción.
  
```Java
	package ej_70_Refaccion_Ejercicio0008;

	public class Ej_70_Refaccion_Ejercicio0008 {
		
		public static void longitudCircumferencia(double radio1, double radio2) {
		
		System.out.println("La longitud de la primera circumferencia es " + 2*Math.PI*radio1);
		System.out.println("La longitud de la segunda circumferencia es " + 2*Math.PI*radio2);
		System.out.println("La diferencia entre las longitudes es " + (2*Math.PI*radio1-2*Math.PI*radio2));	
			
	}
```

- 70\. Git · Ejercicio 0001
  - 1. Clona el repositorio público https://github.com/ioc-dam-m05/EAC3.git.
  - 2. Sitúate en la carpeta EAC3 que se acaba de crear.
  - 3. Muestra todas las ramas por pantalla. Utiliza la opción -a del orden para que aparezcan todas las ramas remotas.
  - 4. Sitúate en la rama branca1.
  - 5. Sitúate en la rama branca2.
  - 6. Muestra todas las ramas.
  - 7. Muestra las diferencias entre la rama actual (branca2) y la branca1.
  - 8. Fusiona la rama actual (branca2) y la branca1.
  - 9. Qué ha sucedido?
  - 10. Engancha el contenido de la clase vehicles.Avio de la rama master.
- 70\. Git · Ejercicio 0002
  - 1. Inicializa un nuevo proyecto con Git llamado EAC3.
  - 2. Copia la clase Gos.java:
  ```Java
	package Mamifers;
	public class Gos {
		String raca;
		String origen;
	
		public void setRaca (String raca){
		this.raca=raca;
		}
	
		public String getRaca(){
			return raca;
		}
		
		public void setOrigen (String origen){
			this.origen=origen;
		}
		
		public String getOrigen(){
			return origen;
		}
	}
  ```
  - 3. Añade el fichero al control de versiones.
  - 4. Ejecuta la orden necesaria para que Git muestre los cambios pendientes de confirmar (juntamente con otra información).
  - 5. Confirma los cambios poniento "versión inicial - v1" como mensaje.
  - 6. Crea una nueva rama llamada branca1.
  - 7. Muestra el listado de ramas que hay y di en cuál estás situada.
  - 8. Sitúate en la nueva rama que has creado.
  - 9. Edita o crea el archivo Gos.java para que quede así:
```Java
	package Mamifers;
	public class Gos {
		String raca;
		int camadaMitjana;
		
		public void setRaca (String raca){
			this.raca=raca;
		}
		
		public String getRaca(){
			return raca;
		}
		
		public void setCamadaMitjana (String CamadaMitjana){
			this.camadaMitjana=camadaMitjana;
		}
		
		public int getCamadaMitjana(){
			return camadaMitjana;
		}
	}
```
  - 10. Sube los cambios al repositorio.
  - 11. Crea una nueva rama llamada branca2.
  - 12. Sitúate en la nueva rama que has creado.
  - 13. Edita o crea el archivo Gos.java para que quede así:
```Java
	package Mamifers;
	public class Gos {
		String raca;
		float pes;
		
		public void setRaca (String raca){
			this.raca=raca;
		}
		
		public String getRaca(){
			return raca;
		}
		
		public void setPes (String pes){
			this.pes=pes;
		}
		
		public int getPes(){
			return pes;
		}
	}
```
  - 14. Sube los cambios al repositorio.
  - 15. Muestra las diferencias entre la branca1 y la branca2.
  - 16. Fusiona la branca1 y la branca2.
- 70\. Git · Ejercicio 0003
  - 1. En tu carpeta de trabajo, crea la carpeta src y dentro una subcarpeta llamada aeronaus. En esta subcarpeta, crea el fichero .java con el código siguiente:
```Java
	package aeronaus;

	public class Aeronau {
		private String nom;
		private int costHoraVol;

		public String getNom() {
			return nom;
		}
	
		public void setNom(String nom) {
			this.nom= nom;
		}
		
		public int getCostHoraVol() {
			return costHoraVol;
		}
	
		public void setCostHoraVol(int costHoraVol) {
			this.costHoraVol= costHoraVol;
		}
	}
```
  - 2. Haz que Git considere la carpeta src como repositorio local. Sitúate y ejecuta el orden git init.
  - 3. Ejecuta el orden ls -a <fichero> si trabajas con GNU linux o ls - Hidden <fichero> con PowerShell si trabajas con Windows. Copia la ejecución de esta orden y de la anterior con el resultado.
  - 4. Configura tu nombre y correo en Git con las órdenes:
    - git config --global user.name "nombre"
    - git config --global user.email "correo"
  - 5. Añade todos los ficheros que cuelgan de la carpeta src al control de versiones.
  - 6. Ejecuta la orden necesaria para que Git muestre los cambios pendientes de confirmar (juntamente con otra información).
  - 7. Confirma los cambios poniendo "version inicial" como mensaje.
  - 8. Crea en la carpeta aeronaus el fichero AvioPassatgers.java con el siguiente contenido:
```Java
	package aeronaus;
		public class AvioPassatgers extends Aeronau {
			private int passatgers;
			public int getPassatgers() { return passatgers; }
		public void setPassatgers(int passatgers) { 
			this.passatgers= passatgers; 
		}
	}
```
  - 9. Modifica el fichero Aeronau.java añadiendo la palabra reservada final delante del único parámetro del método setNom.
```Java
	public void setNom(final String nom) {
		this.nom= nom;
} 
```
  - 9. Ejecuta la orden necesaria para que Git muestre los cambios pendientes de confirmar.
  - 10. Añade nuevamente todos los ficheros al control de versiones (con la orden git add).
  - 11. Confirma los cambios poniendo "segunda versión" como mensaje.
  - 12. Crea una rama llamada rama1.
  - 13. Muestra el listado de ramas con la comanda git branch.
  - 14. Haz que la rama activa sea la rama que acabas de crear, la rama1.
  - 15. Crea el fichero AvioCarrega.java en la carpeta aeronaus con el contenido siguiente:
```Java
	package aeronaus;
	public class AvioCarrega extends Aeronau {
		private int paquets;
		public int getPaquets() { 
			return paquets; }
	public void setPaquets(int paquets) { 
		this.paquets= paquets; }
	}
```
  - 16. Modifica el archivo AvioPassatgers (carpeta aeronaus) haciendo que el dato passatgers pase a ser protected.
  - 17. Modifica el archivo Aeronau.java para hacer que todos los datos sean protected.
  - 18. Haz un commit de los cambios con el mensaje "versión segunda rama".
- 70\. Git · Ejercicio 0004

* * *
