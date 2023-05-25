package ej_70_Refaccion_Ejercicio0002;

public class Ej_70_Refaccion_Ejercicio0002 {
	
	private static final int DESCUENTO_8 = 8;
	private static final int DESCUENTO_5 = 5;
	private static final int DESCUENTO_2 = 2;
	private static final int DESCUENTO_1 = 1;

	public static void main(String[] args) {
		System.out.println(souAmbEstadis(10));
		System.out.println(souAmbEstadis(18));
		System.out.println(souAmbEstadis(23));
		System.out.println(souAmbEstadis(27));
		
	}
	
	public static double souAmbEstadis (int antiguitat){
		
		double sou=0;
		double souBase=1400;
		
		sou = sou = calcularSueldo(souBase, DESCUENTO_1);
	/*
	 * 1) Extraigo las constantes del % de aumento de sueldo.
	 * 
	 * 2) Extraigo el método calcularSueldo(double souBase).
	 * 
	 * 3) Extraigo la variable sou, para que todos puedan usarla.
	 * 		
	 */
		
	if (antiguitat<9) {
		return -1;
	} if (antiguitat >=9 && antiguitat <=14) {
		
	} if (antiguitat >=15 && antiguitat <=20) {
		sou = calcularSueldo(sou, DESCUENTO_2);
	} if (antiguitat >=21 && antiguitat <=26) {
		sou = calcularSueldo(sou, DESCUENTO_5);
	} else if (antiguitat>26) {
		sou = calcularSueldo(sou, DESCUENTO_8);
	}
		return sou;
	}

	/*
	 * Le añado al método la variable de entrada double tipoDescuento.
	 */
	private static double calcularSueldo(double souBase, double tipoDescuento) {
		double sou;
		sou=souBase+souBase*tipoDescuento/100;
		return sou;
	}
}
