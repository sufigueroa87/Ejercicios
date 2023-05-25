package ej_70_Refaccion_Ejercicio0003;

public class Ej_70_Refaccion_Ejercicio0003 {

	private static final float IVA = 0.21f;

	public static void resumIva (float importCompres, float importVendes) {
		
		/*
		 * 1) Extraigo la constante del iva 0.21f
		 * 
		 * 2) Extraigo el método calcularImporteIVA(double importe) a partir de:
		 * 		importCompres*IVA
		 * 
		 * 3) Extraigo la variable ivaSoportado a partir de:
		 * 		calcularImporteIVA(importCompres)
		 * 
		 * 4) Extraigo la variable ivaRepercutido a partir de:
		 * 		
		 */
		
		float ivaSoportado = calcularImporteIVA(importCompres);
		float importeVentasIVA = calcularImporteIVA(importVendes);
		
		System.out.printf("IVA suportat: %.2f\n", ivaSoportado);
				
		System.out.printf("IVA repercutit: %.2f\n", importeVentasIVA);
		
		System.out.printf("Resultat IVA: %.2f\n", (importeVentasIVA - ivaSoportado));
	}

	
	private static float calcularImporteIVA(float tipoImporte) {
		return tipoImporte*IVA;
	}
	
}
