/*

Pasos a seguir una vez instalado WindowBuilderPro en Eclipse:

Creamos el proyecto para que use WindowBuilderPro : 
  File -> New -> Other -> SWT -> SWT/JFace Java Project
Creamos una ventana de tipo SWT:
  Seleccionamos src (botón derecho) -> New -> Other -> Application Window
  
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import java.time.Year;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.events.HelpEvent;


public class Ej_68_wb_Ejercicio0001 {

	protected Shell shlFigueroaAssegurances;
	private Group grpDadesClient;
	private Label lblAnyNaixement;
	private Label lblFumador;
	private Label lblProfessioRisc;
	private Text textAnyNaixement;
	private Button btnBotoAcceptar;
	private Combo comboProfessioRisc;
	private Combo comboFumador;
	private Group grpDadesAsseguranca;
	private Label lblQuantitatAAssegurar;
	private Text textQuantitatAAssegurar;
	private Label lblTipusAsseguranca;
	private Combo comboTipusAsseguranca;
	private Button btnBotoRestablir;
	private Button btnBotoCalcular;
	private Label barraSeparadora;
	private Label lblTitolPreus;
	private Label lblTitolSemestral;
	private Label lblTitolMensual;
	private Label lblTitolAnual;
	private Text textResultatMensual;
	private Text textResultatSemestral;
	private Text textResultatAnual;
	private Group grpMissatgesError;
	private Text textVisualitzarErrors;
	private Label lblSimbolEuroMensual;
	private Label lblSimbolEuroSemestral;
	private Label lblSimbolEuroAnual;
	private String missatgeError;
	private Label lblEuroQuantitatAsseguranca;

	int edat;
	int quantitatAssegurancaIntroduida;
	double factorEdat;
	double factorFumador;
	double factorProfessio;
	double factorTipusAsseguranca;
	double anualitat;
	double semestralitat;
	double mensualitat;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FigueroaAssegurances window = new FigueroaAssegurances();
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
		shlFigueroaAssegurances.open();
		shlFigueroaAssegurances.layout();
		while (!shlFigueroaAssegurances.isDisposed()) {
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
		shlFigueroaAssegurances = new Shell();
		shlFigueroaAssegurances.setBackground(SWTResourceManager.getColor(245, 245, 245));
		shlFigueroaAssegurances.setSize(571, 631);
		shlFigueroaAssegurances.setText("FIGUEROA Assegurances");	
		
		
		/*
		 * GRUP DADES CLIENT
		 */
		//grup Dades Client
		grpDadesClient = new Group(shlFigueroaAssegurances, SWT.NONE);
		grpDadesClient.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		grpDadesClient.setText("Dades Client");		
		grpDadesClient.setBounds(10, 10, 542, 174);
		
		//etiqueta Any Naixement
		lblAnyNaixement = new Label(grpDadesClient, SWT.NONE);
		lblAnyNaixement.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblAnyNaixement.setBounds(10, 17, 116, 17);
		lblAnyNaixement.setText("Any naixement:");
		
		//text omplir Any Naixement
		textAnyNaixement = new Text(grpDadesClient, SWT.CURSOR_SIZEALL | SWT.BORDER);
		textAnyNaixement.setToolTipText("Introdueix l'any de naixement del client. No pot ser menor a 18 anys ni superior a 69 anys.");
		textAnyNaixement.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		textAnyNaixement.setBounds(185, 9, 211, 34);
		
		//etiqueta Fumador
		lblFumador = new Label(grpDadesClient, SWT.NONE);
		lblFumador.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblFumador.setBounds(10, 68, 158, 17);
		lblFumador.setText("Fumador/a habitual:");
		
		//combo seleccionar Fumador
		comboFumador = new Combo(grpDadesClient, SWT.READ_ONLY);
		String[] opcionsFumador = new String[]{"sí", "no"};
		comboFumador.setItems(opcionsFumador);
		comboFumador.setBounds(185, 60, 211, 34);
		
		//etiqueta Professió de Risc
		lblProfessioRisc = new Label(grpDadesClient, SWT.NONE);
		lblProfessioRisc.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblProfessioRisc.setBounds(10, 120, 126, 17);
		lblProfessioRisc.setText("Professió de risc:");

		//combo seleccionar Professió de Risc
		comboProfessioRisc = new Combo(grpDadesClient, SWT.READ_ONLY);
		String[] opcionsProfessioRisc = new String[] {"risc baix", "risc moderat", "risc alt"};
		comboProfessioRisc.setItems(opcionsProfessioRisc);
		comboProfessioRisc.setBounds(185, 110, 211, 34);
		
		//botó Acceptar
		btnBotoAcceptar = new Button(grpDadesClient, SWT.BORDER);
		btnBotoAcceptar.setAlignment(SWT.CENTER);
		btnBotoAcceptar.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnBotoAcceptar.setBounds(424, 36, 89, 34);
		//btnBotoAcceptar.setBackground(SWTResourceManager.getColor(192, 192, 192));
		btnBotoAcceptar.setText("ACCEPTAR");
		btnBotoAcceptar.setBackground(SWTResourceManager.getColor(211, 215, 207));

		btnBotoAcceptar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int valorAny = esNumeric(textAnyNaixement);
				if (valorAny != -1 && edatCorrecte(calcularEdat(valorAny))) {
					boolean okComboRisc = comboSeleccionat(comboProfessioRisc);
					boolean okComboFumador = comboSeleccionat(comboFumador);
					if (!okComboRisc | !okComboFumador) {
						textVisualitzarErrors.setText(missatgeError);
					} else {
						habilitarDadesClient(false);
						habilitarDadesAsseguranca(true);
					}
				} else {
					reaccioErrorFocusSeleccio(textAnyNaixement);
					textVisualitzarErrors.setText(missatgeError);
				}
			}
		});		
		
		
		/*
		 * GRUP DADES ASSEGURANÇA
		 */
		//grup Dades Assegurança
		grpDadesAsseguranca = new Group(shlFigueroaAssegurances, SWT.NONE);
		grpDadesAsseguranca.setEnabled(false);
		grpDadesAsseguranca.setText("Dades Assegurança");
		grpDadesAsseguranca.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		grpDadesAsseguranca.setBounds(10, 190, 542, 310);
		
		//etiqueta Quantitat a Assegurar
		lblQuantitatAAssegurar = new Label(grpDadesAsseguranca, SWT.NONE);
		lblQuantitatAAssegurar.setEnabled(false);
		lblQuantitatAAssegurar.setText("Quantitat a assegurar:");
		lblQuantitatAAssegurar.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblQuantitatAAssegurar.setBounds(10, 17, 158, 17);
		
		//text omplir Quantitat a Assegurar
		textQuantitatAAssegurar = new Text(grpDadesAsseguranca, SWT.CURSOR_SIZEALL | SWT.BORDER);
		textQuantitatAAssegurar.setToolTipText("Introdueix la quantitat a assegurar. La quantitat no pot ser inferior a 50000 euros.");
		textQuantitatAAssegurar.setEnabled(false);
		textQuantitatAAssegurar.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		textQuantitatAAssegurar.setBounds(185, 9, 299, 34);
		
		//etiqueta símbol euro Quantitat Assegurança
		lblEuroQuantitatAsseguranca = new Label(grpDadesAsseguranca, SWT.NONE);
		lblEuroQuantitatAsseguranca.setText("€");
		lblEuroQuantitatAsseguranca.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblEuroQuantitatAsseguranca.setEnabled(false);
		lblEuroQuantitatAsseguranca.setBounds(490, 17, 14, 17);
		
		//etiqueta Tipus Assegurança
		lblTipusAsseguranca = new Label(grpDadesAsseguranca, SWT.NONE);
		lblTipusAsseguranca.setEnabled(false);
		lblTipusAsseguranca.setText("Tipus:");
		lblTipusAsseguranca.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblTipusAsseguranca.setBounds(10, 68, 48, 17);
		
		//combo seleccionar Tipus Assegurança
		comboTipusAsseguranca = new Combo(grpDadesAsseguranca, SWT.NONE);
		String[] llistaTipusAsseguranca = new String[] {"Mort o invalidesa.", "Mort o invalidesa per accident.", "Mort o invalidesa o malaltia greu."};
		comboTipusAsseguranca.setItems(llistaTipusAsseguranca);
		comboTipusAsseguranca.setEnabled(false);
		comboTipusAsseguranca.setBounds(70, 60, 414, 34);
		
		//botó Restablir
		btnBotoRestablir = new Button(grpDadesAsseguranca, SWT.BORDER);
		btnBotoRestablir.setEnabled(false);
		btnBotoRestablir.setAlignment(SWT.CENTER);
		btnBotoRestablir.setText("RESTABLIR");
		btnBotoRestablir.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD | SWT.ITALIC));
		btnBotoRestablir.setBounds(64, 126, 185, 34);
		btnBotoRestablir.setBackground(SWTResourceManager.getColor(211, 215, 207));
		
		btnBotoRestablir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ressetejarDadesRestablir();
			}
		});
		
		//botó Calcular
		btnBotoCalcular = new Button(grpDadesAsseguranca, SWT.BORDER);
		btnBotoCalcular.setEnabled(false);
		btnBotoCalcular.setAlignment(SWT.CENTER);
		btnBotoCalcular.setText("CALCULAR");
		btnBotoCalcular.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD | SWT.ITALIC));
		btnBotoCalcular.setBounds(290, 126, 185, 34);
		btnBotoCalcular.setBackground(SWTResourceManager.getColor(211, 215, 207));
		
		btnBotoCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {							
				if (valorCorrecteTipusAsseguranca(comboTipusAsseguranca)) {
					int quantitatAssegurancaIntro = esNumeric(textQuantitatAAssegurar);
					if (quantitatAssegurancaIntro != -1 && valorCorrecteQuantitatAsseguranca(quantitatAssegurancaIntro, textQuantitatAAssegurar)) {
						quantitatAssegurancaIntroduida = quantitatAssegurancaIntro;
						resseteigMissatgeErrors();
						setResultats();						
					} else {
						textVisualitzarErrors.setText(missatgeError);
					}
				} else {
					textVisualitzarErrors.setText(missatgeError);
				}
			}
		});
		
		//separador
		barraSeparadora = new Label(grpDadesAsseguranca, SWT.SEPARATOR | SWT.HORIZONTAL);
		barraSeparadora.setBounds(0, 179, 540, 1);
		
		//etiqueta títol Preus
		lblTitolPreus = new Label(grpDadesAsseguranca, SWT.NONE);
		lblTitolPreus.setEnabled(false);
		lblTitolPreus.setAlignment(SWT.CENTER);
		lblTitolPreus.setText("PREUS");
		lblTitolPreus.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD | SWT.ITALIC));
		lblTitolPreus.setBounds(246, 196, 48, 17);
		
		//etiqueta títol Mensual
		lblTitolMensual = new Label(grpDadesAsseguranca, SWT.NONE);
		lblTitolMensual.setText("Mensual");
		lblTitolMensual.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblTitolMensual.setEnabled(false);
		lblTitolMensual.setAlignment(SWT.CENTER);
		lblTitolMensual.setBounds(64, 224, 79, 17);
		
		//text resultat Mensual
		textResultatMensual = new Text(grpDadesAsseguranca, SWT.BORDER);
		textResultatMensual.setEditable(false);
		textResultatMensual.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		textResultatMensual.setEnabled(false);
		textResultatMensual.setBounds(54, 247, 99, 34);
		
		//símbol euro Mensual
		lblSimbolEuroMensual = new Label(grpDadesAsseguranca, SWT.NONE);
		lblSimbolEuroMensual.setText("€");
		lblSimbolEuroMensual.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblSimbolEuroMensual.setEnabled(false);
		lblSimbolEuroMensual.setBounds(158, 256, 14, 17);
		
		//etiqueta títol Semestral
		lblTitolSemestral = new Label(grpDadesAsseguranca, SWT.NONE);
		lblTitolSemestral.setAlignment(SWT.CENTER);
		lblTitolSemestral.setText("Semestral");
		lblTitolSemestral.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblTitolSemestral.setEnabled(false);
		lblTitolSemestral.setBounds(232, 224, 79, 17);
		
		//text resultat Semestral
		textResultatSemestral = new Text(grpDadesAsseguranca, SWT.BORDER);
		textResultatSemestral.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		textResultatSemestral.setEnabled(false);
		textResultatSemestral.setEditable(false);
		textResultatSemestral.setBounds(222, 247, 99, 34);
		
		//símbol euro Semestral
		lblSimbolEuroSemestral = new Label(grpDadesAsseguranca, SWT.NONE);
		lblSimbolEuroSemestral.setText("€");
		lblSimbolEuroSemestral.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblSimbolEuroSemestral.setEnabled(false);
		lblSimbolEuroSemestral.setBounds(325, 256, 14, 17);
		
		//etiqueta títol Anual
		lblTitolAnual = new Label(grpDadesAsseguranca, SWT.NONE);
		lblTitolAnual.setEnabled(false);
		lblTitolAnual.setText("Anual");
		lblTitolAnual.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblTitolAnual.setAlignment(SWT.CENTER);
		lblTitolAnual.setBounds(396, 224, 79, 17);

		//text resultat Anual
		textResultatAnual = new Text(grpDadesAsseguranca, SWT.BORDER);
		textResultatAnual.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		textResultatAnual.setEnabled(false);
		textResultatAnual.setEditable(false);
		textResultatAnual.setBounds(387, 247, 99, 34);
		
		//símbol euro Anual
		lblSimbolEuroAnual = new Label(grpDadesAsseguranca, SWT.NONE);
		lblSimbolEuroAnual.setText("€");
		lblSimbolEuroAnual.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		lblSimbolEuroAnual.setEnabled(false);
		lblSimbolEuroAnual.setBounds(490, 256, 14, 17);
		
		
		/*
		 * GRUP MISSATGES D'ERROR
		 */
		//grup mostrar missatges d'error
		grpMissatgesError = new Group(shlFigueroaAssegurances, SWT.NONE);
		grpMissatgesError.setText("Missatges d'error i/o alertes");
		grpMissatgesError.setBounds(10, 506, 542, 72);
		
		//text visualitzar missatges d'error
		textVisualitzarErrors = new Text(grpMissatgesError, SWT.BORDER);
		textVisualitzarErrors.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.NORMAL));
		textVisualitzarErrors.setEditable(false);
		textVisualitzarErrors.setBounds(10, 10, 520, 34);	
	}
	
	
	/*
	 * MÈTODES EDAT
	 */
	//mètode per calcular l'edat de la persona a partir de l'any
	private int calcularEdat(int anyPersona) {
		int anyActual = Year.now().getValue();
		int edat = anyActual - anyPersona;
		return edat;
	}
	
	//mètode per comprovar que la dada és numèrica
	private int esNumeric(Text objecteText) {
		String dadaAAnalitzar = objecteText.getText();
		int valorNumeric = -1;
		try {
			valorNumeric = Integer.parseInt(dadaAAnalitzar);
			resseteigMissatgeErrors();
			return valorNumeric;
		} catch (NumberFormatException e) {
			reaccioErrorFocusSeleccio(objecteText);
			missatgeError = "La dada introduïda no és numèrica.";
		}
		return valorNumeric;
	}
	
	//mètode per determinar si l'edat és inferior a 18 o superior a 70
	private boolean edatCorrecte(int edatAComprovar) {
		boolean esCorrecteEdat = true;
		if (edatAComprovar < 18) {
			missatgeError = "L'edat no pot ser inferior a 18 anys.";
			return false;
		} else if (edatAComprovar >= 70) {
			missatgeError = "L'edat no pot ser superior ni igual a 70.";
			return false;
		}
		edat = edatAComprovar;
		resseteigMissatgeErrors();
		return esCorrecteEdat;
	}
	
	//mètode per saber si s'ha seleccionat el camp combo
	private boolean comboSeleccionat(Combo objecteCombo) {
		if (objecteCombo.getText() == "") {
			reaccioErrorFocusCombo(objecteCombo);
			missatgeError = "S'ha de seleccionar un valor de la llista.";
			return false;
		}
		resseteigMissatgeErrors();
		return true;
	}
	
	
	/*
	 * MÈTODES VISUALITZAR ERRORS
	 */
	//mètode per seleccionar tot el quadre de text que conté la dada i per aumentar el focus
	private void reaccioErrorFocusSeleccio(Text dadaErronea) {
		dadaErronea.selectAll();
		dadaErronea.setFocus();
	}
	
	//mètode per aumentar el focus de la dada combo
	private void reaccioErrorFocusCombo(Combo dadaErronea) {
		dadaErronea.setFocus();
	}
	
	//mètode per ressetejar el missatge d'error
	private void resseteigMissatgeErrors() {
		textVisualitzarErrors.setText("");
	}
	
	
	/*
	 * MÈTODES COMPROVACIONS ASSEGURANÇA
	 */
	//mètode per comprovar que el valor del tipus d'assegurança introduït és correcte
	private boolean valorCorrecteTipusAsseguranca(Combo objecteTipusAsseguranca) {
		for (int i = 0; i < objecteTipusAsseguranca.getItems().length; i++) {
			if (objecteTipusAsseguranca.getItems()[i].equals(objecteTipusAsseguranca.getText())) {
				resseteigMissatgeErrors();
				return true;
			}			
		}
		reaccioErrorFocusCombo(objecteTipusAsseguranca);
		missatgeError = "El tipus d'assegurança introduït no forma part de les possibles opcions.";
		return false;
	}
	
	//mètode per comprovar que la quantitat de l'assegurança és correcte
	private boolean valorCorrecteQuantitatAsseguranca(int quantitatAssegurancaIntroduida, Text objecteTextDada) {
		if (quantitatAssegurancaIntroduida < 50_000) {
			reaccioErrorFocusSeleccio(objecteTextDada);
			missatgeError = "La quantitat a assegurar no pot ser menor a 50000 euros.";
			return false;
		}
		resseteigMissatgeErrors();
		return true;
	}
	
	
	/*
	 * MÈTODES PER CALCULAR L'ANUALITAT I LA SEMESTRALITAT I MENSUALITAT
	 */	
	//settejar dades a les pestanyes d'anual, mensual i semestral
	private void setResultats() {
		carregarDades();
		calcularAnualitat();
		calcularMensualitat();
		calcularSemestralitat();
		textResultatAnual.setText((Math.round(anualitat*100d)/100d) + "");
		textResultatMensual.setText((Math.round(mensualitat*100d)/100d) + "");
		textResultatSemestral.setText((Math.round(semestralitat*100d)/100d) + "");
	}
	
	//mètode calcular mensualitat
	private void calcularMensualitat() {
		mensualitat = (anualitat/12)*1.10;
	}
	
	//mètode calcular semestralitat
	private void calcularSemestralitat() {
		semestralitat = (anualitat/2)*1.05; 
	}
	
	//mètode calcular anualitat
	private double calcularAnualitat() {
		anualitat = (quantitatAssegurancaIntroduida * factorEdat * factorFumador * factorProfessio * factorTipusAsseguranca) / ((70 - edat) * 10);
		return anualitat;
	}
	
	//carregar dades
	private void carregarDades() {
		obtenirFactorEdat();
		obtenirFactorFumador();
		obtenirFactorProfessio();
		factorTipusAsseguranca();
	}
	
	//mètode obtenir factor edat
	private double obtenirFactorEdat() {
		if (edat >= 18 && edat < 40) {
			factorEdat = 0.9;
		} else if (edat >= 40 && edat < 55) {
			factorEdat = 1.0;
		} else if (edat >= 55) {
			factorEdat = 1.1;
		}
		return factorEdat;
	}
	
	//mètode obtenir factorFumador
	private double obtenirFactorFumador() {
		if (comboFumador.getText().equals("sí")) {
			factorFumador = 1.1;
		} else {
			factorFumador = 0.9;
		}
		return factorFumador;
	}
	
	//mètode obtenir factorProfessio
	private double obtenirFactorProfessio() {
		String seleccionatProfessioRisc = comboProfessioRisc.getText();
		if (seleccionatProfessioRisc.equals("risc moderat")) {
			factorProfessio = 1.05;
		} else if (seleccionatProfessioRisc.equals("risc alt")) {
			factorProfessio = 1.1;
		} else if (seleccionatProfessioRisc.equals("risc baix")) {
			factorProfessio = 0.95;
		}
		return factorProfessio;
	}
	
	//mètode obtenir factorTipusAssegurança
	private double factorTipusAsseguranca() {
		String seleccionatTipusAsseguranca = comboTipusAsseguranca.getText();
		if (seleccionatTipusAsseguranca.equals("Mort o invalidesa per accident.")) {
			factorTipusAsseguranca = 1.5;
		} else if (seleccionatTipusAsseguranca.equals("Mort o invalidesa o malaltia greu.")) {
			factorTipusAsseguranca = 1.1;
		} else if (seleccionatTipusAsseguranca.equals("Mort o invalidesa.")) {
			factorTipusAsseguranca = 1;
		}
		return factorTipusAsseguranca;
	}
	
	/*
	 * MÈTODES RESTABLIR
	 */
	//mètode per ressetejar les dades
	private void ressetejarDadesRestablir() {
		ressetejarDadesClient();
		ressetejarDadesTextCombo();
		habilitarDadesAsseguranca(false);
		habilitarDadesClient(true);
	}
	
	//mètode per ressetejar dades del client guardades a variables
	private void ressetejarDadesClient() {
		edat = 0;
		quantitatAssegurancaIntroduida = 0;
		factorEdat = 0.0;
		factorFumador = 0.0;
		factorProfessio = 0.0;
		factorTipusAsseguranca = 0.0;
		anualitat = 0.0;
		semestralitat = 0.0;
		mensualitat = 0.0;
	}
	
	//mètode per ressetejar el text dels objectes de tipu Test i Combo
	private void ressetejarDadesTextCombo() {
		resseteigMissatgeErrors();
		textAnyNaixement.setText("");
		comboFumador.setText("");
		comboProfessioRisc.setText("");
		textQuantitatAAssegurar.setText("");
		comboTipusAsseguranca.setText("");
		textResultatMensual.setText("");
		textResultatSemestral.setText("");
		textResultatAnual.setText("");
	}
	
	/*
	 * MÈTODES HABILITAR/DESHABILITAR
	 */
	//mètode deshabilitar o habilitar assegurança
	private void habilitarDadesAsseguranca(boolean eleccio) {
		grpDadesAsseguranca.setEnabled(eleccio);
		lblQuantitatAAssegurar.setEnabled(eleccio);
		textQuantitatAAssegurar.setEnabled(eleccio);
		lblEuroQuantitatAsseguranca.setEnabled(eleccio);
		lblTipusAsseguranca.setEnabled(eleccio);
		comboTipusAsseguranca.setEnabled(eleccio);
		btnBotoRestablir.setEnabled(eleccio);
		btnBotoCalcular.setEnabled(eleccio);
		barraSeparadora.setEnabled(eleccio);
		lblTitolPreus.setEnabled(eleccio);
		lblTitolMensual.setEnabled(eleccio);
		textResultatMensual.setEnabled(eleccio);
		lblTitolSemestral.setEnabled(eleccio);
		textResultatSemestral.setEnabled(eleccio);
		lblTitolAnual.setEnabled(eleccio);
		textResultatAnual.setEnabled(eleccio);
		lblSimbolEuroMensual.setEnabled(eleccio);
		lblSimbolEuroSemestral.setEnabled(eleccio);
		lblSimbolEuroAnual.setEnabled(eleccio);
	}
	
	//mètode deshabilitar o habilitar dades clients
	private void habilitarDadesClient(boolean eleccio) {
		grpDadesClient.setEnabled(eleccio);
		lblAnyNaixement.setEnabled(eleccio);
		textAnyNaixement.setEnabled(eleccio);
		lblFumador.setEnabled(eleccio);
		comboFumador.setEnabled(eleccio);
		lblProfessioRisc.setEnabled(eleccio);
		comboProfessioRisc.setEnabled(eleccio);
		btnBotoAcceptar.setEnabled(eleccio);
	}
}
