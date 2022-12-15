package tabuleiro;

public abstract class Navio {
    public final int tamanhoNavio;
    public final String nomeNavio;

    public Navio(int tamanhoNavio, String nomeNavio) {
        this.tamanhoNavio = tamanhoNavio;
        this.nomeNavio = nomeNavio;
    }
}
