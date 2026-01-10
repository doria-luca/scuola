package Esercizi9Gen;

public class Punto {
    protected int x;
    protected int y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Punto trasla(Direzione direzione, int distanza){
        x += direzione.getDx() * distanza;
        y += direzione.getDy() * distanza;
        return this;
    }

    @Override
    public String toString(){
        return "[x: " + x + " - y: " + y + "]";
    }

    public double distanza(Punto p){
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public boolean equals(Punto p){
        if(!(this.x == p.x)){
            return false;
        }
        if(!(this.y == p.y)){
            return false;
        }
        return true;    
    }
}
