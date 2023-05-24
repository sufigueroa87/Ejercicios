package refaccio;

/**
 * Clase que calcula el total de una factura, con iva y sin iva.
 * También da información más detallada del contenido de la factura.
 * @author S. Figueroa
 * @version 2023
 */
public class Ej_70_Refaccion_Ejercicio0006 {
	private static final double PREU_ARTICLE3 = 10.25;
	private static final double PREU_ARTICLE2 = 7.75;
	private static final double PREU_ARTICLE1 = 3.50;
	private static final double IVA = 1.21;

	/**
	 * Calcula el importe total de la factura.
	 * También aporta información sobre la factura, como por ejemplo la cantidad de artículos de
	 * cada que hay en la factura, el precio total del artículo sin iva y con iva, y el precio
	 * total de la factura sin iva y con iva.
	 * @param quantArticle1 cantidad de articles1 que tiene la factura.
	 * @param quantArticle2 cantidad de articles2 que tiene la factura.
	 * @param quantArticle3 cantidad de articles3 que tiene la factura.
	 * @return el precio total de la factura con iva.
	 */
	public static Double calculaImportFactura(int quantArticle1, int quantArticle2, int quantArticle3) {
		Double importTarifa1 = 0.00;
		Double importTarifa2 = 0.00;
		Double importTarifa3 = 0.00;
		Double importTotal = 0.00;
		Double importTotalIVA = 0.00;
		
		importTarifa1 = importTarifaSenseIva(quantArticle1, PREU_ARTICLE1);
		importTarifa2 = importTarifaSenseIva(quantArticle2, PREU_ARTICLE2);
		importTarifa3 = importTarifaSenseIva(quantArticle3, PREU_ARTICLE3);
		
		importTarifaIva(quantArticle1, importTarifa1);
		importTarifaIva(quantArticle2, importTarifa2);
		importTarifaIva(quantArticle3, importTarifa3);
	
		importTotal = importTotalSenseIva(importTarifa1, importTarifa2, importTarifa3);
		importTotalIVA = importTotalAmbIva(importTotal);
		
		return importTotalIVA;
	}

	/**
	 * Calcula el importe total con iva de la factura.
	 * Da información del precio total de la factura con iva.
	 * @param importTotal importe total sin iva de la factura.
	 * @return importe total con iva de la factura.
	 */
	private static Double importTotalAmbIva(Double importTotal) {
		Double importTotalIVA;
		importTotalIVA = importTotal + importTotal/100*21;
		System.out.println("El preu total (amb IVA) és :"+importTotalIVA+"€");
		return importTotalIVA;
	}

	/**
	 * Calcula el importe total sin iva de la factura.
	 * Da información del precio total de la factura sin iva.
	 * @param importTarifa1 importe del conjunto de artículos de tipo article1 sin iva.
	 * @param importTarifa2 importe del conjunto de artículos de tipo article2 sin iva.
	 * @param importTarifa3 importe del conjunto de artículos de tipo article3 sin iva.
	 * @return importe total sin iva de la factura.
	 */
	private static Double importTotalSenseIva(Double importTarifa1, Double importTarifa2, Double importTarifa3) {
		Double importTotal;
		importTotal = importTarifa1 + importTarifa2 + importTarifa3;
		System.out.println("El preu total (sense IVA) és :"+importTotal+"€.");
		return importTotal;
	}
	
	/**
	 * Calcula el importe con iva del conjunto de artículos que tiene la factura del tipo de artículo pasado por parámetro.
	 * Da información sobre la cantidad de artículos que contiene la factura, el precio total del artículo sin iva y con iva.
	 * @param quantitatArticle cantidad de artículos que contiene la factura del tipo de artículo pasado por parámetro.
	 * @param importTarifaArticle importe sin iva del conjunto de artículos del tipo de artículo pasado por parámetro.
	 */
	private static void importTarifaIva(int quantitatArticle, Double importTarifaArticle) {
		Double importTarifaIva = importTarifaArticle * IVA;
		System.out.println("S'han comprat "+quantitatArticle+" unitats de l'article.");
		System.out.println("El preu total de l'article (sense IVA) és :"+importTarifaArticle+"€.");
		System.out.println("El preu total de l'article (amb IVA) és :"+importTarifaIva+"€.");
	}

	/**
	 * Calcula el importe sin iva del conjunto de artículos que contiene la factura del tipo de artículo pasado por parámetro.
	 * @param quantitatArticle cantidad de artículos que contiene la factura del tipo de artículo pasado por parámetro.
	 * @param preuArticle precio del artículo correspondiente al tipo de artículo pasado por parámetro.
	 * @return importe sin iva del conjunto de artículos que contiene la factura del tipo de artículo pasado por parámetro.
	 */
	private static Double importTarifaSenseIva(int quantitatArticle, double preuArticle) {
		Double importTarifa;
		importTarifa = quantitatArticle * preuArticle;
		return importTarifa;
	}
} 

