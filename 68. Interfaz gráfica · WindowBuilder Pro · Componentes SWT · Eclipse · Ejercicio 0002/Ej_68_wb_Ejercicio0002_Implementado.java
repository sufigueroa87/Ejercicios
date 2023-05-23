/*
 * Introducir explicación: .setToolTipText("Texto mensaje.");
 * 
 * Opciones combo: 	SWT.READ_ONLY
 * 					String[] opcionesTipoResidencia = new String[]{"Vivienda habitual", "Segunda residencia"};
 *					comboTipoResidencia.setItems(opcionesTipoResidencia);
 *
 * Hacer que un texto no sea editable: 	textVisualitzarErrors.setEditable(false);
 * 
 * 
 */

package Ej_68_wb_Ejercicio0002;

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

public class Ej_68_wb_Ejercicio0002_Implementado {

	public static final double FIJO_SIN_BONIFICAR = 2.95;
	public static final double FIJO_BONIFICADO = 2.55;
	public static final double VARIABLE_SIN_BONIFICAR = 1.24;
	public static final double VARIABLE_BONIFICADA = 0.6;
	
	public static final double FUNCIONARIO = -1.0;
	public static final double MENORES_35 = -0.5;
	public static final double COLECTIVOS_ESPECIALES = -0.75;
	public static final double NINGUNO = 0.0;
	
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
	private Label lblEuroMesVariableBonificada;
	private Combo comboTipoResidencia;
	private Combo comboDescuento;
	private Label lblEuroMesFijoBonificado;

	private double precioVivienda;
	private double ahorrosAportados;
	private String tipoResidencia;
	
	private String tipoDescuento;
	private int edadCliente;
	private int anosHipoteca;
	private double euriborActual;
	
	private double mensualidad;
	
	
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
		textPrecioVivienda.setToolTipText("Introduce el precio del piso / casa / etc. sin impuestos.");
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
		textAhorrosAportados.setToolTipText("Introduce la cantidad de dinero que tiene ahorrada el cliente.");
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
		comboTipoResidencia = new Combo(grpDatosVivienda, SWT.READ_ONLY);
		comboTipoResidencia.setToolTipText("Selecciona el tipo de residencia que quiere comprar el cliente.");
		String[] opcionesTipoResidencia = new String[]{"Vivienda habitual", "Segunda residencia"};
		comboTipoResidencia.setItems(opcionesTipoResidencia);
		comboTipoResidencia.setBounds(132, 65, 145, 22);
		
		//button "ACEPTAR"
		btnAceptar = new Button(grpDatosVivienda, SWT.NONE);
		btnAceptar.setBounds(314, 47, 89, 34);
		btnAceptar.setText("ACEPTAR");
		btnAceptar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if (comprovarNumerico(textPrecioVivienda, lblPrecioVivienda.getText()) &&
						comprovarNumerico(textAhorrosAportados, lblAhorrosAportados.getText()) &&
							comboSeleccionado(comboTipoResidencia, lblTipoResidencia.getText())) {
					
					precioVivienda = obtenerValorAPartirString(textPrecioVivienda);
					ahorrosAportados = obtenerValorAPartirString(textAhorrosAportados);
					tipoResidencia = comboTipoResidencia.getText();
					
					if (precioAhorrosOK(precioVivienda)){
						activarDatosVivienda(false);
						activarDatosHipoteca(true);
						reseteoMensajesError();
					}
				}
			}
		});
	
		/*
		 * GRUPO DATOS HIPOTECA
		 */
		grpDatosHipoteca = new Group(shlCalculoMensualidadHipoteca, SWT.NONE);
		grpDatosHipoteca.setEnabled(false);
		grpDatosHipoteca.setText("Datos Hipoteca");
		grpDatosHipoteca.setBounds(10, 139, 422, 273);
		
		//etiqueta "Descuento"
		lblDescuento = new Label(grpDatosHipoteca, SWT.NONE);
		lblDescuento.setEnabled(false);
		lblDescuento.setText("Descuento");
		lblDescuento.setBounds(10, 10, 116, 17);
		
		//combo "Descuento"
		comboDescuento = new Combo(grpDatosHipoteca, SWT.READ_ONLY);
		comboDescuento.setEnabled(false);
		comboDescuento.setToolTipText("Selecciona el tipo de descuento.");
		String[] opcionesDescuento = new String[]{"Funcionario", "Menor de 35 años", "Colectivos especiales", "Ninguno"};
		comboDescuento.setItems(opcionesDescuento);
		comboDescuento.setBounds(111, 0, 168, 34);
		
		//etiqueta "Edad cliente"
		lblEdadCliente = new Label(grpDatosHipoteca, SWT.NONE);
		lblEdadCliente.setEnabled(false);
		lblEdadCliente.setText("Edad cliente");
		lblEdadCliente.setBounds(10, 42, 116, 17);
		
		//texto "Edad cliente"
		textEdadCliente = new Text(grpDatosHipoteca, SWT.BORDER);
		textEdadCliente.setEnabled(false);
		textEdadCliente.setToolTipText("Introduce la edad del cliente.");
		textEdadCliente.setBounds(111, 42, 89, 20);
		
		//etiqueta "Años hipoteca"
		lblAnosHipoteca = new Label(grpDatosHipoteca, SWT.NONE);
		lblAnosHipoteca.setEnabled(false);
		lblAnosHipoteca.setText("Años hipoteca");
		lblAnosHipoteca.setBounds(10, 74, 116, 17);
		
		//texto "Años hipoteca"
		textAnosHipoteca = new Text(grpDatosHipoteca, SWT.BORDER);
		textAnosHipoteca.setEnabled(false);
		textAnosHipoteca.setToolTipText("Introduce los años de hipoteca que quiere el cliente.");
		textAnosHipoteca.setBounds(111, 71, 89, 20);
		
		//etiqueta "Euribor actual"
		lblEuriborActual = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuriborActual.setEnabled(false);
		lblEuriborActual.setText("Euribor actual");
		lblEuriborActual.setBounds(10, 99, 116, 17);
		
		//texto "Euribor actual"
		textEuriborActual = new Text(grpDatosHipoteca, SWT.BORDER);
		textEuriborActual.setEnabled(false);
		textEuriborActual.setToolTipText("Introduce el euribor actual.");
		textEuriborActual.setBounds(111, 97, 89, 20);
		
		//etiqueta % "Euribor actual"
		lblPorcentageEuriborActual = new Label(grpDatosHipoteca, SWT.NONE);
		lblPorcentageEuriborActual.setEnabled(false);
		lblPorcentageEuriborActual.setText("%");
		lblPorcentageEuriborActual.setBounds(208, 99, 116, 17);
		
		//línea separadora
		label = new Label(shlCalculoMensualidadHipoteca, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 295, 422, 1);
		
		
		//etiqueta "POSIBLES HIPOTECAS"
		lblPosiblesHipotecas = new Label(grpDatosHipoteca, SWT.NONE);
		lblPosiblesHipotecas.setEnabled(false);
		lblPosiblesHipotecas.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.ITALIC));
		lblPosiblesHipotecas.setText("POSIBLES HIPOTECAS");
		lblPosiblesHipotecas.setBounds(126, 145, 153, 17);
		
		//etiqueta "Fijo sin bonificar"
		lblFijoSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblFijoSinBonificar.setEnabled(false);
		lblFijoSinBonificar.setText("Fijo sin bonificar");
		lblFijoSinBonificar.setBounds(33, 157, 135, 17);
		
		//texto "Fijo sin bonificar"
		textFijoSinBonificar = new Text(grpDatosHipoteca, SWT.BORDER);
		textFijoSinBonificar.setEnabled(false);
		textFijoSinBonificar.setEditable(false);
		textFijoSinBonificar.setBounds(33, 180, 71, 20);
		
		//etiqueta euro/mes "Fijo sin bonificar"
		lblEuroMesFijoSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesFijoSinBonificar.setEnabled(false);
		lblEuroMesFijoSinBonificar.setText("e/mes");
		lblEuroMesFijoSinBonificar.setBounds(115, 183, 116, 17);

		//etiqueta "Fijo bonificado"
		lblFijoBonificado = new Label(grpDatosHipoteca, SWT.NONE);
		lblFijoBonificado.setEnabled(false);
		lblFijoBonificado.setText("Fijo bonificado");
		lblFijoBonificado.setBounds(285, 157, 108, 17);
		
		//texto "Fijo bonificado"
		textFijoBonificado = new Text(grpDatosHipoteca, SWT.BORDER);
		textFijoBonificado.setEnabled(false);
		textFijoBonificado.setEditable(false);
		textFijoBonificado.setBounds(285, 181, 71, 20);
		
		//etiqueta "Variable sin bonificar"
		lblVariableSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblVariableSinBonificar.setEnabled(false);
		lblVariableSinBonificar.setText("Variable sin bonificar");
		lblVariableSinBonificar.setBounds(33, 207, 167, 17);
		
		//texto "Variable sin bonificar"
		textVariableSinBonificar = new Text(grpDatosHipoteca, SWT.BORDER);
		textVariableSinBonificar.setEnabled(false);
		textVariableSinBonificar.setEditable(false);
		textVariableSinBonificar.setBounds(33, 226, 71, 20);
		
		//etiqueta euro/mes "Variable sin bonificar"
		lblEuroMesVariableSinBonificar = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesVariableSinBonificar.setEnabled(false);
		lblEuroMesVariableSinBonificar.setText("e/mes");
		lblEuroMesVariableSinBonificar.setBounds(115, 229, 116, 17);
		
		//etiqueta "Variable bonificada"
		lblVariableBonificada = new Label(grpDatosHipoteca, SWT.NONE);
		lblVariableBonificada.setEnabled(false);
		lblVariableBonificada.setText("Variable bonificada");
		lblVariableBonificada.setBounds(285, 207, 135, 17);
		
		//texto "Variable bonificada"
		textVariableBonificada = new Text(grpDatosHipoteca, SWT.BORDER);
		textVariableBonificada.setEnabled(false);
		textVariableBonificada.setEditable(false);
		textVariableBonificada.setBounds(285, 226, 71, 20);
		
		//etiqueta euro/mes "Variable bonificada"
		lblEuroMesVariableBonificada = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesVariableBonificada.setEnabled(false);
		lblEuroMesVariableBonificada.setText("e/mes");
		lblEuroMesVariableBonificada.setBounds(362, 229, 47, 17);
		
		lblEuroMesFijoBonificado = new Label(grpDatosHipoteca, SWT.NONE);
		lblEuroMesFijoBonificado.setEnabled(false);
		lblEuroMesFijoBonificado.setText("e/mes");
		lblEuroMesFijoBonificado.setBounds(362, 183, 47, 17);
		
		
		//button "CALCULAR"
		btnCalcular = new Button(grpDatosHipoteca, SWT.NONE);
		btnCalcular.setEnabled(false);
		btnCalcular.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD | SWT.ITALIC));
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if (comboSeleccionado(comboDescuento, lblDescuento.getText()) &&
						comprovarNumerico(textEdadCliente, lblEdadCliente.getText()) &&
							comprovarNumerico(textAnosHipoteca, lblAnosHipoteca.getText()) &&
								comprovarNumerico(textEuriborActual, lblEuriborActual.getText())) {
					
					tipoDescuento = comboDescuento.getText();;
					edadCliente = obtenerValorAPartirString(textEdadCliente);
					anosHipoteca = obtenerValorAPartirString(textAnosHipoteca);
					euriborActual = obtenerValorAPartirString(textEuriborActual);	
					
					if (comprovarAnosHipoteca()) {
						reseteoMensajesError();
						double resultadoFijoSinBonificar = calculoMensualidad("Fijo sin bonificar");
						textFijoSinBonificar.setText(String.valueOf(resultadoFijoSinBonificar));
						double resultadoFijoBonificado = calculoMensualidad("Fijo bonificado");
						textFijoBonificado.setText(String.valueOf(resultadoFijoBonificado));
						double resultadoVariableSinBonificar = calculoMensualidad("Variable sin bonificar");
						textVariableSinBonificar.setText(String.valueOf(resultadoVariableSinBonificar));
						double resultadoVariableBonificada = calculoMensualidad("Variable bonificada");
						textVariableBonificada.setText(String.valueOf(resultadoVariableBonificada));	
					}
				}
			}
		});
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(314, 42, 89, 34);
		
		//button "RESTABLECER"
		btnRestablecer = new Button(grpDatosHipoteca, SWT.NONE);
		btnRestablecer.setEnabled(false);
		btnRestablecer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				resetearDatosVivienda();
				resetearDatosHipoteca();
				resetearVariables();
				reseteoMensajesError();
				
				activarDatosVivienda(true);
				activarDatosHipoteca(false);
			}
		});
		btnRestablecer.setText("RESTABLECER");
		btnRestablecer.setBounds(300, 82, 103, 34);
		

				
		/*
		 * GRUPO ALERTAS
		 */
		grpAlertas = new Group(shlCalculoMensualidadHipoteca, SWT.NONE);
		grpAlertas.setText("Alertas");
		grpAlertas.setBounds(10, 418, 422, 54);
		
		textAlertas = new Text(grpAlertas, SWT.BORDER);
		textAlertas.setEditable(false);
		textAlertas.setBounds(10, 10, 393, 17);
		
	}
	
	/*
	 * MÉTODOS COMPROVACIÓN DATOS
	 */
	//método calcular el 20% del precio de la vivienda
	private double porcientoVivienda(double precioVivienda) {
		double valor = ((precioVivienda / 100) * 20);
		return valor;
	}
	
	//método comprovar que los ahorros aportados son >= al 20% del precio de la vivienda.
	private boolean precioAhorrosOK(double precioVivienda) {
		double porcentajeVivienda = porcientoVivienda(precioVivienda);
		if (ahorrosAportados < porcentajeVivienda) {
			textAlertas.setText("Valor de ahorros aportados < 20% precio vivienda.");
			errorTipoTexto(textAhorrosAportados);
			return false;
		}
		return true;
	}
	
	//método comprovar que el String introducido es numérico 
	private boolean comprovarNumerico(Text objetoText, String tipoTexto) {
		String valor = objetoText.getText();
		String regex = "[0-9]+";
		
		if (!valor.matches(regex)) {
			errorTipoTexto(objetoText);
			textAlertas.setText("El valor de " + tipoTexto + " no es un número positivo.");
			return false;
		} else {
			return true;
		}
	}
	
	//método convertir String en número
	private int obtenerValorAPartirString(Text objetoText) {
		String valor = objetoText.getText();
		int valorInteger = Integer.parseInt(valor);
		return valorInteger;
	}
		
	//método comprovar que se ha seleccionado algo del combo
	private boolean comboSeleccionado(Combo objetoCombo, String tipoCombo) {
		if (objetoCombo.getText() != "") {
			return true;
		}
		errorTipoCombo(objetoCombo);
		textAlertas.setText("Es necesario seleccionar algo en el " + tipoCombo + ".");
		return false;
	}
	
	//método comprovar años hipoteca
	private boolean comprovarAnosHipoteca() {
		if(tipoResidencia.equals("Vivienda habitual") && anosHipoteca > 30) {
			textAlertas.setText("Los años de hipoteca no pueden ser > 30.");
			errorTipoTexto(textAnosHipoteca);
			return false;
		}
		if(tipoResidencia.equals("Segunda residencia") && anosHipoteca > 25) {
			textAlertas.setText("Los años de hipoteca no pueden ser > 25.");
			errorTipoTexto(textAnosHipoteca);
			return false;
		}
		if((edadCliente + anosHipoteca) > 75) {
			textAlertas.setText("La edad del cliente + años hipoteca no puede ser > 75.");
			errorTipoTexto(textAnosHipoteca);
			return false;
		}
		reseteoMensajesError();
		return true;
	}
	
	//método calcular mensualidad
	private double calculoMensualidad(String tipoHipoteca) {
		
		double interes = obtenerInteres(tipoHipoteca);
				
		double valor1 = 1+(interes/12);
		
		double valor2 = -(anosHipoteca*12);
				
		double valor3 = Math.pow(valor1, valor2);
				
		double resultadoFormula = (1-valor3) / (interes/12);
		
		double resultado = (precioVivienda - ahorrosAportados) / resultadoFormula;
		
		return resultado;
	}
	
	//método obtener interes
	private double obtenerInteres(String tipoHipoteca) {
		double interes = 0.0;
		double valorTipoDescuento = 0.0;
		
		if (tipoDescuento.equals("Funcionario")) {
			valorTipoDescuento = FUNCIONARIO;
		} else if (tipoDescuento.equals("Menor de 35 años")) {
			valorTipoDescuento = MENORES_35;
		} else if (tipoDescuento.equals("Colectivos especiales")) {
			valorTipoDescuento = COLECTIVOS_ESPECIALES;
		} else if (tipoDescuento.equals("Ninguno")) {
			valorTipoDescuento = NINGUNO;
		}
		
		if (tipoHipoteca.equals("Fijo sin bonificar")) {
			interes = valorTipoDescuento + FIJO_SIN_BONIFICAR;
		} else if (tipoHipoteca.equals("Fijo bonificado")) {
			interes = valorTipoDescuento + FIJO_BONIFICADO;
		} else if (tipoHipoteca.equals("Variable sin bonificar")) {
			interes = valorTipoDescuento + VARIABLE_SIN_BONIFICAR;
		} else if (tipoHipoteca.equals("Variable bonificada")) {
			interes = valorTipoDescuento + VARIABLE_BONIFICADA;
		}

		return interes;
	}
	
	
	/*
	 * MÉTODOS MENSAJES ERROR
	 */
	
	private void errorTipoTexto(Text objetoTextoEquivocado) {
		objetoTextoEquivocado.selectAll();
		objetoTextoEquivocado.setFocus();
	}
	
	private void errorTipoCombo(Combo objetoComboEquivocado) {
		objetoComboEquivocado.setFocus();
	}
	
	private void reseteoMensajesError() {
		textAlertas.setText("");
	}
	
	
	/*
	 * MÉTODOS ACTIVAR / DESACTIVAR ELEMENTOS
	 */
	//método activar/desactivar elementos del grupo "Datos Hipoteca"
	private void activarDatosVivienda(boolean opcionGrupoDatosVivienda) {
		
		grpDatosVivienda.setEnabled(opcionGrupoDatosVivienda);
		lblPrecioVivienda.setEnabled(opcionGrupoDatosVivienda);
		textPrecioVivienda.setEnabled(opcionGrupoDatosVivienda);
		lblEuroPrecioVivienda.setEnabled(opcionGrupoDatosVivienda);
		lblAhorrosAportados.setEnabled(opcionGrupoDatosVivienda);
		textAhorrosAportados.setEnabled(opcionGrupoDatosVivienda);
		lblEuroAhorrosAportados.setEnabled(opcionGrupoDatosVivienda);
		lblTipoResidencia.setEnabled(opcionGrupoDatosVivienda);
		comboTipoResidencia.setEnabled(opcionGrupoDatosVivienda);
		btnAceptar.setEnabled(opcionGrupoDatosVivienda);
		
	}
	
	//método activar/desactivar elementos del grupo "Datos Hipoteca"
	private void activarDatosHipoteca(boolean opcionGrupoDatosHipoteca) {
		
		grpDatosHipoteca.setEnabled(opcionGrupoDatosHipoteca);
		lblDescuento.setEnabled(opcionGrupoDatosHipoteca);
		comboDescuento.setEnabled(opcionGrupoDatosHipoteca);
		lblEdadCliente.setEnabled(opcionGrupoDatosHipoteca);
		textEdadCliente.setEnabled(opcionGrupoDatosHipoteca);
		lblAnosHipoteca.setEnabled(opcionGrupoDatosHipoteca);
		textAnosHipoteca.setEnabled(opcionGrupoDatosHipoteca);
		lblEuriborActual.setEnabled(opcionGrupoDatosHipoteca);
		textEuriborActual.setEnabled(opcionGrupoDatosHipoteca);
		lblPorcentageEuriborActual.setEnabled(opcionGrupoDatosHipoteca);
		btnCalcular.setEnabled(opcionGrupoDatosHipoteca);
		btnRestablecer.setEnabled(opcionGrupoDatosHipoteca);
		lblPosiblesHipotecas.setEnabled(opcionGrupoDatosHipoteca);
		lblFijoSinBonificar.setEnabled(opcionGrupoDatosHipoteca);
		textFijoSinBonificar.setEnabled(opcionGrupoDatosHipoteca);
		lblEuroMesFijoSinBonificar.setEnabled(opcionGrupoDatosHipoteca);
		lblFijoBonificado.setEnabled(opcionGrupoDatosHipoteca);
		textFijoBonificado.setEnabled(opcionGrupoDatosHipoteca);
		lblVariableSinBonificar.setEnabled(opcionGrupoDatosHipoteca);
		textVariableSinBonificar.setEnabled(opcionGrupoDatosHipoteca);
		lblEuroMesVariableSinBonificar.setEnabled(opcionGrupoDatosHipoteca);
		lblVariableBonificada.setEnabled(opcionGrupoDatosHipoteca);
		textVariableBonificada.setEnabled(opcionGrupoDatosHipoteca);
		lblEuroMesVariableBonificada.setEnabled(opcionGrupoDatosHipoteca);
		
	}
	
	/*
	 * MÉTODOS RESETEAR DATOS GRUPOS
	 */
	//método resetear datos grupo Datos Vivienda
	private void resetearDatosVivienda() {
		textPrecioVivienda.setText("");
		textAhorrosAportados.setText("");
		comboTipoResidencia.setText("");		
	}
	
	//método resetear datos grupo Datos Hipoteca
	private void resetearDatosHipoteca() {
		comboDescuento.setText("");
		textEdadCliente.setText("");
		textAnosHipoteca.setText("");
		textEuriborActual.setText("");
		textFijoSinBonificar.setText("");
		textFijoBonificado.setText("");
		textVariableSinBonificar.setText("");
		textVariableBonificada.setText("");
	}
	
	//método resetear variables
	private void resetearVariables() {
		precioVivienda = 0.0;
		ahorrosAportados = 0.0;
		tipoResidencia = "";
		
		tipoDescuento = "";
		edadCliente = 0;
		anosHipoteca = 0;
		euriborActual = 0.0;
	}
}
