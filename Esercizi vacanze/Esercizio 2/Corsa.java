public class Corsa {
    static int contatoreId = 10001;
    private final int id;
    private final String atleta;
    private final double distanza;
    private final int tempoMinuti;
    public Corsa(String atleta, double distanza, int tempoMinuti) {
        this.id = contatoreId++;
        this.atleta = atleta;
        this.distanza = distanza;
        this.tempoMinuti = tempoMinuti;
    }

    public int getId() {
        return id;
    }

    public String getAtleta() {
        return atleta;
    }

    public double getDistanza() {
        return distanza;
    }

    public int getTempoMinuti() {
        return tempoMinuti;
    }

    public double calcolaPunteggio(){
        return distanza * 10;
    }

    @Override
    public String toString(){
        return "[ID: " + id + "] " + atleta + " - " + distanza + " km in " + tempoMinuti + " min (Punteggio: " + calcolaPunteggio() + ")";
    }

    public double calcolaRitmo(){
        return tempoMinuti / distanza;
    }
}