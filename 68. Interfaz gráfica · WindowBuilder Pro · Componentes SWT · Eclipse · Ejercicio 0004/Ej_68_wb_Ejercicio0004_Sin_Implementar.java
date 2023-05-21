/*

Pasos a seguir una vez instalado WindowBuilderPro en Eclipse:

Creamos el proyecto para que use WindowBuilderPro : 
  File -> New -> Other -> SWT -> SWT/JFace Java Project
Creamos una ventana de tipo SWT:
  Seleccionamos src (botón derecho) -> New -> Other -> Application Window
  
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

public class Ej_68_wb_Ejercicio0004_Sin_Implementar {

	protected Shell shlSeguroCoches;
	private Group grpDatosVehculo;
	private Group grpBonificaciones;
	private Group grpAlertas;
	private Label lblCaballos;
	private Label lblCombustible;
	private Text textCaballos;
	private Combo comboCombustible;
	private Button btnAceptar;
	private Label lblAntiguedadCarnet;
	private Label lblAnosAntiguedadCarnet;
	private Label lblUltimoComunicadoAccidente;
	private Text textAntiguedadCarnet;
	private Text textUltimoComunicadoAccidente;
	private Label lblAnosUltimoComunicadoAccidente;
	private Label lblImportetodosLos;
	private Button btnCalcular;
	private Button btnRestablecer;
	private Label lblAnual;
	private Label lblTrimestral;
	private Label lblMensual;
	private Text textAnual;
	private Text textTrimestral;
	private Text textMensual;
	private Label lblBonificacionesAplicadas;
	private Text textBonificacionesAplicadas;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ej_68_wb_Ejercicio0004 window = new Ej_68_wb_Ejercicio0004();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSeguroCoches.open();
		shlSeguroCoches.layout();
		while (!shlSeguroCoches.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSeguroCoches = new Shell();
		shlSeguroCoches.setSize(450, 514);
		shlSeguroCoches.setText("Seguro Coches");
		
		/*
		 * grupo "Datos Vehículo"
		 */
		grpDatosVehculo = new Group(shlSeguroCoches, SWT.NONE);
		grpDatosVehculo.setText("Datos Vehículo");
		grpDatosVehculo.setBounds(10, 10, 421, 93);
		
		//etiqueta "Caballos"
		lblCaballos = new Label(grpDatosVehculo, SWT.NONE);
		lblCaballos.setBounds(10, 10, 70, 17);
		lblCaballos.setText("Caballos");
		
		//texto "Caballos"
		textCaballos = new Text(grpDatosVehculo, SWT.BORDER);
		textCaballos.setBounds(105, 0, 175, 30);
		
		//etiqueta "Combustible"
		lblCombustible = new Label(grpDatosVehculo, SWT.NONE);
		lblCombustible.setText("Combustible");
		lblCombustible.setBounds(10, 49, 89, 17);

		//combo "Combustible"
		comboCombustible = new Combo(grpDatosVehculo, SWT.NONE);
		comboCombustible.setBounds(105, 36, 175, 34);
		
		//button Aceptar
		btnAceptar = new Button(grpDatosVehculo, SWT.NONE);
		btnAceptar.setBounds(303, 10, 89, 34);
		btnAceptar.setText("Aceptar");
		
		
		/*
		 * grupo "Bonificaciones"
		 */
		grpBonificaciones = new Group(shlSeguroCoches, SWT.NONE);
		grpBonificaciones.setText("Bonificaciones");
		grpBonificaciones.setBounds(10, 128, 421, 267);
		
		//etiqueta "Antigüedad carnet:"
		lblAntiguedadCarnet = new Label(grpBonificaciones, SWT.NONE);
		lblAntiguedadCarnet.setBounds(10, 10, 138, 17);
		lblAntiguedadCarnet.setText("Antigüedad carnet:");
		
		//texto "Antigüedad carnet"
		textAntiguedadCarnet = new Text(grpBonificaciones, SWT.BORDER);
		textAntiguedadCarnet.setBounds(149, 0, 117, 30);
		
		//etiqueta años "Antigüedad carnet"
		lblAnosAntiguedadCarnet = new Label(grpBonificaciones, SWT.NONE);
		lblAnosAntiguedadCarnet.setText("años");
		lblAnosAntiguedadCarnet.setBounds(272, 10, 39, 17);
		
		//etiqueta "Último comunicado accidente:"
		lblUltimoComunicadoAccidente = new Label(grpBonificaciones, SWT.NONE);
		lblUltimoComunicadoAccidente.setText("Último comunicado accidente:");
		lblUltimoComunicadoAccidente.setBounds(10, 45, 208, 17);
		
		//texto "Último comunicado accidente"		
		textUltimoComunicadoAccidente = new Text(grpBonificaciones, SWT.BORDER);
		textUltimoComunicadoAccidente.setBounds(224, 33, 42, 30);
		
		//etiqueta años "Último comunicado accidente:"
		lblAnosUltimoComunicadoAccidente = new Label(grpBonificaciones, SWT.NONE);
		lblAnosUltimoComunicadoAccidente.setText("años");
		lblAnosUltimoComunicadoAccidente.setBounds(272, 45, 39, 17);
		
		//etiqueta "IMPORTE (todos los importes en euros)"
		lblImportetodosLos = new Label(grpBonificaciones, SWT.NONE);
		lblImportetodosLos.setText("IMPORTE (todos los importes en euros)");
		lblImportetodosLos.setBounds(10, 87, 286, 17);
		
		//button "Calcular"
		btnCalcular = new Button(grpBonificaciones, SWT.NONE);
		btnCalcular.setBounds(313, 0, 89, 34);
		btnCalcular.setText("Calcular");
		
		//button "Restablecer"
		btnRestablecer = new Button(grpBonificaciones, SWT.NONE);
		btnRestablecer.setText("Restablecer");
		btnRestablecer.setBounds(313, 49, 89, 34);
		
		//etiqueta "Anual"
		lblAnual = new Label(grpBonificaciones, SWT.NONE);
		lblAnual.setBounds(10, 121, 70, 17);
		lblAnual.setText("Anual");
		
		//text "Anual"
		textAnual = new Text(grpBonificaciones, SWT.BORDER);
		textAnual.setBounds(10, 144, 83, 30);
		
		//etiqueta "Trimestral"
		lblTrimestral = new Label(grpBonificaciones, SWT.NONE);
		lblTrimestral.setBounds(170, 121, 70, 17);
		lblTrimestral.setText("Trimestral");
		
		//text "Trimestral"
		textTrimestral = new Text(grpBonificaciones, SWT.BORDER);
		textTrimestral.setBounds(167, 144, 83, 30);
		
		//etiqueta "Mensual"
		lblMensual = new Label(grpBonificaciones, SWT.NONE);
		lblMensual.setBounds(313, 121, 70, 17);
		lblMensual.setText("Mensual");
		
		//text "Mensual"
		textMensual = new Text(grpBonificaciones, SWT.BORDER);
		textMensual.setBounds(296, 144, 83, 30);
		
		//etiqueta "Bonificaciones aplicadas:"
		lblBonificacionesAplicadas = new Label(grpBonificaciones, SWT.NONE);
		lblBonificacionesAplicadas.setText("Bonificaciones aplicadas:");
		lblBonificacionesAplicadas.setBounds(10, 192, 183, 17);
		
		//texto "Bonificaciones aplicadas"
		textBonificacionesAplicadas = new Text(grpBonificaciones, SWT.BORDER);
		textBonificacionesAplicadas.setBounds(183, 180, 83, 30);
		
		/*
		 * grupo "Alertas"
		 */
		grpAlertas = new Group(shlSeguroCoches, SWT.NONE);
		grpAlertas.setText("Alertas");
		grpAlertas.setBounds(10, 409, 421, 58);
		
		//texto "Alertas"
		text = new Text(grpAlertas, SWT.BORDER);
		text.setBounds(10, 0, 392, 30);

	}

}
