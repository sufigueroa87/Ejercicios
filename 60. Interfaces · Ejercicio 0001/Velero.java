package _60_Interfaces.Ejercicio0001;

public class Velero extends Barco {

    int velas; //Total de velas

    public Velero(String nombre, float eslora, int cabinas, int velas) {
        super(nombre, eslora, cabinas);
        this.velas = velas;
    }

    public int getVelas() {
        return velas;
    }

    public void setVelas(int velas) {
        this.velas = velas;
    }

    @Override
    public String toString() {
        return super.toString() + ", velas=" + velas + ".";
        };
    }