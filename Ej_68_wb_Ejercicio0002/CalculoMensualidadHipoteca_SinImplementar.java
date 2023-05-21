package Ej_68_wb_Ejercicio0002_SinImplementar;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.wb.swt.SWTResourceManager;

public class CalculoMensualidadHipoteca {

	protected Shell shlCalculoMensualidadHipoteca;
	private Group grpDatosVivienda;
	private Group grpDatosHipoteca;
	private Group grpAlertas;
	private Button btnAceptar;
	private Button btnCalcular;
	private Button btnRestablecer;
	private Label lblPrecioVivienda;
	private Label lblAhorrosAportados;
	private Label lblTipoResidencia;
	private Text textPrecioVivienda;
	private Text textAhorrosAportados;
	private Label lblEuroPrecioVivienda;
	private Label lblEuroAhorrosAportados;
	private Label lblDescuento;
	private Label lblEdadCliente;
	private Label lblAnosHipoteca;
	private Label lblEuriborActual;
	private Text textEdadCliente;
	private Text textAnosHipoteca;
	private Text textEuriborActual;
	private Label lblPorcentageEuriborActual;
	private Label label;
	private Label lblPosiblesHipotecas;
	private Label lblFijoSinBonificar;
	private Label lblFijoBonificado;
	private Label lblVariableSinBonificar;
	private Label lblVariableBonificada;
	private Text textAlertas;
	private Text textFijoSinBonificar;
	private Text textFijoBonificado;
	private Text textVariableSinBonificar;
	private Text textVariableBonificada;
	private Label lblEuroMesFijoSinBonificar;
	private Label lblEuroMesVariableSinBonificar;
	private Label lblEuroMesFijoBonificado;
	private Label lblEuroMesVariableBonificada;
	private Combo comboTipoResidencia;
	private Combo comboDescuento;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CalculoMensualidadHipoteca window = new CalculoMensualidadHipoteca();
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
		shlCalculoMensualidadHipoteca.open();
		shlCalculoMensualidadHipoteca.layout();
		while (!shlCalculoMensualidadHipoteca.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	
	protected void createContents() {
		
		//shell
		shlCalculoMensualidadHipoteca = new Shell();
		shlCalculoMensualidadHipoteca.setSize(450, 516);
		shlCalculoMensualidadHipoteca.setText("Cálculo de la Mensualidad de la Hipoteca");
		
		/*
		 * GRUPO DATOS VIVIENDA
		 */
		grpDatosVivienda = new Group(shlCalculoMensualidadHipoteca, SWT.NONE);
		grpDatosVivienda.setText("Datos Vivienda");
		grpDatosVivienda.setBounds(10, 10, 422, 123);
		
		//etiqueta "Precio Vivienda"
		lblPrecioVivienda = new Label(grpDatosVivienda, SWT.NONE);
		lblPrecioVivienda.setBounds(10, 10, 116, 17);
		lblPrecioVivienda.setText("Precio vivienda");
		
		//texto "Precio Vivienda"
		textPrecioVivienda = new Text(grpDatosVivienda, SWT.BORDER);
		textPrecioVivienda.setBounds(154, 10, 123, 17);
		
		//etiqueta "e" "Precio Vivienda" 
		lblEuroPrecioVivienda = new Label(grpDatosVivienda, SWT.NONE);
		lblEuroPrecioVivienda.setText("e");
		lblEuroPrecioVivienda.setBounds(283, 10, 15, 17);
		
		//etiqueta "Ahorros aportados"
		lblAhorrosAportados = new Label(grpDatosVivienda, SWT.NONE);
		lblAhorrosAportados.setText("Ahorros aportados");
		lblAhorrosAportados.setBounds(10, 42, 138, 17);
		
		//texto "Ahorros aportados"
		textAhorrosAportados = new Text(grpDatosVivienda, SWT.BORDER);
		textAhorrosAportados.setBounds(154, 42, 123, 17);
		
		//etiqueta "e" "Ahorros aportados"
		lblEuroAhorrosAportados = new Label(grpDatosVivienda, SWT.NONE);
		lblEuroAhorrosAportados.setText("e");
		lblEuroAhorrosAportados.setBounds(283, 42, 15, 17);
		
		//etiqueta "Tipo residencia"
		lblTipoResidencia = new Label(grpDatosVivienda, SWT.NONE);
		lblTipoResidencia.setText("Tipo residencia");
		lblTipoResidencia.setBounds(10, 77, 116, 17);
		
		//combo "Tipo residencia"
		comboTipoResidencia = new Combo(grpDatosVivienda, SWT.NONE);
		comboTipoResidencia.setBounds(132, 65, 145, 22);
		
		//button "ACEPTAR"
		btnAceptar = new Button(grpDatosVivienda, SWT.NONE);
		btnAceptar.setBounds(314, 47, 89, 34);
		btnAceptar.setText("ACEPTAR");
		
	
		/*
		 * GRUPO DATOS HIPOTECA
		 */
		grpDatosHipoteca = new Group(shlCalculoMensualidadHipoteca, SWT.NONE);
		grpDatosHipoteca.setText("Datos Hipoteca");
		grpDatosHipoteca.setBounds(10, 139, 422, 273);
		
		//etiqueta "Descuento"
		lblDescuento = new Label(grpDatosHipoteca, SWT.NONE);
		lblDescuento.setText("Descuento");
		lblDescuento.setBounds(10, 10, 116, 17);
		
		//combo "Descuento"
		comboDescuento = new Combo(grpDatosHipoteca, SWT.NONE);
		comboDescuento.setBounds(111, 0, 168, 34);
		
		//etiqueta "Edad cliente"
		lblEdadCliente = new Label(grpDatosHipoteca, SWT.NONE);
		lblEdadCliente.setText("Edad cliente");
		lblEdadCliente.setBounds(10, 42, 116, 17);
		
		//texto "Edad cliente"
		textEdadCliente = new Text(grpDatosHipoteca, SWT.BORDER);
		textEdadCliente.setBounds(111, 42, 89, 20);
		
		//etiqueta "Años hipoteca"
		lblAnosHipoteca = new Label(grpDatosHipoteca, SWT.NONE);
		lblAnosHipoteca.setText("Años hipoteca");
		lblAnosHipoteca.setBounds(10, 74, 116, 17);
		
		//texto "Años hipoteca"
		textAnosHipoteca = new Text(grpDatosHipoteca, SWT.BORDER);
		textAnosHipoteca.setBounds(111, 71, 89, 20);
		
		//etiqueta "Euribor actual"
		lblEuriborActual = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuriborActual.setText("Euribor actual");
		lblEuriborActual.setBounds(10, 99, 116, 17);
		
		//texto "Euribor actual"
		textEuriborActual = new Text(grpDatosHipoteca, SWT.BORDER);
		textEuriborActual.setBounds(111, 97, 89, 20);
		
		//etiqueta % "Euribor actual"
		lblPorcentageEuriborActual = new Label(grpDatosHipoteca, SWT.NONE);
		lblPorcentageEuriborActual.setText("%");
		lblPorcentageEuriborActual.setBounds(208, 99, 116, 17);
		
		//button "CALCULAR"
		btnCalcular = new Button(grpDatosHipoteca, SWT.NONE);
		btnCalcular.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD | SWT.ITALIC));
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(314, 42, 89, 34);
		
		//button "RESTABLECER"
		btnRestablecer = new Button(grpDatosHipoteca, SWT.NONE);
		btnRestablecer.setText("RESTABLECER");
		btnRestablecer.setBounds(300, 82, 103, 34);
		
		//línea separadora
		label = new Label(shlCalculoMensualidadHipoteca, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 295, 422, 1);
		
		
		//etiqueta "POSIBLES HIPOTECAS"
		lblPosiblesHipotecas = new Label(grpDatosHipoteca, SWT.NONE);
		lblPosiblesHipotecas.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.ITALIC));
		lblPosiblesHipotecas.setText("POSIBLES HIPOTECAS");
		lblPosiblesHipotecas.setBounds(126, 145, 153, 17);
		
		//etiqueta "Fijo sin bonificar"
		lblFijoSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblFijoSinBonificar.setText("Fijo sin bonificar");
		lblFijoSinBonificar.setBounds(33, 157, 135, 17);
		
		//texto "Fijo sin bonificar"
		textFijoSinBonificar = new Text(grpDatosHipoteca, SWT.BORDER);
		textFijoSinBonificar.setBounds(33, 180, 71, 20);
		
		//etiqueta euro/mes "Fijo sin bonificar"
		lblEuroMesFijoSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesFijoSinBonificar.setText("e/mes");
		lblEuroMesFijoSinBonificar.setBounds(115, 183, 116, 17);

		//etiqueta "Fijo bonificado"
		lblFijoBonificado = new Label(grpDatosHipoteca, SWT.NONE);
		lblFijoBonificado.setText("Fijo bonificado");
		lblFijoBonificado.setBounds(285, 157, 108, 17);
		
		//texto "Fijo bonificado"
		textFijoBonificado = new Text(grpDatosHipoteca, SWT.BORDER);
		textFijoBonificado.setBounds(285, 181, 71, 20);
		
		//etiqueta euro/mes "Fijo bonificado"
		lblEuroMesFijoBonificado = new Label(shlCalculoMensualidadHipoteca, SWT.NONE);
		lblEuroMesFijoBonificado.setText("e/mes");
		lblEuroMesFijoBonificado.setBounds(374, 340, 47, 17);
		
		//etiqueta "Variable sin bonificar"
		lblVariableSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblVariableSinBonificar.setText("Variable sin bonificar");
		lblVariableSinBonificar.setBounds(33, 207, 167, 17);
		
		//texto "Variable sin bonificar"
		textVariableSinBonificar = new Text(grpDatosHipoteca, SWT.BORDER);
		textVariableSinBonificar.setBounds(33, 226, 71, 20);
		
		//etiqueta euro/mes "Variable sin bonificar"
		lblEuroMesVariableSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesVariableSinBonificar.setText("e/mes");
		lblEuroMesVariableSinBonificar.setBounds(115, 229, 116, 17);
		
		//etiqueta "Variable bonificada"
		lblVariableBonificada = new Label(grpDatosHipoteca, SWT.NONE);
		lblVariableBonificada.setText("Variable bonificada");
		lblVariableBonificada.setBounds(285, 207, 135, 17);
		
		//texto "Variable bonificada"
		textVariableBonificada = new Text(grpDatosHipoteca, SWT.BORDER);
		textVariableBonificada.setBounds(285, 226, 71, 20);
		
		//etiqueta euro/mes "Variable bonificada"
		lblEuroMesVariableBonificada = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesVariableBonificada.setText("e/mes");
		lblEuroMesVariableBonificada.setBounds(362, 229, 47, 17);
		
				
		/*
		 * GRUPO ALERTAS
		 */
		grpAlertas = new Group(shlCalculoMensualidadHipoteca, SWT.NONE);
		grpAlertas.setText("Alertas");
		grpAlertas.setBounds(10, 418, 422, 54);
		
		textAlertas = new Text(grpAlertas, SWT.BORDER);
		textAlertas.setBounds(10, 10, 393, 17);
		
	}
}
