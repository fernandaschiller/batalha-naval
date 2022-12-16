package tabuleiro;

import java.util.Random;

public class Tabuleiro {

    public final int TAMANHO_TABULEIRO = 10;

    private final Posicao[][] tabuleiro = new Posicao[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

    public Tabuleiro() {
        Random random = new Random();

//        this.tabuleiro[0][0] = new Posicao(0, 0);
//
//        for (int j = 1; j < TAMANHO_TABULEIRO; j++) {
//            this.tabuleiro[0][j] = new Posicao(0, j);    //" " + (j - 1) + " ";
//            this.tabuleiro[0][j].setColuna();
//        }
//
//        for (int i = 1; i < TAMANHO_TABULEIRO; i++) {
//            this.tabuleiro[i][0] = new Posicao(i, 0);   //;
//            this.tabuleiro[i][0].setLinha();
//        }

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
