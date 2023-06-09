package _62_Interfaces_Graficas_Swing.Ejercicio0002;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormMatricula implements ActionListener {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormMatricula();
            }
        });
    }

    private final int ANCHO = 250;
    private final int ALTO = 200;
    private JFrame ventana;
    private JLabel lMatricula;
    private JTextField tMatricula;
    private JButton matricular;
    public FormMatricula(){

        //Creamos un nuevo JFrame contenedor top-level, que contendrá todos los demás componentes.
        ventana = new JFrame("Matriculación barco");

        //Especificamos GridLayout para el layout manager. Por tanto, el tipos de políticas de ubicación
        //de componentes y de redimensionado corresponderá a las específicas de GridLayout.
        ventana.setLayout(new GridLayout(0, 1));

        //Creación de la etiqueta
        lMatricula = new JLabel("");

        //Creación de los botones
        matricular = new JButton("Matricular");

        //Creación del campo de texto
        tMatricula = new JTextField("7º-PM-1-01-11");

        //Añadimos la etiqueta a la ventana
        ventana.add(lMatricula);

        //Añado el texto a la ventana
        ventana.add(tMatricula);

        //Añadimos los botones a la ventana
        ventana.add(matricular);

        //Visualizar ventana
        showVentana();

        //añadimos los objetos Listeners a los buttons
        anadirListenerButton();

    }

    //visualizar la ventana
    private void showVentana() {

        //Otorgamos medidas al frame inicial.
        ventana.setSize(ANCHO, ALTO);

        //Terminamos el programa cuando el usuario cierra la aplicación.
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Hacemos que la ventana sea visible.
        ventana.setVisible(true);
    }

    //añado listener al button
    public void anadirListenerButton(){

        //añado el listener al button matricular
        matricular.addActionListener(this);

    }

    //método actionPerformed que se ejecuta cuando el usuario clica un button
    public void actionPerformed(ActionEvent evento) {
        Barco nuevoBarco = new Barco(null, "Barco", 13.5F, 4);
        System.out.println("matricula:" + tMatricula.getText());
        nuevoBarco.setMatricula(tMatricula.getText());

        System.out.println("Matrícula del nuevo Barco: " + nuevoBarco.getMatricula());
    }

}
