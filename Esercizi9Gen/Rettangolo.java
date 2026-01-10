package Esercizi9Gen;

public class Rettangolo extends Quadrilatero{
    protected int larghezza;
    protected int altezza;
    public Rettangolo(Punto puntoA, int larghezza, int altezza) {
        super(puntoA, new Punto(puntoA.x + larghezza, puntoA.y), new Punto(puntoA.x + larghezza, puntoA.y + altezza), new Punto(puntoA.x, puntoA.y + altezza));
    }
    
    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }
    
    public double getArea(){
        return larghezza * altezza;
    }

    @Override
    public String toString(){
        return "Rettangolo: " + super.toString();
    }
}
