package Esercizi9Gen;

public class Trapezio extends Quadrilatero {
    protected int baseMinore;
    protected int baseMaggiore;
    protected int altezza;
    protected int offset;
    public Trapezio(Punto puntoA, int baseMaggiore, int baseMinore, int altezza, int offset) {
        super(puntoA, new Punto(puntoA.getX() + baseMaggiore, puntoA.getY()), new Punto(puntoA.getX() + offset + baseMinore, puntoA.getY() + altezza), new Punto(puntoA.getX() + offset, puntoA.getY() + altezza));
    }
    public Trapezio(Punto puntoA, int baseMinore, int baseMaggiore, int altezza) {
        super(puntoA, new Punto(puntoA.getX() + baseMaggiore, puntoA.getY()), new Punto(puntoA.getX() + baseMinore, puntoA.getY() + altezza), new Punto(puntoA.getX(), puntoA.getY() + altezza));
    }

    public int getBaseMinore() {
        return baseMinore;
    }

    public int getBaseMaggiore() {
        return baseMaggiore;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getOffset() {
        return offset;
    }

    public double getArea(){
        return ((baseMaggiore + baseMinore) * altezza) / 2;
    }
}