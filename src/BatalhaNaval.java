import jogador.JogadorHumano;
import jogador.JogadorPC;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import utils.Display;
import utils.Input;

import java.awt.*;


public class BatalhaNaval {


//    public static Tabuleiro atacar(Tabuleiro tabuleiro, String posicao) {
//        tabuleiro.getTabuleiro()[(int)posicao.charAt(0)][(int)posicao.charAt(1)];
//        if (tabuleiro[posicao.x][posicao.y].equals("   ")) {
//            tabuleiro[posicao.x][posicao.y] = " - ";
//        } else if (tabuleiro[posicao.x][posicao.y].equals(" N ")) {
//            tabuleiro[posicao.x][posicao.y] = " * ";
//        }
//
//        return tabuleiro;
//    }
    public static void main(String[] args) {

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
//            posicao = escolherPosicaoAtaque(jogadasPessoa); // posição escolhida pelo jogador pessoa
            //atualiza o tabuleiro do PC com o ataque
            //tabuleiroPC = atacar(tabuleiroPC, jogada);
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
