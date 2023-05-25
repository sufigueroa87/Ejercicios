package ej_70_Refaccion_Ejercicio0005;

public class Ej_70_Refaccion_Ejercicio0005 {
	
	private static final double COSTE_PRODUCTO_3 = 3.00;
	private static final double COSTE_PRODUCTO_2 = 2.50;
	private static final double COSTE_PRODUCTO_1 = 2.00;
	
	public static void main (String[] args) {
		System.out.println("El precio de la factura con iva es: " + calculaImportLloguer(2, 4, 3));
	}

	public static Double calculaImportLloguer(int nroProductesTipus1, int nroProductesTipus2, int nroProductesTipus3) {
		Double importTipus1 = 0.00;
		Double importTipus2 = 0.00;
		Double importTipus3 = 0.00;
		Double importTotal = 0.00;
		
		/*
		 * 1) Extraigo las constantes del precio según el tipo.
		 * 
		 * 2) Extraigo el método calcularIvaProducto(double importeProducto) a partir de:
		 * 		importTipus1/100*21
		 * 
		 * 3) Extraigo el método para calcular el importe del producto de tipo * a partir de:
		 * 
		 * 		importTipus1 = nroProductesTipus1 * COSTE_PRODUCTO_1;
		 * 		System.out.println ("El númreo de productes de tipus 1 és :"+nroProductesTipus1);
		 * 		System.out.println ("El preu total per a productes de tipus 1 (sense IVA) és :"+importTipus1+"€");
		 * 		importTipus1 = importTipus1 + calcularIvaProducto(importTipus1);
		 * 
		 * 4) Extraigo el método para calcular el importe total de la factura a partir de:
		 * 
		 * 		importTipus1 = calcularImporte(nroProductesTipus1, COSTE_PRODUCTO_1);
		 *		importTipus2 = calcularImporte(nroProductesTipus2, COSTE_PRODUCTO_2);
		 *		importTipus3 = calcularImporte(nroProductesTipus3, COSTE_PRODUCTO_3);
		 *		importTotal = importTipus1+importTipus2+importTipus3; 	
		 * 
		 */
		
		importTotal = calcularImporteTotal(nroProductesTipus1, nroProductesTipus2, nroProductesTipus3);
		
		return importTotal;
	}

	private static Double calcularImporteTotal(int nroProductesTipus1, int nroProductesTipus2, int nroProductesTipus3) {
		Double importTipus1;
		Double importTipus2;
		Double importTipus3;
		Double importTotal;
		importTipus1 = calcularImporte(nroProductesTipus1, COSTE_PRODUCTO_1);
		
		importTipus2 = calcularImporte(nroProductesTipus2, COSTE_PRODUCTO_2);

		importTipus3 = calcularImporte(nroProductesTipus3, COSTE_PRODUCTO_3);

		importTotal = importTipus1+importTipus2+importTipus3;
		return importTotal;
	}

	private static Double calcularImporte(int nroProductes, double costeProducto) {
		Double importTipus;
		importTipus = nroProductes * costeProducto;
		System.out.println ("El númreo de productes és :"+nroProductes);
		System.out.println ("El preu total per a productes (sense IVA) és :"+importTipus+"€");
		importTipus = importTipus + calcularIvaProducto(importTipus);
		System.out.println("El precio total con iva es: " + importTipus);
		return importTipus;
	}

	private static double calcularIvaProducto(Double importeProducto) {
		return importeProducto/100*21;
	}
}
