package Esercizi9Gen;

public enum Direzione {
    SU(0, 1),
    GIU(0, -1),
    DESTRA(1, 0),
    SINISTRA(-1, 0);
    private final int dx;
    private final int dy;
    Direzione(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}