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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class Ej_68_wb_Ejercicio0003_Sin_Implementar {

	protected Shell shlContratoVod;
	private Group grpDatosContrato;
	private Group grpDescuentos;
	private Group group_2;
	private Label lblPaqueteContratado;
	private Label lblDuracinContrato;
	private Combo comboPaqueteContratado;
	private Text textDuracionContrato;
	private Button btnAceptar;
	private Label lblMesesDuracionContrato;
	private Label lblProductosAdicionalesContratados;
	private Combo comboProductosAdicionalesContratados;
	private Button btnCalcular;
	private Button btnRestablecer;
	private Label lblImporteBase;
	private Label lblDescuentos;
	private Label lblImporteTotal;
	private Text textImporteBase;
	private Text textDescuentos;
	private Text textImporteTotal;
	private Label lblImporte;
	private Text textAlertas;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ej_68_wb_Ejercicio0003 window = new Ej_68_wb_Ejercicio0003();
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
		shlContratoVod.open();
		shlContratoVod.layout();
		while (!shlContratoVod.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		//shell
		shlContratoVod = new Shell();
		shlContratoVod.setSize(450, 512);
		shlContratoVod.setText("Contrato VoD");
		
		/*
		 * grupo "Datos Contrato"		
		 */
		grpDatosContrato = new Group(shlContratoVod, SWT.NONE);
		grpDatosContrato.setText("Datos Contrato");
		grpDatosContrato.setBounds(10, 10, 411, 105);
		
		//etiqueta "Paquete contratado"
		lblPaqueteContratado = new Label(grpDatosContrato, SWT.NONE);
		lblPaqueteContratado.setBounds(10, 10, 138, 17);
		lblPaqueteContratado.setText("Paquete contratado");
		
		//combo "Paquete contratado"
		comboPaqueteContratado = new Combo(grpDatosContrato, SWT.NONE);
		comboPaqueteContratado.setBounds(154, 0, 121, 34);
		
		//etiqueta "Duración contrato"
		lblDuracinContrato = new Label(grpDatosContrato, SWT.NONE);
		lblDuracinContrato.setText("Duración contrato");
		lblDuracinContrato.setBounds(10, 46, 138, 17);
		
		//texto "Duración contrato"		
		textDuracionContrato = new Text(grpDatosContrato, SWT.BORDER);
		textDuracionContrato.setBounds(154, 46, 121, 30);
		
		//etiqueta meses "Duración contrato"
		lblMesesDuracionContrato = new Label(grpDatosContrato, SWT.NONE);
		lblMesesDuracionContrato.setBounds(281, 59, 70, 17);
		lblMesesDuracionContrato.setText("meses");
		
		//button "Aceptar"
		btnAceptar = new Button(grpDatosContrato, SWT.NONE);
		btnAceptar.setBounds(314, 10, 89, 34);
		btnAceptar.setText("Aceptar");
		
		
		/*
		 * grupo Descuentos 
		 */
		grpDescuentos = new Group(shlContratoVod, SWT.NONE);
		grpDescuentos.setText("Descuentos");
		grpDescuentos.setBounds(10, 121, 411, 277);
		
		//etiqueta "Productos adicionales contratados"
		lblProductosAdicionalesContratados = new Label(grpDescuentos, SWT.NONE);
		lblProductosAdicionalesContratados.setText("Productos adicionales contratados:");
		lblProductosAdicionalesContratados.setBounds(10, 10, 239, 17);
		
		//combo "Productos adicionales contratados"
		comboProductosAdicionalesContratados = new Combo(grpDescuentos, SWT.NONE);
		comboProductosAdicionalesContratados.setBounds(261, 0, 121, 34);
		
		//button "CALCULAR"
		btnCalcular = new Button(grpDescuentos, SWT.NONE);
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(75, 75, 89, 34);
		
		//button "Restablecer"
		btnRestablecer = new Button(grpDescuentos, SWT.NONE);
		btnRestablecer.setText("Restablecer");
		btnRestablecer.setBounds(261, 75, 89, 34);
		
		//etiqueta "IMPORTE (todos los importes en euros"
		lblImporte = new Label(grpDescuentos, SWT.NONE);
		lblImporte.setText("IMPORTE (todos los importes en euros)");
		lblImporte.setBounds(10, 130, 265, 17);
		
		//etiqueta "Importe Base"
		lblImporteBase = new Label(grpDescuentos, SWT.NONE);
		lblImporteBase.setText("Importe Base");
		lblImporteBase.setBounds(10, 166, 101, 17);
		
		//texto "Importe Base"
		textImporteBase = new Text(grpDescuentos, SWT.BORDER);
		textImporteBase.setBounds(10, 189, 83, 30);
		
		//etiqueta "Descuentos"
		lblDescuentos = new Label(grpDescuentos, SWT.NONE);
		lblDescuentos.setText("Descuentos");
		lblDescuentos.setBounds(158, 166, 101, 17);
		
		//texto "Descuentos"
		textDescuentos = new Text(grpDescuentos, SWT.BORDER);
		textDescuentos.setBounds(158, 189, 83, 30);
		
		//etiqueta "Importe Total"
		lblImporteTotal = new Label(grpDescuentos, SWT.NONE);
		lblImporteTotal.setText("Importe Total");
		lblImporteTotal.setBounds(281, 166, 101, 17);
		
		//texto "Importe Total"
		textImporteTotal = new Text(grpDescuentos, SWT.BORDER);
		textImporteTotal.setBounds(291, 189, 83, 30);
		
		/*
		 * grupo "Alertas"
		 */		
		group_2 = new Group(shlContratoVod, SWT.NONE);
		group_2.setText("Alertas");
		group_2.setBounds(10, 404, 411, 57);
		
		//texto "Alertas"
		textAlertas = new Text(group_2, SWT.BORDER);
		textAlertas.setBounds(10, 0, 392, 30);

	}

}
