package tabuleiro;

public class Jogador {
    public static Tabuleiro atacar(Tabuleiro tabuleiro, String posicao) {
        if(tabuleiro.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isAgua()) {
            tabuleiro.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroAgua();
        } else if (tabuleiro.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isNavio()){
            tabuleiro.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroCerteiro();
        }
        return tabuleiro;
    }
}
