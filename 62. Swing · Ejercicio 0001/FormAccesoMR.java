package _62_Interfaces_Graficas_Swing.Ejercicio0001;


//Swing usa el modelo vista controlador, para que si hacemos cambios en el modelo, en la vista o en el controlador,
//no se vean afectados los demás por dichos cambios. En realidad en Swing el controlador y la vista están agrupados
//en una entidad llamada UI delegate, porque una separación muy grande de la vista y el controlador no es beneficiosa
//para Swing.

//Todas las clases de Swing heredan de 2 clases: java.awt.Component y java.awt.Container. Por tanto, Swing está construida
//por encima de AWT, no la está reemplazando.

//Los controles son los componentes con los que el usuario interactúa directanebte: en esta aplicación los JButton y
//el JLabel.

//Los contenedores son los componentes que no tienen una función directa de interacción con el usuario. Sirven
//para meter y organizar dentro de cualquier componente, tanto de controles como contenedores: en esta aplicación
//sería JFrame.

//Un contenedor puede tener dentro de sí controles y contenedores. En cambio un control no puede tener dentro de sí ni
//controles ni contenedores.

//En Swing, para lograr que siempre se vea bien la interfaz, usamos un layout, que son tipos de políticas de ubicación
//de componentes y de redimensionado. En esta aplicación, usaremos GridLayout, con 0 filas y 1 columna.
import java.awt.GridLayout;

//Hemos importado la clase java.awt.event porque la necesitamos para definir la interfaz ActionListener y la clase ActionEvent.

//Usamos la clase ActionEvent para representar el tipo de interacción más estándar que puede realizar el usuario
//sobre un control. En esta aplicación, necesitamos ActionEvent porque el usuario interactúa con la aplicación
//apretando un objeto de tipo JButton. Si por ejemplo la interacción del usuario estuviese relacionada con el
//ratón, en vez de usar la clase ActionEvent usaríamos MouseEvent. etc.
import java.awt.event.ActionEvent;

//Los objetos de tipo Listener son necesarios para poder capturar los eventos que se den por las interacciones
//del usuario con la aplicación. En este caso, como el evento que se genera al pulsar un button es de tipo ActionEvent,
//necesitamos importar la interfaz del mismo tipo, ActionListener. De nuevo, si la interacción del usuario estuviese
//relacionada con el ratón, en vez de importar esta clase importaríamos MouseListener. etc.
import java.awt.event.ActionListener;

//Para importar los tipos de controles: en esta aplicación: JLabel, JButton y utilidades de Swing.
import javax.swing.*;

//Cuando el usuario interacciona con los componentes de Swing, se generan eventos.
public class FormAccesoMR implements ActionListener {

    public static void main(String[] args) {

        //Habilitamos el código GUI creado en el event dispatching thread,
        //en este caso usando el método invokeLater(Runnable obj), que
        //devuelve inmediatamente sin esperar.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormAccesoMR();
            }
        });

    }

    private final int ANCHO = 400;
    private final int ALTO = 200;
    private final String PREGUNTA = "La atracción tiene acceso de movilidad reducida?";

    //Contenedor de alto nivel (top-level): cima de la jerarquía de contenedores
    private JFrame ventana;

    //Display de la pregunta
    private JLabel pregunta;

    //botón si
    private JButton si;

    //botón no
    private JButton no;

    private boolean respuesta;

    public FormAccesoMR() {

        //Creamos un nuevo JFrame contenedor top-level, que contendrá todos los demás componentes.
        ventana = new JFrame("Acceso de movilidad reducida");

        //Especificamos GridLayout para el layout manager. Por tanto, el tipos de políticas de ubicación
        //de componentes y de redimensionado corresponderá a las específicas de GridLayout.
        ventana.setLayout(new GridLayout(0, 1));

        //Creación de la etiqueta
        pregunta = new JLabel(PREGUNTA);

        //Creación de los botones
        si = new JButton("Sí");
        no = new JButton("No");

        //Añado la pregunta a la ventana
        ventana.add(pregunta);

        //Añadimos los botones a la ventana
        ventana.add(si);
        ventana.add(no);

        //Visualizar ventana
        showVentana();

        //añadimos los objetos Listeners a los buttons
        anadirListenerBotones();

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


    //Cuando el usuario interacciona con los componentes de Swing, se generan eventos que tiene que ser recogidos por
    //el event handling, a través de un objeto de tipo Listener.
    //Como la interacción consiste en apretar un button, usaremos el tipo de Listener llamado ActionListener, que
    //es el que se encarga de recoger este tipo de evento. Si no pusieramos un objeto Listener del tipo específico
    //en el control (en este caso a cada button), el evento creado por la interacción del usuario con la GUI al apretar
    //el button se ignoraría.
    public void anadirListenerBotones() {

        //añado el listener al button si
        si.addActionListener(this);

        //añado el listener al button no
        no.addActionListener(this);
    }


    //Cuando el usuario clica al botón inmediatamente se produce la llamada al método actionPerformed (si tiene
    //un objeto de tipo ActionListener asignado.
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource().equals(si)){
            respuesta = true;
            System.out.println("Has apretado el button si.");
        } else {
            respuesta = false;
            System.out.println("Has apretado el button no.");
        }
    }
}
