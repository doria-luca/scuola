public class CorsaMontagna extends Corsa {
    private final double dislivello;
    public CorsaMontagna(String atleta, double distanza, int tempoMinuti, double dislivello) {
        super(atleta, distanza, tempoMinuti);
        this.dislivello = dislivello;
    }

    public double getDislivello() {
        return dislivello;
    }

    @Override
    public double calcolaPunteggio(){
        return super.calcolaPunteggio() + (dislivello * 2);
    }

    @Override
    public String toString(){
        return super.toString() + " [Montagna +" + dislivello + "m]";
    }      
}