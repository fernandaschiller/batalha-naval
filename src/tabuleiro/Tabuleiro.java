package tabuleiro;

import java.util.Random;

public class Tabuleiro {

    public final int TAMANHO_TABULEIRO = 10;

    private final Posicao[][] tabuleiro = new Posicao[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

    public Tabuleiro() {
        Random random = new Random();

        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {

            int posicaoNavio = random.nextInt(0,TAMANHO_TABULEIRO);

            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                this.tabuleiro[i][j] = new Posicao(i, j);
                if(posicaoNavio == j) {
                    this.tabuleiro[i][j].setNavio();
                } else {
                    this.tabuleiro[i][j].setAgua();
                }
            }
        }
    }

    public Posicao[][] getTabuleiro() {
        return this.tabuleiro;
    }

}
