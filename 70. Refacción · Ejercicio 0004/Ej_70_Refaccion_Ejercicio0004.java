package ej_70_Refaccion_Ejercicio0004;

public class Ej_70_Refaccion_Ejercicio0004 {
	
	private static final double COSTE_TARIFA_3 = 0.10;
	private static final double COSTE_TARIFA_2 = 0.06;
	private static final double COSTE_TARIFA_1 = 0.03;

	public static void main(String[] args) {
		calculaImportFactura(10, 20, 30);
	}

	public static Double calculaImportFactura(int nroMinutsTarifa1, int nroMinutsTarifa2, 
int nroMinutsTarifa3) {
		Double importTarifa1 = 0.00;
		Double importTarifa2 = 0.00;
		Double importTarifa3 = 0.00;
		Double importTotal = 0.00;
		Double importTotalIVA = 0.00;
		
		/*
		 * 1) Extraigo las constantes del coste de los minutos según la tarifa.
		 * 
		 * 2) Extraigo el método calculoImporteTarifa(int cantidadMinutos, double costeTarifa) a partir de:
		 * 		
		 * 		importTarifa1 = nroMinutsTarifa1 * COSTE_TARIFA_1;
		 *		System.out.println("El número de minuts de tarifa 1 és :"+nroMinutsTarifa1);
		 *		System.out.println("El preu total per a tarifa 1 (sense IVA) és :"+importTarifa1+"€");
		 *
		 * 3) Extraigo el método calcularImporteTotal(int nroMinutsTarifa1, int nroMinutsTarifa2, int nroMinutsTarifa3) a partir de:
		 * 
		 * 		importTotal = nroMinutsTarifa1 * COSTE_TARIFA_1 + nroMinutsTarifa1 * COSTE_TARIFA_2 + nroMinutsTarifa1 * COSTE_TARIFA_3;
		 * 		System.out.println("El preu total (sense IVA) és :"+importTotal+"€");
		 * 		importTotalIVA = importTotal + importTotal/100*21;
		 * 		System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
		 * 
		 * 4) Extraigo las variables de los importes por tarifas a partir de:
		 * 		calculoImporteTarifa(nroMinutsTarifa1, COSTE_TARIFA_1);
		 * 		calculoImporteTarifa(nroMinutsTarifa2, COSTE_TARIFA_2);
		 *		calculoImporteTarifa(nroMinutsTarifa3, COSTE_TARIFA_3);
		 *
		 */
		
		importTarifa1 = calculoImporteTarifa(nroMinutsTarifa1, COSTE_TARIFA_1);
		
		importTarifa2 = calculoImporteTarifa(nroMinutsTarifa2, COSTE_TARIFA_2);

		importTarifa3 = calculoImporteTarifa(nroMinutsTarifa3, COSTE_TARIFA_3);
		
		importTotalIVA = calcularImporteTotal(nroMinutsTarifa1, nroMinutsTarifa2, nroMinutsTarifa3);
		
		return importTotalIVA;
	}

	private static Double calcularImporteTotal(int nroMinutsTarifa1, int nroMinutsTarifa2, int nroMinutsTarifa3) {
		Double importTotal;
		Double importTotalIVA;
		importTotal = nroMinutsTarifa1 * COSTE_TARIFA_1 + nroMinutsTarifa2 * COSTE_TARIFA_2 + nroMinutsTarifa3 * COSTE_TARIFA_3;
		System.out.println("El preu total (sense IVA) és :"+importTotal+"€");
		importTotalIVA = importTotal + importTotal/100*21;
		System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
		return importTotalIVA;
	}

	private static double calculoImporteTarifa(int cantidadMinutos, double costeTarifa) {
		Double importTarifa;
		importTarifa = cantidadMinutos * costeTarifa;
		System.out.println("El número de minuts de tarifa 1 és :"+cantidadMinutos);
		System.out.println("El preu total per a tarifa 1 (sense IVA) és :"+importTarifa+"€");
		return importTarifa;
	}
	
	// ...... altres mètodes de la classe
	
} // fi de la classe

