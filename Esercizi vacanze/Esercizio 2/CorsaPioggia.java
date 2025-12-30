public class CorsaPioggia extends Corsa {
    private final int intensitaPioggia;
    public CorsaPioggia(String atleta, double distanza, int tempoMinuti, int intensitaPioggia) {
        super(atleta, distanza, tempoMinuti);
        this.intensitaPioggia = intensitaPioggia;
    }

    public int getIntensitaPioggia() {
        return intensitaPioggia;
    }

    @Override
    public double calcolaPunteggio(){
        double punteggio = super.calcolaPunteggio();
        if (intensitaPioggia > 5){
            punteggio = punteggio * 1.5;
        }
        return punteggio;
    }

    @Override
    public String toString(){
        return super.toString() + " [Pioggia intensità " + intensitaPioggia + "]";
    }
    
}