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

    public static boolean verificarGanhador(Tabuleiro tabuleiro){
        int contadorAcertos = 0;

        for(int i = 0; i < tabuleiro.TAMANHO_TABULEIRO; i++){
            for(int j = 0; j < tabuleiro.TAMANHO_TABULEIRO; j++){
                if(tabuleiro.getTabuleiro()[i][j].isTiroCerteiro())
                    contadorAcertos++;
            }
        }

        if(contadorAcertos==tabuleiro.TAMANHO_TABULEIRO){
            return true;
        }
        return false;
    }
}
