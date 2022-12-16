
import tabuleiro.Tabuleiro;
import utils.Display;
import utils.Input;

import java.awt.*;


public class BatalhaNaval {
    public static Tabuleiro atacar(Tabuleiro tabuleiro1, Tabuleiro tabuleiro2, String posicao) {
        if(tabuleiro1.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isAgua()) {
            tabuleiro2.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroAgua();
        } else if (tabuleiro1.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].isNavio()){
            tabuleiro2.getTabuleiro()[posicao.charAt(0)-'0'][posicao.charAt(1)-'0'].setTiroCerteiro();
        }
        return tabuleiro1;
    }
    public static void main(String[] args) throws InterruptedException {

        Tabuleiro tabuleiroPC = new Tabuleiro();
        Tabuleiro tabuleiroHumano = new Tabuleiro();
        //JogadorPC jogadorPC = new JogadorPC();
        //JogadorHumano jogadorHumano = new JogadorHumano();
        Display display = new Display();

        Input entrada = new Input();
        String jogada = "";

        System.out.println("\n---------------------------------------------");
        System.out.println("|               " + "BATALHA NAVAL               |");

        while (true){ // melhorar condição
            //falta mesclar os tabuleiros
            display.imprimirTabuleiro(tabuleiroHumano);
            //jogador humano começa
            //escolherposicao

            jogada = entrada.escolherPosicaoAtaque();
            System.out.println("------>" + jogada);
//            posicao = escolherPosicaoAtaque(jogadasPessoa); // posição escolhida pelo jogador pessoa
            //atualiza o tabuleiro do PC com o ataque
            Thread.sleep(5000);
            tabuleiroPC = atacar(tabuleiroPC, tabuleiroHumano, jogada);
//
//            mostrarTabuleiro(tabuleiroPessoa);
//            posicao = escolherPosicaoAtaque(jogadasPC); // posição deve ser escolhida aleatoriamente pelo jogador PC
//            System.out.println(posicao);
//            tabuleiroPessoa = atacar(tabuleiroPessoa, posicao);
        }
    }
}

// tabuleiro tem função armazenar navios, imprimir tabuleiro... - construir classe chamada tabuliero
// objeto tabuleiro pra pessoa e objeto tabuleiro para o computador
