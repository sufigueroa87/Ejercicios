import java.awt.*;
import java.util.Scanner;

public class Pixel {

    Scanner keyboard = new Scanner(System.in);

    //Atributos
    private int x;
    private int y;
    private ColorRGB color;

    //Constructor
    public Pixel(int x, int y, int r, int g, int b) throws ColorRGBException {
        this.x = x;
        this.y = y;
        this.color = new ColorRGB(r, g, b);
        System.out.print("Se ha construido bien el objeto pixel.");
    }

    //Getters · Obtener
    //obtenerPosicion()
    public int[] obtenerPosicion(){
        int[] valoresPosicion = {obtenerPosicionX(), obtenerPosicionY()};
        return valoresPosicion;
    }

    //obtenerPosicionX()
    public int obtenerPosicionX(){
        return x;
    }

    //obtenerPosicionY()
    public int obtenerPosicionY(){
        return y;
    }

    //obtenerColor()
    public int[] obtenerColor(){
        int[] listadoRGB = {obtenerColorR(), obtenerColorG(), obtenerColorB()};
        return listadoRGB;
    }

    //obtenerColorR()
    public int obtenerColorR(){
        return color.obtenerColorR();
    }

    //obtenerColorG()
    public int obtenerColorG(){
        return color.obtenerColorG();
    }

    //obtenerColorB()
    public int obtenerColorB(){
        return color.obtenerColorB();
    }


    //Setters · Asignar
    //asignarPosicion(int x, int y)
    public void asignarPosicion(int x, int y){
        asignarPosicionX(x);
        asignarPosicionY(y);
    }

    //asignarPosicionX(int x)
    public void asignarPosicionX(int x){
        this.x = x;
    }

    //asignarPosicionY(int y)
    public void asignarPosicionY(int y){
        this.y = y;
    }

    //asignarColor(int r, int g, int b)
    public void asignarColor(int r, int g, int b) throws ColorRGBException {
        color.asignarColor(r, g, b);
    }

    //asignarColorR(int r)
    public void asignarColorR(int r) throws ColorRGBException {
        color.asignarColorR(r);
    }

    //asignarColorG(int g)
    public void asignarColorG(int g) throws ColorRGBException {
        color.asignarColorG(g);
    }

    //asignarColorB(int b)
    public void asignarColorB(int b) throws ColorRGBException {
        color.asignarColorB(b);
    }
}
