package tabuleiro;

public class Jogador {
    public static Tabuleiro atacar(Tabuleiro tabuleiro_atacante, Tabuleiro tabuleiro_atacado, String posicao) {
        if(tabuleiro_atacado.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isAgua()) {
            if(tabuleiro_atacante.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isNavio()){
                tabuleiro_atacante.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroAguaComNavio();
            } else {
                tabuleiro_atacante.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroAgua();
            }
        } else {
            if(tabuleiro_atacante.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isNavio()){
                tabuleiro_atacante.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroCerteiroComNavio();
            } else {
                tabuleiro_atacante.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroCerteiro();
            }
        }
        return tabuleiro_atacante;
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
