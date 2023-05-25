package ej_70_Refaccion_Ejercicio0001;

public class Ej_70_Refaccion_Ejercicio0001 {
	
	private static final int DESCUENTO_5 = 5;
	private static final int DESCUENTO_10 = 10;

	public static void main(String[] args) throws PrecioException {
		precioConDescuento(7000);
	}
	
	public static float precioConDescuento(float precio) throws PrecioException {
  		float resultado;

  		if(precio <0) throw new PrecioException();
  		
  		/*
  		 * 1) Transformo el porcentaje de descuento en constantes:
  		 * 		DESCUENTO_5
  		 * 		DESCUENTO_10
  		 * 
  		 * 2) Extraigo el método descuento(float resultado, float descuento)
  		 * 		resultado = precio - precio * DESCUENTO_10 / 100;
  		 * 
  		 * 3) Extraigo la variable resultado, para usarla en todo el código.
  		 */
  		
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

	/*
	 * 2) Extraigo el método calcularDescuento(float precio)
	 * 
	 * 3) Le añado una variable de entrada para el descuento.
	 */
	private static float calcularDescuento(float precio, float descuento) {
		float resultado;
		resultado = precio - precio * descuento / 100;
		return resultado;
	}
}
